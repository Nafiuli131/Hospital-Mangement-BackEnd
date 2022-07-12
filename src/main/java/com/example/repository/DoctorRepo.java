package com.example.repository;

import com.example.model.DoctorSign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DoctorRepo extends JpaRepository<DoctorSign,Long> {

    @Query(value = "select e from DoctorSign e where e.email=?1 and e.password=?2")
    public DoctorSign getDoctorInfo(String email,String password);
}
