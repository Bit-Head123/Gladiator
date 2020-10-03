import { HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClientModule) { }


  login(login : Login) : Promise<User> {
    const params = new HttpParams().append('username', login.username)
    .append('password',login.password)
    .append('role',login.role);
          let result=this.http.get<User>(this.baseUrl+"/login",{params:params}).toPromise();
          return result;
  }
}
