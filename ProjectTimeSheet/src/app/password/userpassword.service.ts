
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Pass } from "./pass";

@Injectable({
    providedIn: 'root'
})
export class userpasswordService {

    private baseUrl = "http://localhost:8081/user/password";

    constructor(private httpClient: HttpClient) { }

    userVerify(pass: Pass): Observable<object> {

        console.log(pass)

        return this.httpClient.post(`${this.baseUrl}`, pass);
    }
}

