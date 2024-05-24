package com.chainsys.model;

public class RegisterPojo {

	String name;
	String password;
	String confirmpassword;
	String email;
	String contactno;
	int id;
	public RegisterPojo() {
		
	}
		
	public RegisterPojo(String name, String password, String confirmpassword, String email, String contactno,int id) {
		super();
		
		this.name = name;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.email = email;
		this.contactno = contactno;
		this.id=id;
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
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RegisterPojo [name=" + name + ", password=" + password + ", confirmpassword=" + confirmpassword
				+ ", email=" + email + ", contactno=" + contactno + ", id=" + id + "]";
	}

	





	
	
	
	
}
