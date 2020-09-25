import { decimalDigest } from '@angular/compiler/src/i18n/digest';
import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

declare const initMap: any;
@Component({
  selector: 'app-home2',
  templateUrl: './home2.component.html',
  styleUrls: ['./home2.component.css']
})
export class Home2Component implements OnInit {
  latitude: 42.361145;
  longitude: -71.057083 ;
  constructor(private router:Router) { }

  ngOnInit(): void {
    initMap();
  }

  dashboard()
  {
    this.router.navigate(['/dashboard2']);
  }

  openaccount()
  {
    this.router.navigate(['/open-account'])
  }
  
}
