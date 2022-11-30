import { TestBed } from "@angular/core/testing";

import { userpasswordService } from "./userpassword.service";



describe('userpasswordService', () => {

    let service: userpasswordService;

 

    beforeEach(() => {

      TestBed.configureTestingModule({});

      service = TestBed.inject(userpasswordService);

    });

 

    it('should be created', () => {

      expect(service).toBeTruthy();

    });

  });