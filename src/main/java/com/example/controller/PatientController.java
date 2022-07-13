package com.example.controller;

import com.example.model.PatientSign;
import com.example.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PatientController {
    PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @PostMapping("registerPatient")
    public PatientSign savePatient(@RequestBody PatientSign patientSign){
        return patientService.registerPatient(patientSign);
    }
    @GetMapping("findPatient/{email}/{password}")
    public PatientSign findPatient(@PathVariable("email") String email,@PathVariable("password") String password){
        return patientService.findPatient(email,password);
    }
    @GetMapping("findAllPatients")
    public List<PatientSign> findAllPatient(){
        return patientService.findAllPatient();
    }
    @PutMapping("editPatientInfo/{email}/{name}/{age}/{gender}/{password}")
    public PatientSign editPatientInfo(@PathVariable("email") String email,@PathVariable("name") String name,
                                       @PathVariable("age") String age,@PathVariable("gender") String gender,
                                       @PathVariable("password") String password){
        return patientService.editPatientInfo(email, name, age, gender, password);
    }
}
