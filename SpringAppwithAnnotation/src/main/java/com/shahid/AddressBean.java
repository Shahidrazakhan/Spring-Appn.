package com.shahid;

public class AddressBean {

	private int hno;
	private String cityName;
	private String state;
	
	public AddressBean() {
		super();
		
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressBean [hno=" + hno + ", cityName=" + cityName + ", state=" + state + "]";
	}
	
	
	
	
}
