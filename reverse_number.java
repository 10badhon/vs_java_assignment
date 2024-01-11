// input 123
// output 321
import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("enter all digits : ");
        num=input.nextInt();
        
        int rem=0;
        int sum=0;
        while(num!=0){
            rem=num%10;
            sum= sum*10+rem;
            num/=10;
        }
        System.out.print(" reversed : "+sum);
        
    }
}
