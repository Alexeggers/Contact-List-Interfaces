package de.xailabs.interfaces;

public interface ICommandObject {
	
	public void setCommand(String command);
	
	public String getCommand();
	
	public void setSearchParameter(String searchParameter);
	
	public String getSearchParameter();
	
	public void setContact(IContact contact);
	
	public IContact getContact();
	
}
