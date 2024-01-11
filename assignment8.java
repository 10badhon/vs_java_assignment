// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fulent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview
import java.util.Scanner;
public class assignment8{
    public static void main(String[] args){
        char ch;
        System.out.print("have you completed your masters? y/n : ");
        Scanner input=new Scanner(System.in);
        ch=input.next().charAt(0);

        char ch1;
        System.out.print("are you fulent in English? y/n : ");
        Scanner input1=new Scanner(System.in);
        ch1=input1.next().charAt(0);


        if(ch=='y' && ch1=='y' ){
            System.out.print("you are eligible to for the job interview");
        }
        else{
            System.out.print(" you are not eligible to for the job interview ");
        }

         
    }
}