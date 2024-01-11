// print sum of odd numbers from m-n
import java.util.Scanner;
public class assignment12 {
    public static void main(String [] args){
        int num,num1;
        Scanner input= new Scanner(System.in);
        
        System.out.print("enter 1st number : ");
        num=input.nextInt();

        System.out.print("enter 2nd number : ");
        num1=input.nextInt();
        
        int sum=0;
        for(int i=num; i<=num1; i++){
          
            if(i%2!=0){
               sum+=i;
               System.out.println(i);
            }
        }
        System.out.println("Odd sum is :"+sum);


    }
}
