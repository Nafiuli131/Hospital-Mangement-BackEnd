package com.example.service;

import com.example.model.DoctorSign;
import com.example.repository.DoctorRepo;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    DoctorRepo doctorRepo ;

    public DoctorService(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }
    public DoctorSign saveDoctorInfo(DoctorSign doctorSign){

        return  doctorRepo.save(doctorSign);
    }
}
