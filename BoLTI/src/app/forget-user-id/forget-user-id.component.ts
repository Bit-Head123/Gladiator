import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-forget-user-id',
  templateUrl: './forget-user-id.component.html',
  styleUrls: ['./forget-user-id.component.css']
})
export class ForgetUserIdComponent implements OnInit {
  public otp="";

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

   myFunction():void {
    this.otp="OTP has been sent to your registered mobile number"
    }

    btnClick= function () {
      this.router.navigate(['/login']);
    }

    submitted():void{
      alert("UserId has been sent to you registered email");
      this.router.navigate(['/login']);
    }
}
