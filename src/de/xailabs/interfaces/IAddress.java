package de.xailabs.interfaces;

public interface IAddress {
	
	public int getId();
	public String getStreet();
	public String getHousenumber();
	
	public void setId(int id);
	public void setStreet(String street);
	public void setHousenumber(String housenumber);
}
