// ****
// ***
// **
// *
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter line number : ");
        int num;
        num=input.nextInt();

        for(int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
