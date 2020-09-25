import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ForgetPswComponent } from './forget-psw/forget-psw.component';
import { ForgetUserIdComponent } from './forget-user-id/forget-user-id.component';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import { SetpswComponent } from './setpsw/setpsw.component';
import { RegisterComponent } from './register/register.component';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { OpenAccountComponent } from './open-account/open-account.component';
import { ProfileComponent } from './profile/profile.component';
import { Dashboard2Component } from './dashboard/dashboard2.component';
import { AccountStatementsComponent } from './account-statements/account-statements.component';
import { Home2Component } from './home2/home2.component';


const routes: Routes = [
  {path: "home", component: Home2Component},
  {path: '', component: Home2Component, pathMatch: 'full'},
  {path: 'login', component: LoginComponent },
  {path:'register',component:RegisterComponent},
  {path:'forgetpsw' ,component: ForgetPswComponent },
  {path:'forgetuserid' ,component: ForgetUserIdComponent },
  {path:'setpsw',component:SetpswComponent},
  {path:'accountdetails',component:AccountDetailsComponent},
  {path:'accountstatement',component:AccountStatementsComponent},
  {path:'profile',component:ProfileComponent},
  {path:'open-account',component:OpenAccountComponent},
  {path:'dashboard2',component:Dashboard2Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
