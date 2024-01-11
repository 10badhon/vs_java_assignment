import java.util.Scanner;
public class vowel_consonant {
    public static void main(String[] args){
        char ch;
        System.out.print("Enter a character : ");
        Scanner input= new Scanner(System.in);
        ch=input.next().charAt(0);
        
        if(ch=='a'){
            System.out.print(" vowel ");
        }
        else if(ch=='e'){
            System.out.print(" vowel ");
        }
        else if(ch=='i'){
            System.out.print(" vowel ");
        }
        else if(ch=='o'){
            System.out.print(" vowel ");
        }
        else if(ch=='u'){
            System.out.print(" vowel ");
        }
        else {
            System.out.print(" consonant ");
        }
    }
}
