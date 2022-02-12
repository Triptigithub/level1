
import java.util.*;

public class spiraldisplay {

    public static void main(String[] args) throws Exception {
      

    Scanner scn = new Scanner (System.in );
     
    int n = scn.nextInt();
    int m= scn.nextInt();

    int[][] arr= new int[n][m];
    for (int i=0; i< arr.length; i++){
        for (int j=0; j<arr[0].length; j++){
            arr[i][j]=scn.nextInt();
        }
    }

      int minr=0;
      int minc=0;
      int maxr=arr.length-1;
      int maxc =arr[0].length-1;
      int total=n*m;
      int count =1;


     while(count <= total){
     //left wall toward bottom-----------------row=min to max;  column=min
     for(int i= minr; i<=maxr && count <= total; i++){
         System.out.println(arr[i][minc]);
         count++;
     }
     minc++; //ye hme box change krne mein help krega and edges ko 2baar print nhi hone dega





     //bottom wall toward right----------------row=max;   column=min to max
     for(int j= minc; j<= maxc && count <= total;j++){
         System.out.println(arr[maxr][j]);
        count++;
     }
     maxr--; //ye hme box change krne mein help krega and edges ko 2baar print nhi hone dega

     





     //right wall toward top------------row=max to min;  column =max
     for(int i= maxr; i>=minr && count <= total; i--){
         System.out.println(arr[i][maxc]);
         count++;
     }
     maxc--; //ye hme box change krne mein help krega and edges ko 2baar print nhi hone dega

 






     //top wall toward left------------row=min;  column =max to min
     for(int j= maxc; j>=minc && count <= total;j--){
         System.out.println(arr[minr][j]);
        count++;
     }
     minr++; //ye hme box change krne mein help krega and edges ko 2baar print nhi hone dega






    }











    }

}