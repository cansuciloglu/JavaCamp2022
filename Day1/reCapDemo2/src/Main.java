public class Main {
    public static void main(String[] args) {
        double[] myList = {1 , 2 , 3.9 , 5.2 , 9 , 15.7};
        double total = 0;
        double max  = myList[0];

        for (double number : myList) {
            if(max < number) {
                max = number;
            }
            total += number;
        }

        System.out.println("Total: " + total);
        System.out.println("The largest number is: " + max);
    }
}
