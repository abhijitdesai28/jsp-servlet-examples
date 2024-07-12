package login_register_console;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Register register = new Register();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first name:");
		register.setFirstName(scanner.nextLine());
		System.out.println("enter last name:");
		register.setLastName(scanner.nextLine());
		System.out.println("enter user name:");
		register.setUserName(scanner.nextLine());
		System.out.println("enter pwd:");
		register.setPassword(scanner.nextLine());
		System.out.println("enter emailId:");
		register.setEmailId(scanner.nextLine());
		System.out.println("enter phoneno:");
		register.setPhoneNo(scanner.nextLong());
		
		System.out.println(register.toString());
	}

}
