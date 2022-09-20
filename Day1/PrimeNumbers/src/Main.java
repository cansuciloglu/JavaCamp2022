import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean isPrime = true;

        if(number == 1) {
            System.out.println("This number is not a prime number.");
            return;
        }

        if(number < 1) {
            System.out.println("You entered an invalid number.");
        }

        for(int i=2 ; i<number ; i++ ) {
            if(number % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime) {
            System.out.println("This number is prime number.");
        }else {
            System.out.println("This number is not a prime number.");
        }
    }
}
