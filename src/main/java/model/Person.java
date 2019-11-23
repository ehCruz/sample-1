package model;

import java.util.Date;

public class Person {

	private String firstName;
	private String lastName;
	private Date dateOfBirthday;

	private Address address;

	public Person() {
		super();
		this.firstName = "Eduardo";
		this.lastName = "Cruz";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(Date dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person INFO firstName: " + firstName + " - lastName: " + lastName;
	}

}
