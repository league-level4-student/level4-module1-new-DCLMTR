package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	public void addDoctor(Doctor doctor) {
		doctorList.add(doctor);
	}
	public void addPatient(Patient patient) {
		patientList.add(patient);
	}
	public ArrayList<Doctor> getDoctors() {
		return doctorList;
	}
	public ArrayList<Patient> getPatients() {
		return patientList;
	}
	public void assignPatientsToDoctors() throws Exception {
		for(int i = 0; i < patientList.size(); i++) {
			for(int j = 0; j < doctorList.size(); j++) {
				if(doctorList.get(j).getPatients().size()<3) {
					try {
						doctorList.get(j).assignPatient(patientList.get(i));
					} catch (DoctorFullException dfe) {
						// TODO Auto-generated catch block
						dfe.DoctorFull();
					}
					System.out.println(j + " " + doctorList.get(j).getPatients().size());
					break;
				}
			}
		}
	}
}
