import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers : ");

        double[] numbers = new double[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("maximum number is :" + max);
        System.out.println("minimum number is :" + min);
    }
}