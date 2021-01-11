package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.model.Patient;
import com.javatpoint.repository.PatientRepository;
import com.javatpoint.repository.PatientRepositoryImpl;

//defining the business logic
@Service
public class PatientService 
{
@Autowired
PatientRepository patientRepository;

@Autowired
PatientRepositoryImpl patientRepositoryimpl;

//getting all student records
public List<Patient> getAllStudent() 
{
List<Patient> patients = new ArrayList<Patient>();
patientRepository.findAll().forEach(patient -> patients.add(patient));
return patients;
}
//getting a specific record
public Patient getPatientById(int id) 
{
return patientRepository.findById(id).get();
}

public List<Patient> getpatientByName(String name) 
{
return patientRepositoryimpl.getpatientByName(name);
}

public void saveOrUpdate(Patient patients) 
{
	patientRepository.save(patients);
}
//deleting a specific record
public void delete(String phonenumber) 
{
	patientRepositoryimpl.deleteByPhoneNumber(phonenumber);
}
}