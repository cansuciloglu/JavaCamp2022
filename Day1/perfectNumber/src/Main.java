import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int total = 0;

        for(int i=1 ; i<number ; i++) {
            if(number % i == 0) {
                total += i;
            }
        }

        if(total == number) {
            System.out.println("This number is the perfect number.");
        }else {
            System.out.println("This number is not a perfect number.");
        }
    }
}
