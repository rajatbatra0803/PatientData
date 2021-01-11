package com.javatpoint.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.model.Patient;
import com.javatpoint.service.PatientService;

//creating RestController
@RestController
@CrossOrigin("http://localhost:4200")
public class PatientController 
{
//autowired the StudentService class
@Autowired
PatientService patientService;
//creating a get mapping that retrieves all the students detail from the database
@CrossOrigin("http://localhost:4200")
@GetMapping("/patient")
private List<Patient> getAllStudent() 
{
return patientService.getAllStudent();
}
//creating a get mapping that retrieves the detail of a specific student


@GetMapping("/patient/{name}")
private List<Patient> getpatientByName(@PathVariable("name") String name) 
{
return patientService.getpatientByName(name);
}
//creating a delete mapping that deletes a specific student
@PutMapping("/patient/{phonenumber}")
private void deleteStudent(@PathVariable("phonenumber") String phonenumber) 
{
	patientService.delete(phonenumber);
}
//creating post mapping that post the student detail in the database
@PostMapping("/patient")
private int saveStudent(@RequestBody Patient patient) 
{
	patientService.saveOrUpdate(patient);
return 1;
}
}
