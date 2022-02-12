
import java.util.*;

public class Saddleprice {

    public static void main(String[] args) throws Exception {
        // write your code here


       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();

       int [][]arr = new int[n][n];
       for(int i = 0; i<arr.length; i++){
           for(int j =0; j<arr[0].length; j++){
               arr[i][j] = scn.nextInt();
           }
       }




     
          for(int i=0; i<arr.length; i++){




           int min = arr[i][0];
           int psj=0;
           for(int j= 1; j<arr[0].length; j++){
              if(arr[i][j]  < min){
                  min = arr[i][j];
                 psj = j;
                }
          }



        //confirm if it is max in the col--> true saddke point 

        boolean isSaddle = true;
        for(int k= 0; k< arr.length; k++){
            if(arr[k][psj] > min){
                isSaddle = false;
                break;

            }
        }


       if(isSaddle ==true){
       System.out.println(min);
       return;


       }

    }


    System.out.println("Invalid input");

}
}