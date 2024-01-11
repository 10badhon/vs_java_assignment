
import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args){
        int num;
        System.out.print("Enter last n number for multiplication table : ");
        Scanner input=new Scanner(System.in);
        
        num=input.nextInt();
        int n;
        System.out.print("Enter n x ? : ");
        n=input.nextInt();

        for(int i=1; i<=n; i++){
            for(int j =1; j<=n; j++){
                System.out.println(i+" x "+j+" = "+j*i);
        }
        System.out.println();
    }
    }
}
