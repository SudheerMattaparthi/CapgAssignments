package p6;

public class Customer {
	private String userName;
	private int balance;
	public Customer(String userName, int balance) throws InvalidUserNameException,InvalidBalanceAmountException {
		super();
		if(userName == null || userName.length()<3) {
			throw new InvalidUserNameException("Invalid Username");
		}
		if(balance<0) {
			throw new InvalidBalanceAmountException("Invalid Balance");
		}
		this.userName = userName;
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public boolean makePayment(int amount)throws InvalidBalanceAmountException, InsufficientFundException{
		BillPaymentService bp=new BillPaymentService();
		boolean paymentStatus=bp.payBill(this,amount);
		if(paymentStatus) {
			balance-=amount;
			return true;
		}
		return false;
	}
	


}
