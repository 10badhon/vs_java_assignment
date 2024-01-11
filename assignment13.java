// find nth fibonacci number
import java.util.Scanner;
public class assignment13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
         
            int num;
            System.out.print(" enter nth number : ");
            num=input.nextInt();

            int fibo=0;
            int n1=0,n2=1;
            
            System.out.print(n1+" "+n2+" ");

            for(int i=3; i<=num; i++){
                fibo=n1+n2;
                System.out.print(fibo+" ");
                n1=n2;
                n2=fibo;
                
            }
            System.out.println();
            System.out.print(num+"th number of fibonacci is : "+fibo);
    }
}