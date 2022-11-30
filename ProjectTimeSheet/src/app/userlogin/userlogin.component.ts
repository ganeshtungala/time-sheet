import { Component, OnInit } from '@angular/core';
import { Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { switchAll } from 'rxjs';
import { LoginuserService } from '../loginuser.service';
import { User } from '../user';
import Swal from "sweetalert2";

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  user:User =new User();
  Form: any;
  frombuilders: any;

constructor(private loginuserservice: LoginuserService, private router:Router) { }



  ngOnInit(): void {
      
      
     
  }
  
  loginUser(){

    console.log(this.user)

    this.loginuserservice.loginUser(this.user).subscribe(data=>{
      this.router.navigate(['/dashboard']);
      Swal.fire({   position: 'top-end',width:"250px", icon: 'success',   title: 'Success',   showConfirmButton: false,   timer: 1500 })

    },error=>Swal.fire({   icon: 'error',   title: 'Oops...',   text: 'Entered Username and password is incorrect!' }));

  }

 
}





