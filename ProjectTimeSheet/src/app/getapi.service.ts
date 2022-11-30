import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GetapiService {
  saveData(value: Partial<{ FirstName: string | null; LastName: string | null; TotalExperience: string | null; VamExperience: string | null; SkillSet: string | null; }>) {
    throw new Error('Method not implemented.');
  }

  value: any;

  id!:number;
  
  
  constructor(private http: HttpClient) {
  
    }
  url:any
  
  getAllemployees(){
     this.url = "http://localhost:8081/api/v1/userdetails";
    return this.http.get(this.url);
  }
   saveEmployeeData(data :any){
    this.url = "http://localhost:8081/api/v1/userdetails";
    console.log(data);
    return this.http.post(this.url,data);
   }
  getEmployeeById(id: number){
    return this.http.get(`${this.url}/${id}`);
  }
    // updateStudentData(id:number,data:any){
    //   return this.http.put(`${this.url}/${id}`,data);
    // }
    // deleteTraining(id:any){
    //   return this.http.delete(`${this.url}/${id}`);
    // }
}
