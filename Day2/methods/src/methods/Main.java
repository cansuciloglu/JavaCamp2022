package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}
	
	public static void findNumber() {
		int[] numbers = new int[]{1,2,5,7,9,0};
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int enteredNumber = scan.nextInt();
        boolean isNumberAvailable = false;

        for (int number : numbers) {
            if (number == enteredNumber) {
                isNumberAvailable = true;
                break;
            }
        }

        String message = "";
        if (isNumberAvailable) {
        	message = "Number is available " + enteredNumber;
        	sendMessage(message);
        }else {
            sendMessage("Number not available :" + enteredNumber);
        }
	}
	
	public static void sendMessage(String message) {
		System.out.println(message);
	}

}
