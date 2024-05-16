package com.chainsys;

public class Register {
	String name;
	String password;
	String confirmpassword;
	String email;
	int contactno;
	public Register() {
		
	}
		
	public Register(String name, String password, String confirmpassword, String email, int contactno) {
		super();
		this.name = name;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.email = email;
		this.contactno = contactno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", password=" + password + ", confirmpassword=" + confirmpassword + ", email="
				+ email + ", contactno=" + contactno + "]";
	}
	
}
