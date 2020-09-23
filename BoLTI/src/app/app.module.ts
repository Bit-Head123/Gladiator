import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccountSummaryComponent } from './account-summary/account-summary.component';
import { LoginComponent } from './login/login.component';
import { FundstransferComponent } from './fundstransfer/fundstransfer.component';
import { AddbeneficiaryComponent } from './addbeneficiary/addbeneficiary.component';
import { QuicktransferComponent } from './quicktransfer/quicktransfer.component';
import { TxnsummaryComponent } from './txnsummary/txnsummary.component';
<<<<<<< HEAD
import { HomeComponent } from './home/home.component';
import { NavMenuComponent } from './nav-menu/nav-menu.component';
=======
import { OpenAccountComponent } from './open-account/open-account.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { RegisterComponent } from './register/register.component';
>>>>>>> acc501bf7c64d9b59d01cff09259ba4f43afff38

@NgModule({
  declarations: [
    AppComponent,
    AccountSummaryComponent,
    LoginComponent,
    FundstransferComponent,
    AddbeneficiaryComponent,
    QuicktransferComponent,
    TxnsummaryComponent,
<<<<<<< HEAD
    HomeComponent,
    NavMenuComponent
=======
    OpenAccountComponent,
    DashboardComponent,
    RegisterComponent
>>>>>>> acc501bf7c64d9b59d01cff09259ba4f43afff38
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
