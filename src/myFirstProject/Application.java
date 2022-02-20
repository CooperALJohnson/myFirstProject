package myFirstProject;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		/*primitive:
		 * int - integer
		 * double - decimal 
		 * float - precision decimal data
		 * long - int but the numbers can be higher
		 * short - int but less number range?
		 * byte - 8 bits
		 * char - A B C
		 * boolean - T or F
		 * 
		 * Objects -
		 * string - textual data, sentence
		 * 
		 * variable declaration - type,identifier, assignment operator, value, ;
		 *
		 */
		
		double accountBalance =34.67;
		char middleInitial = 'A';
		boolean isHotOutside = false;
		
				
		
		System.out.println(accountBalance);
		System.out.println(isHotOutside);
		System.out.println(middleInitial);
		
		
		/*operator preforms actions on operends
		 * +-*/
		
		int age = 34;
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		System.out.println(age == 68);
		
		age = age + 1;
		System.out.println(age);
		
		
		String firstName = "Cooper";
		String lastName = "Johnson";
		String fullName = firstName + " " + lastName; //concatenation 
		System.out.println(fullName);
		
	}

}
