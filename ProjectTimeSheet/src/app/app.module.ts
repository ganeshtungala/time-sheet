import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';

import { UserloginComponent } from './userlogin/userlogin.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { NewUserComponent } from './new-user/new-user.component';
import { PasswordComponent } from './password/password.component';

import { ProfileComponent } from './profile/profile.component';

import { VerifyComponent } from './verify/verify.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ViewemployeeComponent } from './viewemployee/viewemployee.component';


@NgModule({
  declarations: [
    AppComponent,
    
    UserloginComponent,
         ForgotPasswordComponent,
         NewUserComponent,
         PasswordComponent,
         
         ProfileComponent,
         
         VerifyComponent,
                   DashboardComponent,
                   ViewemployeeComponent,
                  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
