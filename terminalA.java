import java.util.Scanner;
public class terminalA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double balance = 0.0;
		double deposit = 0.0;
		int option = 0;
		double withdraw = 0.0;
		
		System.out.print("1: Make a deposit\n");
		System.out.print("2: Make a withdraw\n");
		System.out.print("3: Check account balance\n");
		System.out.print("4: Exit\n");
		option = sc.nextInt();
		
		while(true) { //Deposit
		if(option == 1) {
			while(option ==1) {
			System.out.print("How much would you like to deposit? ");
			deposit = sc.nextDouble();
			balance = balance + deposit;
			System.out.println("Deposit ammount: $" + deposit);
			
			System.out.print("1: Make a deposit\n");
			System.out.print("2: Make a withdraw\n");
			System.out.print("3: Check account balance\n");
			System.out.print("4: Exit\n");
			option = sc.nextInt();
			}
		}
	
		if(option == 2) { //Withdraw
			while(option ==2) {
			System.out.print("How much would you like to withdraw? ");
			withdraw = sc.nextDouble();
         if(balance>=withdraw){
			balance = balance - withdraw;
         System.out.println("Wthdraw ammount: $" + withdraw);
         }
         else
			System.out.println("Sorry, you do not have sufficient funds");
         
         System.out.println();
         
			System.out.print("1: Make a deposit\n");
			System.out.print("2: Make a withdraw\n");
			System.out.print("3: Check account balance\n");
			System.out.print("4: Exit\n");
			option = sc.nextInt();
			}
		}
		
		if(option == 3) {  //Check the balance
			while(option ==3) {
				System.out.println("Balance: "+ balance);
			System.out.print("1: Make a deposit\n");
			System.out.print("2: Make a withdraw\n");
			System.out.print("3: Check account balance\n");
			System.out.print("4: Exit\n");
			option = sc.nextInt();
			}
		}
	
		if(option == 4) { //End program
			break;
		}
		}
	}
			
}



