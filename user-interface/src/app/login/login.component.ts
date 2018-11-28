import {Component, OnInit} from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';

import {User} from '../entities/user.component';
import {AuthService} from '../service/auth.service';
import {LoaderService} from '../service/loader.service';
import {ErrorService} from '../service/error.service';

@Component({
  templateUrl: './login/login.component.html',
  styleUrls: ['./login/login.component.css']
})
export class LoginComponent implements OnInit {
  mask: any[] = ['+', '3', '8', '0', /[1-9]/, /\d/, ' ', /\d/, /\d/, /\d/, '-', /\d/, /\d/, '-', /\d/, /\d/];
  currentUser;
  path;
  model = new User();

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authService: AuthService,
    private loaderService: LoaderService,
    private errorService: ErrorService
  ) {
  }

  ngOnInit() {
    this.loaderService.execute();
  }

  login() {
    this.loaderService.execute(true);
    this.authService.login(this.model)
      .subscribe(
        data => {
          this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
          if (this.currentUser.userInfo.role = 'USER') {
            this.path = 'user';
          } else {
            this.path = 'admin';
          }
          this.router.navigate(this.path);
          this.loaderService.execute(false);
        },
        error => {
          this.errorService.error(error);
          this.loaderService.execute(false);
        });
  )
}

