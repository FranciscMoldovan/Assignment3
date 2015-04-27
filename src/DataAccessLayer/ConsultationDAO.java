package DataAccessLayer;
import java.sql.Statement;
import java.sql.Timestamp;




import com.mysql.jdbc.Connection;


import models.Consultation;
import models.Patient;
import models.User;

public class ConsultationDAO {
	private Statement myStat;
	private java.sql.Connection myConn;
	public ConsultationDAO(){
	}
	public boolean makeReservation(Patient patient, User doctor, java.util.Date consDate, int consHour){
		//Takes current moment 
		Timestamp currentMoment=new Timestamp(new java.util.Date().getTime());
		 
		System.out.println(currentMoment.toString());
		if (consDate.after(currentMoment)){//reservations can only be made begining with current moment
			if(consHour>currentMoment.getHours()){//only if in the next hours
				
				try{			
				
					 myConn = MySQLConnect.getConnection();
					 myStat = myConn.createStatement();
					 
				Consultation cons = new Consultation(patient,doctor,consDate,consHour,"-empty-");
				System.out.println(cons.toString());
				
				System.out.println(cons.getPatient().toString());
				System.out.println(cons.getDoctor().toString());
				java.sql.Date dateToInsert=new java.sql.Date(cons.getConsultationDate().getTime());
				 myStat.executeUpdate("INSERT INTO consultation(patient_SSN,consultation_date,doctor_SSN,consultation_summary,consultation_hour) VALUES "
				 		+ "('"+cons.getPatient().getSSN()+"','"+dateToInsert+"','"+cons.getDoctor().getSSN()+"','"+cons.getConsultationSummary()+"',"+cons.getConsultationHour()+")");
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		}
		
		return true;
	}
}
