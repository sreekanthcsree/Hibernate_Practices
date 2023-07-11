package com.qoct;

public class AddressSetters {
	int Hno;
	String city;
	String country;
	
	public void setHno(int hno) {
		Hno = hno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "AddressSetters [Hno=" + Hno + ", city=" + city + ", country=" + country + "]";
	}
	

}
