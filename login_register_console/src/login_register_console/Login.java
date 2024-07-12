package login_register_console;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter user name:");
		String userName = sc.nextLine();
		System.out.println("enter pass");
		String pwd=sc.nextLine();
		
		if("ram".equals(userName)&& "password".equals(pwd)) {
			System.out.println("User successfully logged-in.");
		}else {
			System.out.println("Invalid username or password.");
		}
	}

}
