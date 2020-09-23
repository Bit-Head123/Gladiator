import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ForgetPswComponent } from './forget-psw/forget-psw.component';
import { ForgetUserIdComponent } from './forget-user-id/forget-user-id.component';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import { SetpswComponent } from './setpsw/setpsw.component';


const routes: Routes = [
  {path: "home", component: HomeComponent},
  {path: '', component: HomeComponent, pathMatch: 'full'},
  {path: 'login', component: LoginComponent },
  {path:'forgetpsw' ,component: ForgetPswComponent },
  {path:'forgetuserid' ,component: ForgetUserIdComponent },
  {path:'setpsw',component:SetpswComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
