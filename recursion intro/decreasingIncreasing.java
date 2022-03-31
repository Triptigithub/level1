import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){
            return;
        }


        //pdi(n)=n(n-1)......1.....(n-1)n


        System.out.println(n);//pre-area
        pdi(n-1);//recursive call
        System.out.println(n);//post-area



        
    }

}