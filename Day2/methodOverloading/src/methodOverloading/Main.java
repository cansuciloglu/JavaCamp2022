package methodOverloading;

public class Main {

	public static void main(String[] args) {
		MathematicalOperations mathematicalOperations = new MathematicalOperations();
		System.out.println(mathematicalOperations.add(2,3));
		mathematicalOperations.add(2, 3, 5);

	}

}
