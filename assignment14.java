// validate user based on username and password
// input username and password until username=="badhon" and password=="12345"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password  match print "welcome to the system"
import java.util.Scanner;
public class assignment14 {
    
     public static void main(String[] args){
      /*    
         String username;
         int password;
        
         String name="badhon";
         int pass=12345;

         do{ 
            Scanner input=new Scanner(System.in);
            System.out.println("Username : ");
            username=input.nextLine();
            
            Scanner in =new Scanner(System.in);
            System.out.println("Password : ");
            password=in.nextInt();

         if(username.equals(name) && password==pass ){
            
            System.out.print("welcome to the system");
            break;
         }
         else{   
               System.out.println(" please try again ");
              }
         
        }while(true);
        
      */



      
        
        String username="badhon";
        int pass=12345;
        String user;
        int pa;
        for(int i=0; i<=10; i++){

            Scanner input=new Scanner(System.in);
            System.out.println("username : ");
            user=input.nextLine();


            Scanner p= new Scanner(System.in);
            System.out.println("password : ");
            pa=p.nextInt();

     
            if(username==user||pa==pass){
                System.out.print("welcome to the system");
                break;
            }
            else{
                System.out.println(" TRY AGAIN ");
            }

        }

      
       






        /* 
        
        String name="badhon";
        int password=12345;
        String na;
        int pass;

        while(true){
        
            Scanner input= new Scanner(System.in);
            System.out.print("Username : ");
            na=input.nextLine();

            Scanner p = new Scanner(System.in);
            System.out.print("Password : ");
            pass=p.nextInt();
            
            if(name==na || password == pass){
                System.out.print("Welcome to the system");
                break;
            }
            else{
                System.out.println("Try again ");
            }
         
        }
    
        */
        
   }

}
