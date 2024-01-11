/* area of triangle =formula=> 0.5*base*height
  input base and height 
  show taringle area
  
*/
import java.util.Scanner;
public class assignment4{
     public static void main(String[] args){
        int height,base;
        Scanner input = new Scanner(System.in);


        System.out.print("Enter base : ");
        base=input.nextInt();

     
        System.out.print("Enter height : ");
        height=input.nextInt();

       float area=0.5f*base*height;

       System.out.print(" Area is traingle : "+area);

     }

}