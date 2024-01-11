// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english
import java.util.Scanner;
public class assignment9 {
    public static void main(String[] args){
        int choice;
        System.out.print("enter 1 for bangali language\nenter 2 for hindi language\nenter 3 for urdu language : ");
        Scanner input=new Scanner(System.in);
        choice=input.nextInt();

        switch(choice){
            
            case 1:
             System.out.print("selected languge is bengali");
             break;
            
             case 2:
             System.out.print("Selected language is hindi");
             break;

             case 3:
             System.out.print("selected language is urdu ");
             break;

             default:
             System.out.print(" Invalid ");


        }
    }
}
