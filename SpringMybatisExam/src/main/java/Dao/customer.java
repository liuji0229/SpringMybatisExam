package Dao;

import java.util.Date;

	
public class customer {
	private int customer_id;
	private int store_id;
	private String first_name;
	private String last_name;
	private String address_id;
	private Date create_date;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getStore_id() {
		return store_id;
	}
	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public customer( int store_id, String first_name,
			String last_name, String address_id, Date create_date) {
		super();
		this.store_id = store_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address_id = address_id;
		this.create_date = create_date;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "customer [customer_id=" + customer_id + ", store_id="
				+ store_id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", address_id=" + address_id + ", create_date="
				+ create_date + "]";
	}



}
