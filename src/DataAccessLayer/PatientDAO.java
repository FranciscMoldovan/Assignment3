package DataAccessLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import models.Patient;



public class PatientDAO {

	public PatientDAO(){
	}
	
	private Connection myConn;
	private Statement myStat;
	
	public ArrayList<Patient> getAllPatients() throws SQLException
	{
		ResultSet myRes=null;
		Patient pat = null;
		ArrayList<Patient> patList = new ArrayList<Patient>();
		try{
		 myConn = MySQLConnect.getConnection();
		 myStat = myConn.createStatement();	
		 myRes = myStat.executeQuery("select * from patient");
		 while(myRes.next())
		 {
			 pat=new Patient(myRes.getString("name"),myRes.getString("ID_card_nb"),
					 myRes.getString("SSN"),myRes.getDate("birth_date"), 
					 myRes.getString("address"),myRes.getString("phone"));
			 patList.add(pat);
		 }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return patList;
	}
	public void addPatient(Patient pat) 
	{
		try{
			String nameToAdd=pat.getName();
			String idCardNbToAdd=pat.getIDCardNb();
			String ssnToAdd=pat.getSSN();
			java.sql.Date birthDateToAdd=new java.sql.Date(pat.getBirthDate().getTime());
			String addressToAdd=pat.getAddress();
			String phoneToAdd=pat.getPhone();
			System.out.println("TO BE ADDED:");
		pat.toString();	 
		 myConn = MySQLConnect.getConnection();
		 myStat = myConn.createStatement();		 
		 myStat.executeUpdate("INSERT INTO patient(name,ID_card_nb,SSN,birth_date,address,phone)" +
		 " VALUES ('"+nameToAdd+"','"+idCardNbToAdd+"', '"+ ssnToAdd +"','"+birthDateToAdd+"','"+addressToAdd+"','"+phoneToAdd+"')" );                                             
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updatePatient(Patient oldP, Patient newP)
	{
		try{
			
			String oldName=oldP.getName();
			String oldAddress=oldP.getAddress();
			
			String newName=newP.getName();
			String newAddress=newP.getAddress();
			
			myConn = MySQLConnect.getConnection();
			myStat = myConn.createStatement();	
			myStat.executeUpdate("UPDATE patient SET name='"+newName+"',address='"+newAddress+"'"+" WHERE name='"+oldName+"' and address='"+oldAddress+"'");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void removePatient(Patient remPat)
	{
		try{
			String patSSN = remPat.getSSN();
			String patID = remPat.getIDCardNb();
			
			myConn = MySQLConnect.getConnection();
			myStat = myConn.createStatement();	
			myStat.executeUpdate("DELETE FROM patient WHERE SSN =\'"+patSSN+"\' and ID_card_nb='"+patID+"'" );
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


























