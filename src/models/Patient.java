package models;

import java.util.Date;

public class Patient {
private String name; 
private String IDCardNb; 
private String SSN; 
private Date birthDate; 
private String address; 

public Patient (String name, 
			String IDCardNb, 
			String SSN,
			Date birthDate, 
			String address)
			{
				this.name=name; 
				this.IDCardNb=IDCardNb; 
				this.SSN=SSN; 
				this.birthDate=birthDate;
				this.address=address; 
			}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getIDCardNb() {
	return IDCardNb;
}

public void setIDCardNb(String iDCardNb) {
	IDCardNb = iDCardNb;
}

public String getSSN() {
	return SSN;
}

public void setSSN(String sSN) {
	SSN = sSN;
}

public Date getBirthDate() {
	return birthDate;
}

public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Patient [name=" + name + ", IDCardNb=" + IDCardNb + ", SSN=" + SSN
			+ ", birthDate=" + birthDate + ", address=" + address + "]";
}
 
}
