package com.example.service;

import com.example.model.DoctorSign;
import com.example.repository.DoctorRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {
    DoctorRepo doctorRepo ;

    public DoctorService(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }
    public DoctorSign saveDoctorInfo(DoctorSign doctorSign){

        return  doctorRepo.save(doctorSign);
    }
    public DoctorSign getDoctorInfo(String email,String password){
        return doctorRepo.getDoctorInfo(email, password);
    }
    public List<DoctorSign> getAllDoctorList(){
        List<DoctorSign> doctorSigns = new ArrayList<DoctorSign>();
        doctorRepo.findAll().forEach(e -> doctorSigns.add(e));
        return doctorSigns;

    }
    public DoctorSign editDoctroInfo(String email,String name,String qualification,String specialization,String password){
        DoctorSign findDoctor = doctorRepo.editDoctorInfo(email);
        findDoctor.setD_name(name);
        findDoctor.setSpecified_area(specialization);
        findDoctor.setPassword(password);
        findDoctor.setQualification(qualification);
        return doctorRepo.save(findDoctor);
    }

    public void deleteDoctor(String email){
         DoctorSign doctorSign = doctorRepo.editDoctorInfo(email);
         doctorRepo.delete(doctorSign);
    }
}
