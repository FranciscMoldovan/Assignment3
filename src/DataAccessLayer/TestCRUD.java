package DataAccessLayer;

import java.sql.SQLException;

import models.Patient;
import models.User;

public class TestCRUD {
	public static void main (String[] args) throws SQLException
	{
		PatientDAO pDao=new PatientDAO();
//		ArrayList<Patient> allPatients = pDao.getAllPatients();
//		System.out.println(allPatients.toString());
		Patient p1 = new Patient("ION", "CARD_NB", "SSN", new java.util.Date(), "ADDRESS", "PHONE");
		pDao.addPatient(p1);
		
		User d1 = new User("NumeDoctor", "doctor", "doctor", "doctor", "1800318247070");
//		System.out.println(allPatients.toString());
//		Patient newP1=new Patient(p1.getName(), p1.getIDCardNb(), p1.getSSN(), p1.getBirthDate(), p1.getAddress(), p1.getPhone());
//		newP1.setName("CHANGED_NAME");
//		newP1.setAddress("CHANGED_ADDRESS");
//		pDao.updatePatient(p1, newP1);
//		pDao.removePatient(p1);
//		System.out.println(allPatients.toString());
		ConsultationDAO cDAO = new ConsultationDAO();
		cDAO.makeReservation(p1, d1, new java.util.Date(), 23);
		//Doctor doctor = new Doctor();
	}
}
