package p6;

public class BillPaymentService {
	public boolean payBill(Customer s, int amountToPaid)throws InsufficientFundException{
		if(amountToPaid>s.getBalance()) {
			throw new InsufficientFundException("Low Balance");
		}
		return true;
	}

}