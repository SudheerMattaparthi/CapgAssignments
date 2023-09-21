package re;

import java.util.stream.Stream;

public class FilterDemo {


	public static void main(String[] args) {

		

		Stream.of("ravi","vikas","naresh","phani")

		.filter((t)->{if( t.startsWith("aa")) return true;

		else return false;

		}).forEach((t)->System.out.println(t));

		

		

		

	}

}