
import java.util.*;

public class diagonaldisplay{

    public static void main(String[] args) throws Exception {
        
         Scanner scn = new Scanner  (System.in);
         int n = scn.nextInt();


         int [][]arr = new int[n][n];
         for(int i=0; i< arr.length; i++){
             for(int j=0; j<arr[i].length; j++ ){
                 arr[i][j]= scn.nextInt();
             }
         }
             

         for( int g=0; g<arr[0].length; g++){
             for(int i=0, j = g; j < arr[0].length; i++ , j++){
                 System.out.println(arr[i][j]);
             }
         }

































    }



}