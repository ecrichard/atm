import java.util.Scanner;
public class ATM {
	static Scanner sc = new Scanner(System.in);
	private Account account;
	
	public ATM(Account account) {
		this.account = account;
	}
	int menuNumber = 0;
	
	public void showMenu() {
		System.out.println("	deposit(1)\n 	withdraw(2)\n 	show balance(3)\n 	exit(4)");
	}
	
	public void welcome() {
		System.out.println("Welcome to APCSA ATM, the ATM of choice for the UCVTS community.\n" + "To begin, please enter a valid account number.\n");
		System.out.println("Account # : ");
		long accountNumber = sc.nextLong();
		System.out.println("    PIN # : ");
		int pin = sc.nextInt();
		
		if (validate(accountNumber, pin)) {
			System.out.println("Welcome " + account.getAccountHolder().getName() + "! Select a number from the menu to continue");
			// show menu
			showMenu();
			menuNumber = sc.nextInt();
			while(!(menuNumber == 1 || menuNumber == 2 || menuNumber == 3 || menuNumber == 4)) {
				System.out.println("\nPlease input a valid menu number");
				showMenu();
				menuNumber = sc.nextInt();
			}
			while(menuNumber == 1 || menuNumber == 2 || menuNumber == 3) {
				if(menuNumber == 1) {
					System.out.println("How much money would you like to deposit? \n");
					System.out.print("$ ");
					double amount = sc.nextDouble();
					account.deposit(amount);
				}
				else if(menuNumber == 2) {
					System.out.println("How much money would you like to withdraw? \n ");
					System.out.print("$ ");
					double amount = sc.nextDouble();
					account.withdraw(amount);
				}
				else if(menuNumber == 3) {
					account.balance();
				}
				showMenu();
				menuNumber = sc.nextInt();
				while(!(menuNumber == 1 || menuNumber == 2 || menuNumber == 3 || menuNumber == 4)) {
					System.out.println("\nPlease input a valid menu number");
					showMenu();
					menuNumber = sc.nextInt();
				}
			}
			if(menuNumber == 4) {
				System.out.println("Thank you for using APCSA ATM! Have a nice day!");
			}
		}
	}
	
	public boolean validate(long accountNumber, int pin) {
		if (account.getAccountNumber() == accountNumber) {
			if (account.getAccountHolder().getPin() == pin) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		ATM atm = new ATM(
			new Account(
				20,
				123456789L,
				new User(
					"Ellie",
					1234,
					"123 Main Street, Scotch Plains, NJ 07076",
					312549876L,
					5555555555L
				)
			)
		);
		atm.welcome();
	}
}