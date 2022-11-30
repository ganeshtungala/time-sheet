import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css']
})
export class NewUserComponent implements OnInit {

  submitted = false;



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

    get f() { return this.userEmail.controls; }



    onSubmit() {

        this.submitted = true;



        // stop here if form is invalid

        if (this.userEmail.invalid) {

            return;

        }



        alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.userEmail.value))

    }

}
