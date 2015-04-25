package DataAccessLayer;

import java.sql.SQLException;
import java.util.ArrayList;

import models.Patient;

public class TestCRUD {
	public static void main (String[] args) throws SQLException
	{
		PatientDAO pDao=new PatientDAO();
		ArrayList<Patient> allPatients = pDao.getAllPatients();
//		System.out.println(allPatients.toString());
		Patient p1 = new Patient("ION", "CARD_NB", "SSN", new java.util.Date(), "ADDRESS", "PHONE");
//		pDao.addPatient(p1);
//		System.out.println(allPatients.toString());
//		Patient newP1=new Patient(p1.getName(), p1.getIDCardNb(), p1.getSSN(), p1.getBirthDate(), p1.getAddress(), p1.getPhone());
//		newP1.setName("CHANGED_NAME");
//		newP1.setAddress("CHANGED_ADDRESS");
//		pDao.updatePatient(p1, newP1);
		pDao.removePatient(p1);
		System.out.println(allPatients.toString());
	}
}
