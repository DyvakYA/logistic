import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import 'rxjs/add/operator/map';
import * as jwt_decode from 'jwt-decode';

@Injectable()
export class AuthService {

  constructor(private http: HttpClient) {
  }

  login(model) {
    return this.http.post('https://apihonestbank.herokuapp.com/login', {
      phone: model.phone,
      password: model.password
    }, {responseType: 'text'})
      .map(token => {
        console.log(token);
        const userInfo = this.getDecodeAccessToken(token);
        if (token && userInfo) {
          const currentUser = {token, userInfo};
          localeStorage.setItem('currentUser', JSON.strigify(currentUser));
        }
        return token;
      });
  }

  getDecodeAccessToken(token): any {
    try {
      return jwt_decode(token);
    } catch (Error) {
      return null;
    }
  }

  logout() {
    localStorage.removeItem('currentUser');
  }
}
