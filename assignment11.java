


// find factorial of n
import java.util.Scanner;
public class assignment11 {

     public static void main(String[] args){
        
        int num;
        System.out.print("Enter a factorial number : ");
        Scanner input= new Scanner(System.in);
        num=input.nextInt();
        

        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
          System.out.println("Factorial is "+fact);



     }
    
}
