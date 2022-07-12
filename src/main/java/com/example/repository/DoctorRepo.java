package com.example.repository;

import com.example.model.DoctorSign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<DoctorSign,Long> {
}
