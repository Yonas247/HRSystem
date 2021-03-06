import java.util.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class LoginPage {
	
	private String user = "";
	private String password = "";
	private String role ="";
	Scanner scan;
	public LoginPage()
	{
		
		System.out.println("*************************************************");
		System.out.printf("* %25.10s \t\t\t*\n","Welcome To");
		System.out.printf("* %22.10s \t\t\t*\n","RMIT");
		System.out.printf("* %25.10s \t\t\t*\n","HR System");
		System.out.println("*************************************************");
		
		 scan = new Scanner(System.in);
		
		System.out.println("1) Login ");
		System.out.println("2) Forgot Password");
		System.out.println("3) Exit System");
		
		System.out.println("\nPlease enter a number for your selection:");
		int num = 0;
		do
		{
		    try
		    {
		        num = scan.nextInt();
		    }
		    catch (InputMismatchException exception)
		    {
		        System.out.println("Integers only, please.");
		        num = 0;
		        new LoginPage();   
		    }
		    if(num > 3 || num == 0)
		    	System.out.println("\nPlease enter a number that has been specified:");	
		}
		while (num == 0 || num > 3);
		
		if(num == 1)
		{
			System.out.println("*************************************************");
			System.out.printf("* %23.10s \t\t\t*\n","LOGIN");
			System.out.printf("* %22.10s \t\t\t*\n","PAGE");
			System.out.println("*************************************************");
			
			boolean status;
			scan.nextLine();
			do
			{
			System.out.print("Username: ");
			user = scan.next();
			System.out.print("Password: ");
			password = scan.next();
			
			Login logger= new Login();
			
			 status = logger.LoginAs(user,password);
			 role = getRole();

			 
			 if(status == false)
			 {
				 System.out.println("Incorrect credentials!\nTry Again.\n\n");
			 }
			 else
			 {
				 System.out.printf("%25.11s %-6.9s\n\n\n","***Welcome",user+"!***");
				 												
				 
			 }
			}
			while(status == false);
		}
		else if (num == 2)
		{
			System.out.println("Please contact service desk at +61 3 9925 0600 for assistance\n");
			LoginPage log = new LoginPage();
			this.user = log.getUserName();
		}
		else if (num == 3)
		{
			System.out.println("Thank You for using the RMIT HR System");
			System.exit(0);
		}
	}
		public String getUserName()
		{
			return this.user;
		}
		public String getRole()
		{
			return this.role;
		}
	public String getPassword()
		{
			return password;
		}
		
		
	}

