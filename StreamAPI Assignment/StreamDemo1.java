package hi;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
	
	static List<Account> allAccounts;
	static Collection<Account> list;

	public static void main(String[] args) {
		  Account a1 = new Account(1,"Sudheer", 5000, "Cochin");
		  Account a2 = new Account(2,"Ramesh", 10500, "Kolkata");
		  Account a3 = new Account(3,"Alex", 200, "Mumbai");
		  Account a4 = new Account(4,"Harsha", 6000, "Jaipur");
		  Account a5 = new Account(5,"Kishore", 4900, "Bangalore");
		  
		  allAccounts = Arrays.asList(a1,a2,a3,a4,a5);
		 
//		  list.stream().forEach(e->System.out.println(e));
		  
		  System.out.println("MinBalance:" +getAccountOfMinBalance());
		  System.out.println("MaxBalance:" +getAccountOfMaxBalance());
	}//end main
	
	public static Account getAccountOfMaxBalance() {
		Comparator<Account> com1 = (a1,a2)->{
			return (a1.getBalance() + a2.getBalance());
		};
		
		Account a = 
				allAccounts.stream().max(com1).get();
		return a;
	}

	public static Account getAccountOfMinBalance()
	{
		
		Comparator<Account> com = (a1,a2)->{
			return (a1.getBalance() - a2.getBalance());
		};
		
		Account a = 
				allAccounts.stream().min(com).get();
		return a;
		
	}
}