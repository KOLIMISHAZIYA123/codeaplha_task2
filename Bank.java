package Task2;
import java.util.Scanner;
public class Bank {

		int balance = 10000;
		void deposit(int amount) {
			System.out.println("Depositing Rs."+amount);
			balance = balance+amount;
			System.out.println("Amount deposited successfully:)");
		}
		void withdraw(int amount) {
			System.out.println("Withdraw Rs."+amount);
			balance = balance-amount;
			System.out.println("Amount withdrawn successfully:)");
			
		}
		void checkBalance() {
			System.out.println("Your current Balance is Rs."+balance);
		}
		public static void main(String[] args) {
			System.out.println("Welcome to Online Banking Application:)");
			System.out.println("--------------------------------------");
			Scanner scan = new Scanner(System.in);
			Bank obj = new Bank();
			
			while(true) {
			System.out.println("1:Deposit\n2:Withdraw\n3:CheckBalance\n4:Exit");
			System.out.println("Enter choice:");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Amount to be deposited: ");
				int dAmount = scan.nextInt();
				obj.deposit(dAmount);
				break;
			case 2:
				System.out.println("Enter Amount to be withdraw: ");
				int wAmount = scan.nextInt();
				obj.withdraw(wAmount);
				break;	
			case 3:
				obj.checkBalance();
				break;	
			
			case 4:
				System.out.println("Thankyou!!!");
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			
			}
			System.out.println("----------------------------------");
			
		}
		}
	}


