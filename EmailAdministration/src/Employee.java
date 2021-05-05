
public class Employee {
	String FName;
	String LName;
	String companyName;
	String Email;
	
	public Employee(String FirstName, String LastName, String CompanyName, String Email )
	{
		FName = FirstName;
		LName = LastName;
		companyName = CompanyName;
		this.Email = Email;
	}
	
	public String toString()
	{
		return "First Name: "  + FName  + ", " + "Last Name: " + LName + ", " + "Company Name: "+ companyName + ", " + "Email: " + Email; 
	}
	
}
