import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ForgetPswComponent } from './forget-psw/forget-psw.component';
import { ForgetUserIdComponent } from './forget-user-id/forget-user-id.component';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import { SetpswComponent } from './setpsw/setpsw.component';
import {DashboardComponent} from'./dashboard/dashboard.component';
import { RegisterComponent } from './register/register.component';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { OpenAccountComponent } from './open-account/open-account.component';


const routes: Routes = [
  {path: "home", component: HomeComponent},
  {path: '', component: HomeComponent, pathMatch: 'full'},
  {path: 'login', component: LoginComponent },
  {path:'register',component:RegisterComponent},
  {path:'forgetpsw' ,component: ForgetPswComponent },
  {path:'forgetuserid' ,component: ForgetUserIdComponent },
  {path:'setpsw',component:SetpswComponent},
  {path:'accountdetails',component:AccountDetailsComponent},
  {path:'open-account',component:OpenAccountComponent},
  {path:'dashboard',component:DashboardComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
