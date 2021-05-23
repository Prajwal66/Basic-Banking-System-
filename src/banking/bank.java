	package banking;
	import java.util.Scanner;
	public class bank {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Account a1 = new Account();
			Scanner sc = new Scanner(System.in);
			while (true)
			{
				
			
			System.out.println("------------------ONLINE BANKING CONSOLE BASED PROJECT-----------------------");
			System.out.println("1.INSERT\n2.DEPOSITE\n3.WITHDRAW\n4.DISPLAY DETAILS\n5.EXIT FROM SYSTEM");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				a1.insert(6229,3500,50);
				break;
			case 2:
				System.out.println("Enter amount to deposite");
				int n = sc.nextInt();
				a1.deposite(n);
				break;
				
			case 3:
				System.out.println("Enter amount to deposite");
				int n1 = sc.nextInt();
				a1.withdraw(n1);
				break;
			case 4:
				System.out.println("\t DETAILS");
				a1.display();
				break;
			case 5:
				System.exit(1);
				break;
			default:
				break;
			}
		}
		}
	}
