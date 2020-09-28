package com.PatientCRUDHw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PatientCRUDHw.models.Patient;
import com.PatientCRUDHw.services.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService patientService;
	
	//CREATE
	@PostMapping("api/v1/createPatient")
	public String createPatient(@RequestBody Patient patient) {
		return patientService.createPatient(patient);
	}
	
	//GET ALL
	@GetMapping("api/v1/getAllPatients")
	public List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
	
	//UPDATE
	@PutMapping("api/v1/updatePatient/{patientId}")
	public String updatePatient(@PathVariable("patientId") Integer id, @RequestBody Patient patient) {
		return patientService.updatePatient(id, patient);
	}
	
	//DELETE
	@DeleteMapping("api/v1/deletePatient/{patientId}")
	public String deletePatient(@PathVariable("patientId") Integer id) {
		return patientService.deletePatient(id);
	}
	
	//GET WITH SPECIFIC ILLNESS
	@GetMapping("api/v1/getAllWithIllness/{illness}")
	public List<String> getAllWithIllness(@PathVariable("illness") String illness){
		return patientService.getPatientWithIllness(illness);
	}
	

}
