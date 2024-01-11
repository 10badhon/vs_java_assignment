// 1x3x5x7x......n
import java.util.Scanner;
public class series2 {
    public static void main(String[] args){
          Scanner input=new Scanner(System.in);
          int n;
          System.out.print("Enter n number of series end : ");
          n=input.nextInt();
          int result=1;
          for(int i=1; i<=n; i=i+2){
               
               result=result*i;
               System.out.print(i+" ");
          }
          
          System.out.print("         "+result);
    }
}
