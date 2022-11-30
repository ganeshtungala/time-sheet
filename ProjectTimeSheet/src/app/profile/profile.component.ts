import { Component, OnInit } from '@angular/core';
import { FormGroup} from '@angular/forms';
import { FormControl } from '@angular/forms';
import { GetapiService } from '../getapi.service';

@Component({
  selector: 'app-profile',
  templateUrl:'./profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  router: any;

  constructor(private addemployee: GetapiService){}
  addEmployee=new FormGroup({
    // id:new FormControl(''),
    firstName:new FormControl(''),
    lastName: new FormControl(''),
    totalExperience: new FormControl(''),
    vamExperience: new FormControl(''),
    skillSet: new FormControl('')

});
  ngOnInit(): void {
    
  }
  SaveData(){
    
    
    
    this.addemployee.saveEmployeeData(this.addEmployee.value).subscribe(( res :any)=>{
      console.log(res);
      alert("submit Successfully")
      this.router.navigate(['/viewemployee']);
       
    });
  }

}
