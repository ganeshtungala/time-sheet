import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-viewemployee',
  templateUrl: './viewemployee.component.html',
  styleUrls: ['./viewemployee.component.css']
})
export class ViewemployeeComponent implements OnInit {

  id!: number;
 
  
  constructor(private addemployee: ApiService){}
  addEmployee=new FormGroup({
    firstName:new FormControl(''),
    lastName: new FormControl(''),
    skillSet: new FormControl(''),
    totalExperience: new FormControl(''),
    vamExperience:new FormControl('')
  });
    ngOnInit(): void {
     this.SaveData();
    }
    Details:any;
    SaveData(){
      // console.log(this.addTraining.value)
      this.addemployee.getAllemployees().subscribe(( result: any )=>{
        console.log(result);
        this.Details=result;
      });
    }
}
