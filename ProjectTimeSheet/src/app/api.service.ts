import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http : HttpClient) { }



  url:any

getAllemployees(){
   this.url = "http://localhost:8081/api/v1/userdetails";
  return this.http.get(this.url);
}
 saveTrainingData(data :any){
  console.log(data);
  return this.http.post(this.url,data);
 }
getTrainingById(id: number){
  return this.http.get('$(this.url)/${id}');
}

}
