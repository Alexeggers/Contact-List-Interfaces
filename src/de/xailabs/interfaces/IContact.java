package de.xailabs.interfaces;


public interface IContact {
	
	public void setName(String name);
	public void setPhonenumber(String phonenumber);
	public void setNotes(String notes);
	public void setId(int id);
	public void setVersion(int version);
	public void setAddress(IAddress address);
	public void incrementVersion();
	
	public String getName();
	public String getPhonenumber();
	public String getNotes();
	public int getId();
	public int getVersion();
	public IAddress getAddress();
}
