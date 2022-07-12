package com.example.controller;

import com.example.model.DoctorSign;
import com.example.service.DoctorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DoctorSignController {
    DoctorService doctorService ;

    public DoctorSignController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }
    @PostMapping("saveDoctor")
    public DoctorSign saveDoctor(@RequestBody DoctorSign doctorSign){
        return doctorService.saveDoctorInfo(doctorSign);
    }
}
