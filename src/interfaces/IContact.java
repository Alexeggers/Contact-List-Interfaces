package interfaces;

public interface IContact {
	
	public void setName(String name);
	public void setPhonenumber(String phonenumber);
	public void setNotes(String notes);
	public void setId(int id);
	
	public String getName();
	public String getPhonenumber();
	public String getNotes();
	public int getId();
}