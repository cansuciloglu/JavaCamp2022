import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a first number");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        System.out.println("Enter a second number");
        Scanner scan2 = new Scanner(System.in);
        int number2 = scan2.nextInt();

        System.out.println("Enter a third number");
        Scanner scan3 = new Scanner(System.in);
        int number3 = scan3.nextInt();

        int largestNumber = number1;

        if(largestNumber < number2) {
            largestNumber = number2;
        }
        if(largestNumber < number3) {
            largestNumber = number3;
        }
        System.out.println("The largest number is: " + largestNumber);
    }
}
