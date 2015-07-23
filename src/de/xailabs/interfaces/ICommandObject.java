package de.xailabs.interfaces;

public interface ICommandObject {
	
	public void setCommand(String command);
	
	public String getCommand();
	
	public void setContact(IContact contact);
	
	public IContact getContact();
	
}
