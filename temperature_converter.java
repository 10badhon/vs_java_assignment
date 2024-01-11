// celsius to farenheit
import java.util.Scanner;
public class temperature_converter{
    public static void main(String[] args){
        double c,fr;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter celsius : ");
        c=input.nextDouble();

        fr=(1.8*c)+32;// formula ==> Celsius (°C) * 1.8) + 32
        
        System.out.print("farenheit is : "+fr);

    }
}