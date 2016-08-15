package Dao;

public class country {
	private int country_id;
	private String country;
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public country(int country_id, String country) {
		super();
		this.country_id = country_id;
		this.country = country;
	}
	public country() {
		super();
		// TODO Auto-generated constructor stub
	}

}
