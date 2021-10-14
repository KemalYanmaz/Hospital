package com.hospital.business.concretes;

import com.hospital.business.abstracts.PatientService;

public class PatientManager implements PatientService {

    private static final PatientManager INSTANCE = new PatientManager();

    public static PatientManager getInstance(){
        return INSTANCE;
    }
}
