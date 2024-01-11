// Create a pattern like following one if n=4
/*
 1
 1 0
 1 0 1
 1 0 1 0
 */

import java.util.Scanner;
public class assignment15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter line number : ");
        num=input.nextInt();
        
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if(j%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
