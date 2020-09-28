package com.PatientCRUDHw.repositories;

import org.springframework.data.repository.CrudRepository;

import com.PatientCRUDHw.models.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
