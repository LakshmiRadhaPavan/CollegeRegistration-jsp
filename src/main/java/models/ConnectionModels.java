package models;

import javax.management.loading.PrivateClassLoader;

public class ConnectionModels {
		
	private int Id;
	private String Name;
	private String Email;
	private long PhoneNum;
	private String Branch;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public ConnectionModels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConnectionModels(int id, String name, String email, long phoneNum, String branch) {
		super();
		Id = id;
		Name = name;
		Email = email;
		PhoneNum = phoneNum;
		Branch = branch;
	}
		
	
		
}
