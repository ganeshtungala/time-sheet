import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { userVerifyService } from './userVerify.service';
import { Verifycode } from './verifycode';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-verify',
  templateUrl: './verify.component.html',
  styleUrls: ['./verify.component.css']
})
export class VerifyComponent implements OnInit {

  verifycode:Verifycode =new Verifycode();



  constructor(private userVerifyservice: userVerifyService, private router:Router) { }



  ngOnInit(): void {

  }

  verify(){



    console.log(this.verifycode)



    this.userVerifyservice.userVerify(this.verifycode).subscribe(data=>{

      this.router.navigate(['/password']);

      Swal.fire({   position: 'top-end',width:"250px", icon: 'success',   title: 'Success',   showConfirmButton: false,   timer: 1500 })



    },error=>Swal.fire({   icon: 'error',   title: 'Oops...',   text: 'Please enter correct verification code' }));



  }

  get Verify(){

    return this.userVerify.get('Verify')

    }

  userVerify = new FormGroup({

    Verify: new FormControl('',[

      Validators.required,

      Validators.pattern("^[0-9]*$"),

      Validators.minLength(6), Validators.maxLength(6)])

    });
}
