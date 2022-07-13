package com.example.service;

import com.example.model.PatientSign;
import com.example.repository.PatientRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
   PatientRepo patientRepo;

    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public PatientSign registerPatient(PatientSign patientSign){
        return patientRepo.save(patientSign);
    }

    public PatientSign findPatient(String email,String passowrd){
        return patientRepo.signPatient(email, passowrd);
    }

    public List<PatientSign> findAllPatient(){
        List<PatientSign> patientSigns = new ArrayList<>();
        patientRepo.findAll().forEach(e->patientSigns.add(e));
        return patientSigns;
    }
    public  PatientSign editPatientInfo(String email,String name,String age,String gender,String password){
        PatientSign findPatient=patientRepo.editPatientDetails(email);
        findPatient.setPateint_name(name);
        findPatient.setPatient_gender(gender);
        findPatient.setPatient_age(age);
        findPatient.setPatient_pass(password);
        return patientRepo.save(findPatient);
    }

    public void deletePatient(String email){
        PatientSign deletePatient= patientRepo.editPatientDetails(email);
        patientRepo.delete(deletePatient);
    }
}
