package com.Ebrain;

public class Customer {
	private static Customer instance;
	private String name;
	private String email;
	private int id;
	private long phoneNumber;
	private String address;

	private Customer() {
		name = "Kumar";
		email = "mnandhakumar175@gmail.com";
		id = 34;
		phoneNumber = 768767522;
		address = "no.8,Pondas avenue ,ashok nagar, Thanjavur";

	}

	public static Customer getInstance() {
		if (instance == null) {
			instance = new Customer();
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

}
