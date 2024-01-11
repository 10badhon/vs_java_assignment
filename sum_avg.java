import java.util.Scanner;
public class sum_avg {
    public static void main(String[] args){
        int[] number= new int[5];
        
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter 5 number : ");
        for(int i=0; i<number.length; i++){
            number[i]=input.nextInt();
        }
        double sum=0;
        for(int i=0; i<number.length; i++){
            sum+=number[i];
        }
        System.out.println("sum is : "+sum);

        double avg= sum/number.length;
        System.out.println("average is : "+avg);
    }
}
