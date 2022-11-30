import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { NewUserComponent } from './new-user/new-user.component';
import { PasswordComponent } from './password/password.component';
import { ProfileComponent } from './profile/profile.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { VerifyComponent } from './verify/verify.component';
import { ViewemployeeComponent } from './viewemployee/viewemployee.component';

const routes: Routes = [
  {path:'', redirectTo:'userlogin', pathMatch:'full'},
  
  {path:'userlogin',component:UserloginComponent},
  {path:'forgot-password',component:ForgotPasswordComponent},
  {path:'new-user',component:NewUserComponent},
  {path:'password',component:PasswordComponent},
 
  {path:'profile',component:ProfileComponent},

  {path:'verify',component:VerifyComponent},
  {path:'dashboard',component:DashboardComponent},

 {path:'viewemployee',component:ViewemployeeComponent} 
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
