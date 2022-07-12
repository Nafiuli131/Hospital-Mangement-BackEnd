package com.example.controller;

import com.example.model.DoctorSign;
import com.example.service.DoctorService;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("getDoctorInfo/{email}/{password}")
    public DoctorSign getDoctorInfo(@PathVariable("email") String email,@PathVariable("password") String password){
        return doctorService.getDoctorInfo(email, password);
    }
}
