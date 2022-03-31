import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xpn = power(x,n);
        System.out.println(xpn);
    }


    //E --> p(2,5)= 2.2.2.2.2 =32
    //F -->  p(2,4)= 2.2.2.2 =16
    //EwF --> p(2,5) = p(2,4) . 2

    //so p(2,4) = p(x,n-1)
    // p(x,n) = p(x,n-1).x





    public static int power(int x, int n){
       if(n==0){
        return 1;
    }
      int xpnm1= power(x,n-1);
      int xpn = xpnm1 * x;



      return xpn;

       

}

}