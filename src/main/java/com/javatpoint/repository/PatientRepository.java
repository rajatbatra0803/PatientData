package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>
{
}
