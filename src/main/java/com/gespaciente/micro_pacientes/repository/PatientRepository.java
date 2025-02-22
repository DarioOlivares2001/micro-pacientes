package com.gespaciente.micro_pacientes.repository;

import com.gespaciente.micro_pacientes.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
