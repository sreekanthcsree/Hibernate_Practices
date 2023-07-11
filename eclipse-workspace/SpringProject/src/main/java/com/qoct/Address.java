package com.qoct;

public class Address {
	int hno;
	String city;
	String state;
	public Address(int hno, String city, String state) {
		this.hno = hno;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
}
