//    Display Array

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        
        int[] arr = new int[n];
        for(int i =0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }

        displayArray(arr,0);
    }




    //E -> da(a,0) => a[0] a[1] a[2] a[3]...........a[n-1]
    //F -> da(a,1) => a[1] a[2] a[3]...........a[n-1]
    //EwF-> da(a,0) => a[0] da(a,1) 


    /*IN TERMS OF N:-
        da(a,v) => a[v] da(a,v+1)  
    */
    public static void displayArray(int[] arr, int v){

      if(v == arr.length){
          return;
      }
       

        System.out.println(arr[v]);  // we manually print our first arr
        displayArray(arr, v+1);       //it promises to print everything from v+1 to the end
        
    }

}