import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FundstransferComponent } from './fundstransfer/fundstransfer.component';
import { AddbeneficiaryComponent } from './addbeneficiary/addbeneficiary.component';
import { QuicktransferComponent } from './quicktransfer/quicktransfer.component';
import { TxnsummaryComponent } from './txnsummary/txnsummary.component';
import { HomeComponent } from './home/home.component';
import { NavMenuComponent } from './nav-menu/nav-menu.component';
import { SetpswComponent } from './setpsw/setpsw.component';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { AccountStatementsComponent } from './account-statements/account-statements.component';
import { OpenAccountComponent } from '../app/open-account/open-account.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    FundstransferComponent,
    AddbeneficiaryComponent,
    QuicktransferComponent,
    TxnsummaryComponent,
    HomeComponent,
    NavMenuComponent,
    SetpswComponent,
    AccountDetailsComponent,
    AccountStatementsComponent,
    OpenAccountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
