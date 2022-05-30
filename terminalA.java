import java.util.Scanner;
public class terminalA {

	public static void main(String[] args) {
		try (Scanner menu = new Scanner(System.in)) {
			double checking = 0.0;
			double savings = 0.0;
			double deposit = 0.0;
			int option1 = 0; //For menu items
			int option2 = 0; //For accounts
			double withdraw = 0.0;
			
			System.out.print("1: Make a deposit\n");
			System.out.print("2: Make a withdraw\n");
			System.out.print("3: Check account balance\n");
			System.out.print("4: Exit\n");
			option1 = menu.nextInt();
			
			Scanner account = new Scanner(System.in);
			while(true) { //Deposit
				if(option1 == 1) {
					System.out.print("0: Checking\n"); //Deposit menu with two account options
					System.out.print("9: Savings\n");
					option2 = account.nextInt();
					while(option1 ==1) {
						System.out.print("How much would you like to deposit? ");
						deposit = menu.nextDouble();
						if(option2 == 0){
							checking = checking + deposit;
						}
						if(option2 == 9){
							savings = savings + deposit;
						}
						System.out.println("Deposit ammount: $" + deposit);

						System.out.print("1: Make a deposit\n"); //Menu is always printed after every transaction until exit
						System.out.print("2: Make a withdraw\n");
						System.out.print("3: Check account balance\n");
						System.out.print("4: Exit\n");
						option1 = menu.nextInt();
				}
			}

			if(option1 == 2) { //Withdraw
				while(option1 == 2) {
					System.out.print("0: Checking\n"); //Withdraw menu with two account options
					System.out.print("9: Savings\n");
					option2 = account.nextInt();
					System.out.print("How much would you like to withdraw? ");
					withdraw = menu.nextDouble();
					if(option2 == 0 && checking >= withdraw){ //Withdraws from checking if account is above $0.00
						checking = checking - withdraw;
						System.out.println("Wthdraw ammount: $" + withdraw);
					}
					else if(option2 == 0 && checking <= withdraw){ //Display message if not enough money in checking account
						System.out.println("Sorry, you do not have sufficient funds in your checking");
					}
					if(option2 == 9 && savings >= withdraw){ //Withdraw from savings if account is above $0.00
						savings = savings - withdraw;
						System.out.println("Wthdraw ammount: $" + withdraw);
					}
					else if(option2 == 9 && savings <= withdraw){ //Display message if not enough money in savings account
						System.out.println("Sorry, you do not have sufficient funds in your savings");
					}
			 System.out.println();
			 
				System.out.print("1: Make a deposit\n"); //Menu is always printed after every transaction until exit
				System.out.print("2: Make a withdraw\n");
				System.out.print("3: Check account balance\n");
				System.out.print("4: Exit\n");
				option1 = menu.nextInt();
				}
			}
			
			if(option1 == 3) {  //Check the balance
				while(option1 ==3) {
					System.out.print("0: Checking\n"); //Check balance menu with two account options
					System.out.print("9: Savings\n");
					option2 = account.nextInt();
					if(option2 == 0){
						System.out.println("Balance: "+ checking); //Displays checking account balance 
					}
					if(option2 == 9){
						System.out.println("Balance: " + savings); //Displays savings account balance 
					}
					System.out.print("1: Make a deposit\n"); //Menu is always printed after every transaction until exit
					System.out.print("2: Make a withdraw\n");
					System.out.print("3: Check account balance\n");
					System.out.print("4: Exit\n");
					option1 = menu.nextInt();
				}
			}

			if(option1 == 4) { //End program
				break;
			}
			}
		}
	}
			
}



