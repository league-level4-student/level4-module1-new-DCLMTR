package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor{
	ArrayList<Patient> patients = new ArrayList<Patient>();
	public void assignPatient(Patient patient) throws Exception{	
		if(patients.size()>=3) {
			throw new DoctorFullException();
		} else {
			patients.add(patient);
		}
	}
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	public void doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
	public boolean getMakesHouseCalls() {
		return false;
	}
	public boolean getPerformsSurgery() {
		return false;
	}
}
class GeneralPractitioner extends Doctor {
	public boolean getMakesHouseCalls() {
		return true;
	}
}
class Surgeon extends Doctor {
	public boolean getPerformsSurgery() {
		return true;
	}
}
class DoctorFullException extends Exception {
	public void DoctorFull() {
		System.out.println("exception");
	}
}