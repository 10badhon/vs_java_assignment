import java.util.Scanner;

public class capital_small {
    public static void main(String[] args) {
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.print("enter any letter : ");
        ch=input.next().charAt(0);
       if(ch>='a' && ch<='z'){
        System.out.print(" small ");
       }
       else if(ch>='A' && ch<='Z'){
        System.out.print(" captial ");
       }


    }
}
