import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String [] args)
	{
		Scanner keyb = new Scanner(System.in);
		String FirstName = null;
		String LastName = null;
		String companyName = null;
		String Email = null;
		ArrayList<Employee> employees= new ArrayList<Employee>(); 
		while(true) {
			System.out.println("Would you like to enter more employees, enter 1 for yes and 0 for no: ");
			int userinput = keyb.nextInt();
			
			if(userinput == 1) {
				System.out.println("Enter First Name: ");
				FirstName = keyb.next();
				System.out.println("Enter Last Name: ");
				LastName = keyb.next();
				System.out.println("Enter Company Name: ");
				companyName = keyb.next();
				System.out.println("Your generated email is: ");
				Email =  LastName + FirstName + "@" + companyName.toLowerCase() + ".com";
				
				Employee e1= new Employee(FirstName, LastName, companyName, Email);
				
				employees.add(e1);
				System.out.println(" ");
				
			}
			else {
				break;
			}
		}
			System.out.println("All the employees: ");
		for(int i = 0; i < employees.size(); i++) {
		
			System.out.println(employees.get(i));
		}
		
		
		
	}

}
