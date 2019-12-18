package com.jhart;

public class couse {
	private String couse_id;
	private String couse_name;
	private String couse_book;
	public String getCouse_id() {
		return couse_id;
	}
	public void setCouse_id(String couse_id) {
		this.couse_id = couse_id;
	}
	public couse() {};
	public couse(String couse_name, String couse_book) {
		super();
		this.couse_name = couse_name;
		this.couse_book = couse_book;
	}
	public String getCouse_name() {
		return couse_name;
	}
	public void setCouse_name(String couse_name) {
		this.couse_name = couse_name;
	}
	public String getCouse_book() {
		return couse_book;
	}
	public void setCouse_book(String couse_book) {
		this.couse_book = couse_book;
	}
}
