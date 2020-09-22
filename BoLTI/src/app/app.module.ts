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

@NgModule({
  declarations: [
    AppComponent,
    AccountSummaryComponent,
    LoginComponent,
    FundstransferComponent,
    AddbeneficiaryComponent,
    QuicktransferComponent,
    TxnsummaryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
