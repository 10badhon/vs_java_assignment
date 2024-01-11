// palindrome formula = (if we reversed the input number 
// and input number is same so to reversed number so its a palindrome number )
// input==(input_reversed) => palindrome number
import java.util.Scanner;
public class palindrome_number{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("enter all digits : ");
        num=input.nextInt();
        
        int rem=0;
        int sum=0;
        int i=num;
        while(i!=0){
            rem=i%10;
            sum= sum*10+rem;
            i/=10;
        }
        System.out.println(" reversed : "+sum);
        if(num==sum){
            System.out.print(" Its a palindrome number ");
        }
        else{
            System.out.print(" Its not a palindrome number ");
        }
        
    }
}
