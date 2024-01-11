import java.util.Scanner;
public class prime_number{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num=input.nextInt();
       
        int count=0;
        
        if(num==0 || num==1){
            System.out.print(" not prime");
        }
        else{
            for(int i=2; i<num; i++){//0 1 is not prime number
            if(num%i==0){
               count++;
               break;
            }
        }
        }
        if(count==0){
            System.out.print(" Prime ");
        }
        else {
            System.out.print(" Not Prime ");
        }


    }
}
