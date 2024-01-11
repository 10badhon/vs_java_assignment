// find the output program
// 0
// 1 2
// 3 4 5
// 6 7 8 9
public class output {
    public static void main(String[] args) {
        int[][] number= new int[4][];// only row size is given
         
        // intializing column size in each row

        number[0]=new int [1];// 1 number row te column thakbe 1 ti
        number[1]=new int [2];// 2 number row te column thakbe 2 ti
        number[2]=new int [3];// 3 number row te column thakbe 3 ti
        number[3]=new int [4];// 4 number tow te column thakbe 4 ti
        
        int k=0;

        for(int row=0; row<4; row++){
            for(int col=0; col<row+1; col++){
                number[row][col]=k;
                k++;
            }
        }

        for(int row=0; row<4; row++){
            for(int col=0; col<row+1; col++){
               System.out.print(" "+number[row][col]);
            }
            System.out.println();
        }
    }
}
