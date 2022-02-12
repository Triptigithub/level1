
import java.util.*;

public class ring {

    public static void main(String[] args) throws Exception {
      

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]twodarr = new int[n][m];
        for(int i=0; i< twodarr.length; i++){
            for(int j=0; j<twodarr[i].length; i++){
                twodarr[i][j]= scn.nextInt();
            }
        }

      int s = scn.nextInt();
      int r = scn.nextInt();


   //shell se onedarray bahr lo
   //onedarray rotate
   //rotated onedarray se wappis shell bhar lo
  
       






     int[] oned = getOnedFromShell(twodarr, s);
     rotate(oned, r);
     fillTwodShellFromOned(oned, twodarr, s);
     display(twodarr);

    }

     public static int[] getOnedFromShell(int[][] twod, int s){


      int rows = twod.length;
      int cols = twod[0].length; 


      int minr = s - 1;
      int minc = s - 1;
      int maxr = rows - s;
      int maxc = cols - s;

      int vwcount = maxr - minr + 1 ;
      int hwcount = maxc - minc + 1 ;
      int sz = 2 * vwcount + 2 * hwcount - 4;
       //here used 2* bcz we have two vertical & horizontal wall. 
       // and -4 bcz corners are counted twice here. 

      int []oned = new int [sz];
      int idx = 0;

      //left wall
      for(int i = minr , j = minc; i<= maxc; i++){
          oned[idx] = twod[i][j];
          idx++;
      }
        minc++;

      //bottom wall
      for(int i = maxr , j = minc; j<=maxc; j++){
         oned[idx] = twod[i][j];
          idx++;
      }
      maxr--;



     // right wall
      for(int i = maxr , j = maxc; i>=minr; i-- ){
         oned[idx] = twod[i][j];
          idx++;
      }
      maxc--;




     //top wall
      for(int i = minr , j = maxc; j>=minc; j--){
         oned[idx] = twod[i][j];
          idx++;
      }
      minr++;


         return oned;
 


     }




     public static void fillTwodShellFromOned(int[] oned, int[][] twod, int s){


      int rows = twod.length;
      int cols = twod[0].length; 


      int minr = s - 1;
      int minc = s - 1;
      int maxr = rows - s;
      int maxc = cols - s;

      
      int idx = 0;

      //left wall
      for(int i = minr , j = minc; i<= maxc; i++){
         twod[i][j] = oned[idx] ;
          idx++;
      }
        minc++;

      //bottom wall
      for(int i = maxr , j = minc; j<=maxc; j++){
         twod[i][j] = oned[idx] ;
          idx++;
      }
      maxr--;



     // right wall
      for(int i = maxr , j = maxc; i>=minr; i-- ){
         twod[i][j] = oned[idx] ;
          idx++;
      }
      maxc--;




     //top wall
      for(int i = minr , j = maxc; j>=minc; j--){
        twod[i][j] = oned[idx] ;      
        idx++;
      }
      minr++;




}
     

    public static void rotate(int[] oned, int r){

      r = r % oned.length;
    if(r < 0){
       r += oned.length;
   }
   reverse(oned , 0 , oned.length - r - 1);
   reverse(oned , oned.length - r, oned.length-1);
   reverse(oned , 0 , oned.length - 1);

    }



    public static void reverse(int[] oned, int li, int ri){
     while(li < ri){
        int temp = oned[li];
        oned[li] = oned[ri];
        oned[ri] =temp;

        li++;
        ri--;

    }
    }



    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}