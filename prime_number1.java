// find prime number between input range 
import java.util.Scanner;
public class prime_number1 {
    public static void main(String[] args){
        int num1,num2;
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        num1=input.nextInt();
        
        System.out.print("Enter Second number : ");
        num2=input.nextInt();
      
         int primenumber=0;

            for(int i=num1; i<num2; i++){
                int count=0;
                for(int j=2; j<i; j++){
                    
                    if(i%j==0){
                        count++;
                        break;
                     }    
                }
                if(i==0 || i==1){

                }
                else if(count==0){
                    System.out.println(i);
                    primenumber++;
                }
            }
            System.out.print(" total prime number is : "+primenumber);
        }

    }

