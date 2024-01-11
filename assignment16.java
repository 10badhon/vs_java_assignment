
/*
 * Assigment 16 (Print the day name)
 * declare an array of weekdays 
 * User will give a day number you have to print the equivalent day name
 * 
 * Example 1
 * input-> Enter day number (1-7) : 1
 * output-> Monday
 * 
 * Example 2
 * input-> Enter day number (1-7) : 3
 * output-> Wednesday
 */
import java.util.Scanner;

public class assignment16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        System.out.print("Enter day number (1-7) : ");
        int num;
        num = input.nextInt();

        for(int i=0; i<weekdays.length; i++){
            if(num==i+1){
                System.out.print(weekdays[i]);
            }
        }

    }
}
