// *
// **
// ***
// ****

import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
           System.out.print("Enter line numbers : ");
           Scanner input= new Scanner(System.in);
           int num;
           num=input.nextInt();

           for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
           }
    }
}
