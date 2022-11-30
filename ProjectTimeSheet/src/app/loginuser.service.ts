import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';


@Injectable({
  providedIn: 'root'
})
export class LoginuserService {

  private baseUrl="http://localhost:8081/user/login";

  constructor(private httpClient: HttpClient) { }

loginUser(user: User):Observable<object>{

    console.log(user)

    return this.httpClient.post(`${this.baseUrl}`,user);
  }










//  constructor(private http:HttpClient){}

//  getUserData(email: any,password: any){
//   return this.http.('http://localhot:8081/user/'+email+'/'+password);
//  }
}
