import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {ReactiveFormsModule} from '@angular/forms';

import ApplicationComponent from '../components/application/application.component';
import CarouselComponent from '../components/carousel/carousel.component';
import FooterComponent from '../components/footer/footer.component';
import NavbarComponent from '../components/navbar/navbar.component';
import ProductItemComponent from '../components/product-item/product-item.component';
import SearchComponent from '../components/search/search.component';
import HomeComponent from '../components/home/home.component';
import {ProductDetailComponent} from '../components/product-detail/product-detail.component';
import {HashLocationStrategy, LocationStrategy} from '@angular/common';
import {ProductService} from '../services/product.service';
// import StarsComponent from '../components/stars/stars.component';
// impost {ProductService} from '../service/product.service';


// import {MessageComponent} from './messages/messages.component';
// import {AppRoutingModule} from './app-routing.module';
// import {from} from 'rxjs';
// import {UsersComponent} from './users/users.component';

@NgModule({
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'products/:productId', component: ProductDetailComponent}
    ])
  ],
  declarations: [
    ApplicationComponent,
    FooterComponent,
    NavbarComponent,
    SearchComponent,
    CarouselComponent,
    HomeComponent,
    ProductDetailComponent,
    ProductItemComponent
    // MessageComponent,
    // UsersComponent,
  ],
  providers:    [ProductService,
    {provide: LocationStrategy, useClass: HashLocationStrategy}],
  bootstrap: [ApplicationComponent]
})

export class AppModule {
}
