package p6;

import java.util.Scanner;

public class ExceptionHandlingPracticeTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter Customer Name:");
		String customerName = sc.nextLine();
		System.out.println("Enter the InitialAmount:");
		int initialAmount = sc.nextInt();
		Customer c= new Customer(customerName,initialAmount);
		System.out.println("Enter the Amount to Pay:");
		int amount = sc.nextInt();
			
			boolean paymentStatus=c.makePayment(amount);
			if(paymentStatus) {
				System.out.println("payment Successfull &&  Remaining Amount: " +c.getBalance());
						           
			}
			else {
				System.out.println("payment failed");
			}
		} catch (InvalidUserNameException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(InvalidBalanceAmountException e) {
			e.printStackTrace();
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}

}