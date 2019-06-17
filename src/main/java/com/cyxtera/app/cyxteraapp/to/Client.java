package com.cyxtera.app.cyxteraapp.to;

import java.util.Calendar;

public class Client {
	
	private String sharedKey;
	private String businessID;
	private String email;
	private String phone;
	private Calendar dateAdd;
	private String enrolledQty;
	private Integer maxDevices;
	private Calendar lastConnection;
	private String status;
	
	public String getSharedKey() {
		return sharedKey;
	}
	public void setSharedKey(String sharedKey) {
		this.sharedKey = sharedKey;
	}
	public String getBusinessID() {
		return businessID;
	}
	public void setBusinessID(String businessID) {
		this.businessID = businessID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Calendar getDateAdd() {
		return dateAdd;
	}
	public void setDateAdd(Calendar dateAdd) {
		this.dateAdd = dateAdd;
	}
	public String getEnrolledQty() {
		return enrolledQty;
	}
	public void setEnrolledQty(String enrolledQty) {
		this.enrolledQty = enrolledQty;
	}
	public Integer getMaxDevices() {
		return maxDevices;
	}
	public void setMaxDevices(Integer maxDevices) {
		this.maxDevices = maxDevices;
	}
	public Calendar getLastConnection() {
		return lastConnection;
	}
	public void setLastConnection(Calendar lastConnection) {
		this.lastConnection = lastConnection;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ClientTO [sharedKey=" + sharedKey + ", businessID=" + businessID + ", email=" + email + ", phone="
				+ phone + ", enrolledQty=" + enrolledQty + ", maxDevices=" + maxDevices
				+ ", status=" + status + "]";
	}
	
}
