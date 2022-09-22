package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		MathematicalOperations mathematicalOperations = new MathematicalOperations();
		int conclusion1 = mathematicalOperations.add(1, 2);
		int conclusion2 = mathematicalOperations.divide(9, 3);
		int conclusion3 = mathematicalOperations.multiply(5, 3);
		int conclusion4 = mathematicalOperations.subtract(8, 3);
		
		int[] conclusions = {conclusion1,conclusion2,conclusion3,conclusion4};
		for(int conclusion:conclusions) {
			System.out.println(conclusion);
		}
				
		

	}

}
