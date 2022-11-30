import { TestBed } from "@angular/core/testing";

import { VerifycodeService } from "./verifycode.service";



describe('VerifycodeService', () => {

    let service: VerifycodeService;

 

    beforeEach(() => {

      TestBed.configureTestingModule({});

      service = TestBed.inject(VerifycodeService);

    });

 

    it('should be created', () => {

      expect(service).toBeTruthy();

    });

  });