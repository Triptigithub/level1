import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fn = factorial(n);
        System.out.println(fn);
    }


        //EXPECTATION --> f(5)=5.4.3.2.1 
        //FAITH --> f(4)=4.3.2.1 
        //EwF --> f(5)= 5.f(4) 
 

    public static int factorial(int n){
           if(n==0){
               return 1;
           }
            int fnm1= factorial(n-1); //ya call krne k baad recieve krna jaruri h
            int fn = n * fnm1;  //f(n) = n.f(n-1)


         


        return fn;
    }

}