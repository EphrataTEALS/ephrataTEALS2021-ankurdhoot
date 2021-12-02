import java.util.*;

public class SumExample {
    // Write a program to calculate the sum of integers read in from a Scanner.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want to add?");
        int numbersToAdd = s.nextInt();

        // Modify the program to compute the sum of all even numbers
        // the the user inputs.
        int sum = 0;
        for (int i = 0; i < numbersToAdd; i++) {
            System.out.println("What is the number that you'd like to add?");
            int value = s.nextInt();
            if (value % 2 == 0) {
                sum = sum + value;
            }
        }

        // double average = sum / (double) numbersToAdd;
        // System.out.println("The sum is " + sum);
        // System.out.println("The average is " + average);
        System.out.println("The sum of even numbers is " + sum);
        s.close();
    }
}
