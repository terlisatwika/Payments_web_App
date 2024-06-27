package com.pack.dto;

import java.util.Date;

public class User {
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private Date dateOfBirth;
	private String address;
	private String password;
	private double curWalBalance;
	private int userId;
		
	public int getUserId() {
		return userId;
	}
	public int setUserId(int userId) {
		return this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getCurWalBalance() {
		return curWalBalance;
	}
	public void setCurWalBalance(double curWalBalance) {
		this.curWalBalance = curWalBalance;
	}
	
}
