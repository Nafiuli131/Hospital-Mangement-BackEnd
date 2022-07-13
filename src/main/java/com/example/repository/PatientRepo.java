package com.example.repository;

import com.example.model.PatientSign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientRepo extends JpaRepository<PatientSign,Long> {
    @Query(value = "select e from PatientSign e where e.patient_email=?1 and e.patient_pass=?2")
    public PatientSign signPatient(String email,String password);
    @Query(value = "select e from PatientSign  e where e.patient_email=?1")
    public PatientSign editPatientDetails(String email);
}
