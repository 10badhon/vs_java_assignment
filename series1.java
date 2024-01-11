// 1+3+5+7+.....n
import java.util.Scanner;
public class series1 {
    public static void main(String[] args){
        System.out.print("enter n number for series end : ");
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
                System.out.print(" "+i);
            }
        }
    }
}
