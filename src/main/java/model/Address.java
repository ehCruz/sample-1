package model;

public class Address {

	private String city;
	private String state;
	private String country;

	public Address() {
		this.city = "Curitiba";
		this.state = "Parana";
		this.country = "Brazil";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address INFO: " + this.city + " - " + this.state + " - " + this.country;
	}
}
