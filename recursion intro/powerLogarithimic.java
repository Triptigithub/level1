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

    // This ques is same as powerlinear wala but here we use better logic.

    //E --> p(2,5)= 2.2.2.2.2 =32
    //F -->  p(2,4)= 2.2.2.2 =16
    //EwF --> p(2,5) = p(2,4) . 2



    /*
    Here for odd:
       x^n = x^n/2 * x^n/2 * x

         for even:
       x^n = x^n/2 * x^n/2        
    
    */





    public static int power(int x, int n){
          if(n==0){
        return 1;
    }
    int xpnb2 = power(x,n/2);
    int xpn = xpnb2 * xpnb2;

    if(n%2 == 1){
        xpn = xpn* x;
    }
    return xpn;




    }

}
