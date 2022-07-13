package com.example.controller;

import com.example.model.DoctorSign;
import com.example.service.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("allDoctorList")
    public List<DoctorSign> getAllDoctorInfo(){
        return doctorService.getAllDoctorList();
    }

    @PutMapping("editDoctorInfo/{email}/{name}/{qualification}/{specialization}/{password}")
    public DoctorSign editDoctorInfo(@PathVariable("email") String email,
                                     @PathVariable("name") String name,
                                     @PathVariable("qualification") String qualification,
                                     @PathVariable("specialization") String specialization,
                                     @PathVariable("password") String password){
        return doctorService.editDoctroInfo(email, name, qualification, specialization, password);
    }
    @DeleteMapping("deleteDoctor/{email}")
    public String deleteDoctor(@PathVariable("email") String email){
        doctorService.deleteDoctor(email);
        return "Doctor deleted successfully";
    }
}
