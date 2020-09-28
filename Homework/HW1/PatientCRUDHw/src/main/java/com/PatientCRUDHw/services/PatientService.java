package com.PatientCRUDHw.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PatientCRUDHw.models.Patient;
import com.PatientCRUDHw.repositories.PatientRepository;

@Service
public class PatientService {
//	
//	GET operation should bring list of Patients.   (api/v1/patients)
//	POST  operation should add a Patient data.    (api/vi/patients)
//	UPDATE operation should update the Patient's information based on id (api/vi/patients/{patientId})
//	DELETE operation should delete Patient based on id
//	Bonus: Another GET operation  should get the names of all the patients that have the illness sent in the url.  (api/v1/patients/{illness})
//	
	@Autowired
	PatientRepository patientRepository;
	
	public PatientService() {
		
	}
	
	List<Patient> patientList = new ArrayList<>();
	
	//CREATE
	public String createPatient(Patient patient) {
		patientRepository.save(patient);
		return patient.getName() + " was successfully created!";
	}
	
	//GET ALL
	public List<Patient> getAllPatients(){
		return (List<Patient>) patientRepository.findAll();
	}
	
	//UPDATE
	public String updatePatient(Integer id, Patient patient) {
		patientRepository.save(patient);
		return patient.getName() + " was successfully updated!";
	}
	
	//DELETE
	public String deletePatient(Integer id) {
		patientRepository.deleteById(id);
		return "This patient was successfully deleted.";
	}
	
	//GET PATIENTS WITH SPECIFIC ILLNESS
	public List<String> getPatientWithIllness(String illness){
		List<String> illnessList = new ArrayList<>();
		for(int i=0; i<patientList.size();i++) {
			if(patientList.get(i).getIllness().equals(illness)) {
				illnessList.add(patientList.get(i).getName());
			}
		}
		return illnessList;
	}
	

}
