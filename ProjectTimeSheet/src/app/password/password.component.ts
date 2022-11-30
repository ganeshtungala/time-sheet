import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import Swal from 'sweetalert2'
import { Pass } from './pass';
import { userpasswordService } from './userpassword.service';
@Component({
  selector: 'app-password',
  templateUrl: './password.component.html',
  styleUrls: ['./password.component.css']
})
export class PasswordComponent implements OnInit {

  pass:Pass =new Pass();



  constructor(private userpasswordservice: userpasswordService, private router:Router,private fb: FormBuilder) { }
   
 
 
 
  ngOnInit(): void {
   }
   
   confirmpass(){
 
 
 
    console.log(this.pass)
 
 
 
    this.userpasswordservice.userVerify(this.pass).subscribe(data=>{
       this.router.navigate(['/login']);
       Swal.fire({   position: 'top-end',width:"250px", icon: 'success',   title: 'Success',   showConfirmButton: false,   timer: 1500 })
 
 
 
    },error=>Swal.fire({   icon: 'error',   title: 'Oops...',   text: 'Please enter correct verification code' }));
 
 
 
  }
   get password(){
     return this.userpassword.get('password')
     }
     get confirmpassword(){
       return this.userpassword.get('confirmpassword')
       }
 
 
 
  userpassword = new FormGroup({
     password: new FormControl('',[
       Validators.required,
       Validators.pattern('^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$'),
       Validators.minLength(8), Validators.maxLength(10)]),
       confirmpassword: new FormControl('',[
         Validators.required,
         Validators.pattern('^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$'),
         Validators.minLength(8), Validators.maxLength(10)])
   });
 
 
 
 
   ConfirmedValidator(controlName: string, matchingControlName: string) {
     return (formGroup: FormGroup) => {
       const control = formGroup.controls[controlName];
       const matchingControl = formGroup.controls[matchingControlName];
       if (
         matchingControl.errors &&
         !matchingControl.errors['confirmedValidator']
       ) {
         return;
       }
       if (control.value !== matchingControl.value) {
         matchingControl.setErrors({ confirmedValidator: true });
       } else {
         matchingControl.setErrors(null);
       }
     };
   }
}
