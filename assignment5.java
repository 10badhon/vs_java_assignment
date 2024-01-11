/*
 * valid voter program using if,else 
 * step 1: ask for a person age
 * step 2: if age is equal or more than 18 than print valid voter
 * step 3: else print invalid voter
 */
import java.util.Scanner;
public class assignment5{
    public static void main(String[] args){
        int age;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your age : ");
        age=input.nextInt();
        
        if(age>=18){
            System.out.print(" Valid voter : "+age );
        }
        else{
            System.out.print(" Invalid voter : "+age );
        }

    }
}