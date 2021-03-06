package models;

import java.util.Date;

public class Consultation {
	private Patient patient;
	private User doctor; 
	private Date consultationDate; 
	private int consultationHour;
	private String consultationSummary;
	
	
	public Consultation(
			Patient patient,
			User doctor,
			Date consultationDate,
			int consultationHour,
			String consultationSummary
			)
	{
		this.patient=patient;
		this.doctor=doctor; 
		this.consultationDate=consultationDate;
		this.consultationHour=consultationHour;
		this.consultationSummary=consultationSummary;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public User getDoctor() {
		return doctor;
	}

	public void setDoctor(User doctor) {
		this.doctor = doctor;
	}

	public Date getConsultationDate() {
		return consultationDate;
	}

	public void setConsultationDate(Date consultationDate) {
		this.consultationDate = consultationDate;
	}

	
	
	public int getConsultationHour() {
		return consultationHour;
	}

	public void setConsultationHour(int consultationHour) {
		this.consultationHour = consultationHour;
	}

	public String getConsultationSummary() {
		return consultationSummary;
	}

	public void setConsultationSummary(String consultationSummary) {
		this.consultationSummary = consultationSummary;
	}

	@Override
	public String toString() {
		return "Consultation [patient=" + patient + ", doctor=" + doctor
				+ ", consultationDate=" + consultationDate
				+ ", consultationHour=" + consultationHour
				+ ", consultationSummary=" + consultationSummary + "]";
	}

	
	
	 
	
}
