import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent implements OnInit {

  constructor() { }



  ngOnInit(): void {

   

  }

  get Emailaddress(){

    return this.userEmail.get('Emailaddress')

    }

  title = 'new-user';

  userEmail = new FormGroup({

    Emailaddress: new FormControl('',[

      Validators.required,

      Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")])

    });

}
