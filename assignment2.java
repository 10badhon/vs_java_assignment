/*
 * Assignment-2 (User Input)
 * step 1: create a class called assignment 2
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */



 
import java.util.Scanner;

public class assignment2{

    public static void main(String[] args){
       int id;
       String title;
       float price;
       String description;
       String category;


       System.out.print("Enter id : ");
       Scanner a = new Scanner(System.in);
       id=a.nextInt();

       System.out.print("Enter tile : ");
       Scanner b = new Scanner(System.in);
       title=b.nextLine();

       System.out.print("Enter price : ");
       Scanner c = new Scanner(System.in);
       price=c.nextFloat();
       
       System.out.print("Enter description : ");
       Scanner d = new Scanner(System.in);
       description=d.nextLine();
       
       System.out.print("Enter category : ");
       Scanner e = new Scanner(System.in);
       category=e.nextLine();

       System.out.println("Id is : "+id);
       System.out.println("Title is : "+title);
       System.out.println("Price is :"+price);
       System.out.println("Description is : "+description);
       System.out.println("Category is : "+category);

    }

}