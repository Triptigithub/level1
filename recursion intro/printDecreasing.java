import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

      //EXPECTATION:pd(n)= n n-1 n-2 ..... 1
      //FAITH: pd(n-1)= n-1 n-2 ..... 1
      //E WEDS F: pd(n)= n pd(n-1) 



    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        //E WEDS F: pd(n)= n pd(n-1) 
        System.out.println(n);
        printDecreasing(n-1);
        
    }

}