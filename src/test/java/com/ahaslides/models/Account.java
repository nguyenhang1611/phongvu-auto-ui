package com.ahaslides.models;


public class Account {


	public static AccountBuilder emailAdress(String email, String...randomString) {
		return new AccountBuilder(email, randomString);
	}
	

	public static class AccountBuilder{
		private String email;
		private String password;
		private String fullname;
		
		public AccountBuilder(String email, String...randomString) {
			if (randomString.length>0){
				this.email = String.format("%s_%s", randomString[0], email);
			}
			else {
				this.email = email;
			}
		}
		
		public AccountBuilder withPassword(String password) {
			this.password = password;
			return this;
		}
		
		public AccountBuilder withFullname(String fullname) {
			this.fullname = fullname;
			return this;
		}

		public Account build() {
			return new Account(email, password, fullname);
		}	
	}
	
	private String email;

	private String password;

	private String fullname;

	public Account(String email, String password, String fullname) {
		this.email = email;
		this.password = password;
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

}
