import java.util.Scanner;
import java.text.DecimalFormat;
public class Account{
	static Scanner sc = new Scanner(System.in);
	private double balance;
	private long accountNumber;
	private User accountHolder;
	DecimalFormat df2 = new DecimalFormat( "#,###,###,##0.00" );
	
	public Account(double balance, long accountNumber, User accountHolder){
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public User getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(User accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void withdraw(double amount) {
		while(!(amount <= balance)) {
			System.out.println("Cannot withdraw more money than in the account. Please input a amount less than or equal to " + balance);
			System.out.print("$ ");
			amount = sc.nextDouble();
		}
		while(amount < 0) {
			System.out.println("please input a positive deposit amount");
			System.out.print("$ ");
			amount = sc.nextDouble();
		}
		balance = balance - amount;
		System.out.println("Your new balance is: $" + df2.format(balance));
	}
	public void deposit(double amount) {
		while(amount < 0) {
			System.out.println("please input a positive deposit amount");
			System.out.print("$ ");
			amount = sc.nextDouble();
		}
		balance = balance + amount;
		System.out.println("Your new balance is: $" + df2.format(balance));
	}
	public void balance() {
		System.out.println("Your new balance is: $" + df2.format(balance));
	}
	
}