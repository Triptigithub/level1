import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        pzz(n);

    }



    //E -> pzz(3) = 3 211121112 3 211121112 3
    //f -> pzz(2) = 2 111 2 111 2
    //EwF -> pzz(3) = 3 pzz(2) 3 pzz(2) 3
    // For n --> pzz(n) = n pzz(n-1) n pzz(n-1) n 




    public static void pzz(int n){

        if(n == 0){
            return;

        }
        


        System.out.print(n + " ");          //pre-area 
        pzz(n-1);                           //first call
        System.out.print(n + " ");          //in-area
        pzz(n-1);                           //second call
        System.out.print(n + " ");          //post-area


    }

}