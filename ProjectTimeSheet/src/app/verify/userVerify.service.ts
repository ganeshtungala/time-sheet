import { HttpClient } from "@angular/common/http";

import { Injectable } from "@angular/core";

import { Observable } from "rxjs";

import { Verifycode } from "./verifycode";




@Injectable({

    providedIn: 'root'

  })

  export class userVerifyService {

 

    private baseUrl="http://localhost:8081/user/verify";

 

    constructor(private httpClient: HttpClient) { }

 

  userVerify(verifycode: Verifycode):Observable<object>{

 

      console.log(verifycode)

 

      return this.httpClient.post(`${this.baseUrl}`,verifycode);

    }

}