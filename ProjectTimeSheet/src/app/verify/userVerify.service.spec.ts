import { TestBed } from "@angular/core/testing";

import { userVerifyService } from "./userVerify.service";





describe('userVerifyService', () => {

    let service: userVerifyService;

 

    beforeEach(() => {

      TestBed.configureTestingModule({});

      service = TestBed.inject(userVerifyService);

    });

 

    it('should be created', () => {

      expect(service).toBeTruthy();

    });

  });

 