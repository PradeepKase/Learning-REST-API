package com.masai.beans;

import java.util.Objects;

public class Address {
private String city;
private String state;
private int pin;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public Address(String city, String state, int pin) {
	super();
	this.city = city;
	this.state = state;
	this.pin = pin;
}
@Override
public int hashCode() {
	return Objects.hash(city, pin, state);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	return Objects.equals(city, other.city) && pin == other.pin && Objects.equals(state, other.state);
}


}
