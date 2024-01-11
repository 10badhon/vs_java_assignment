import java.util.Scanner;
public class even_odd{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num;
        num=input.nextInt();
         
        if(num%2==0){
            System.out.print(" Even ");
        }
        else{
            System.out.print(" Odd ");
        }
    }
}