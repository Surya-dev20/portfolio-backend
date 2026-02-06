package com.example.backend_port.dto;

public class Dto {
	private Long id;
	private String name;
	private String mail;
	private String number;
	public Dto(Long id, String name, String mail, String number) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.number = number;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	
}
