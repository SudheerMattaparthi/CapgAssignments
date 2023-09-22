package m1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 

public class RunnerCode {
	static List<Policy> allPolicies;
	static List<Account1> allAccounts;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Policy p1 = new Policy(1234, "Bajaj", 3500, 100000);
		Policy p2 = new Policy(2341, "HDFC-Life", 4000, 250000);
		Policy p3 = new Policy(3412, "SBI-Life", 2000, 430000);
		Policy p4 = new Policy(4123, "Bajaj", 1500, 87000);
		Policy p5 = new Policy(4321, "Tata AIG", 7000, 450000);

		allPolicies = Arrays.asList(p1,p2,p3,p4,p5);


		 Account1 a1 = new Account1(1,"Sudheer", 5000, "Cochin",p1);
		  Account1 a2 = new Account1(2,"Ramesh", 3500, "Kolkata",null);
		  Account1 a3 = new Account1(3,"Alex", 30000, "Mumbai",p2);
		  Account1 a4 = new Account1(4,"Harsha", 2600, "Jaipur", p3);
		  Account1 a5 = new Account1(5,"Kishore", 2900, "Bangalore", null);
		  Account1 a6 = new Account1(6,"Mani", 6000,"Solapur", p5);

		allAccounts = Arrays.asList(a1,a2,a3,a4,a5,a6);

		List<Account1> list = filterAndModify();
		list.stream().forEach((a)->System.out.println(a));

	}

	public static List<Account1> filterAndModify() {
		List<Account1> modifiedAccount = allAccounts.stream().filter((account)->{
			return account.getPolicy() != null;
		}).map((account)->{
			Policy policy = account.getPolicy();
			int premiumAmount = policy.getPremiumAmount();
			int currentBalance = account.getBalance();
			int updatedBalance = currentBalance - premiumAmount;
			account.setBalance(updatedBalance);
			return account;
		}).collect(Collectors.toList());

		return modifiedAccount;
	}

}