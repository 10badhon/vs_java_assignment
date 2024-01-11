// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover
import java.util.Scanner;
public class assignment7 {
    public static void main(String[] args){
        char ch;
        System.out.print("Do you love java? : ");
        Scanner input=new Scanner(System.in);
        ch=input.next().charAt(0);
        if(ch=='y' || ch =='Y'){
            System.out.print(" you are a java lover ");
        }
        else if(ch=='n' || ch=='N'){
            System.out.print(" you are not a java lover ");
        }
    }
}
