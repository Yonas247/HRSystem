
public class Approver extends User{
	
	
	public Approver(String name, String id, String phone,char gender, String role)
	{
		this.name =name;
		this.ID=id;
		this.phone=phone;
		this.role=role;
		this.gender=gender;
	};
	
	String statusOfRequest ;
	
	public void setUserName(String un)
	{
		this.un = un;
	}
	public String getUserName()
	{
		return un;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public String getRole()
	{
		return this.role;
	}
	public void viewProfile(String user, String role)
	{
		
		System.out.println("**************************************************");
		System.out.printf("*%24.10s \tUser: %s\t *\n","PROFILE",user);
		System.out.printf("* %24.10s \tRole: %-11.11s*\n","SETTINGS",role);
		System.out.println("**************************************************");
		System.out.printf("Name: %-20.20s Role: %-20.20s \n",name,role);
		System.out.printf("ID: %-20.20s UserName: %-20.20s \n",ID,user);
		System.out.printf("Phone: %-20.20s Gender: %-20.20s \n",phone,gender);
		System.out.println("\n17) Edit Profile ");
		System.out.println("4) Back to Main Menu");
		
		
	}
	public void applyPosition(String user, String role)
	{
		System.out.println("**************************************************");
		System.out.printf("*  %24.10s \tUser: %s\t *\n","APPLY FOR",user);
		System.out.printf("* %24.10s \tRole: %-11.11s*\n","POSITION",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		
	}
	public void ApproveStaffRequest(String user, String role)
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","APPROVE",user);
		System.out.printf("* %26.14s \tRole: %-11.11s*\n","STAFF REQUESTS",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		
	}
	public void ApproveTimeStamps(String user, String role)
	{
		System.out.println("**************************************************");
		System.out.printf("* %24.10s \tUser: %s\t *\n","APPROVE",user);
		System.out.printf("* %26.14s \tRole: %-11.11s*\n","TIME STAMPS",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		
	}
	public void EditProfile(String user, String role)
	{
		System.out.println("**************************************************");
		System.out.printf("* %22.10s \tUser: %s\t *\n","EDIT",user);
		System.out.printf("* %24.14s \tRole: %-11.11s*\n","PROFILE",role);
		System.out.println("**************************************************");
		System.out.print("Your current Name: "+name+".\nPlease enter your new Name : ");
		name=scan.nextLine();
		System.out.print("\nYour current ID: "+ID+".\nPlease enter your new ID : ");
		ID=scan.nextLine();
		System.out.print("\nYour current Phone: "+phone+".\nPlease enter your new Phone : ");
		phone=scan.nextLine();
		System.out.print("\nYour current Role: "+role+".\nPlease enter your new Role : ");
		role=scan.nextLine();
		System.out.print("\nYour current Gender: "+gender+".\nPlease enter your new Gender : ");
		gender=scan.next().charAt(0);
		
		System.out.println("\n\t***SUCESSFULLY CHANGED DETAILS!***\n");
		
		System.out.println("4) Back to Main Menu");
		
	}
	public void viewApprovalRequests(String user, String role)
	{
		System.out.println("**************************************************");
		System.out.printf("* %22.10s \tUser: %s\t *\n","VIEW",user);
		System.out.printf("* %26.14s \tRole: %-11.11s*\n","ALL REQUESTS",role);
		System.out.println("**************************************************");
		System.out.println("4) Back to Main Menu");
		
	}
}
