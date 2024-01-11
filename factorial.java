import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("enter n number for factorial : ");
        int n;
        n=input.nextInt();
        int fact=1;
        for(int i=n; i>=1; i--){
         fact=fact*i;
         System.out.println(" "+i);
        }
        System.out.print(n+" number of factorial is : "+fact);
    }
}
