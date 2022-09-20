import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        if (isNumberAvailable) {
            System.out.println("Number is available");
        }else {
            System.out.println("Number not available");
        }
    }
}
