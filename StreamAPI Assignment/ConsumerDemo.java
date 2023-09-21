package re;

import java.util.function.Consumer;

 

public class ConsumerDemo {

     

	public static void main(String[] args) {

		Consumer<String> con = (t)-> {

			t+="add on";

			System.out.println(t);

		};

		

		String [] str = {"ravi","vikas","naresh","phani"};	

		

		for(String i : str) {

			con.accept(i);

		}

}

}