import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int t1id = scn.nextInt();
    int t2id = scn.nextInt();
    int t3id = scn.nextInt();
    toh(n, t1id, t2id ,t3id);


    }



//E -> toh(3, a, b, c) => it is supposed to print valid(rule-following)instuctions to move 3 discs from a to b using c
/*F -> 1. toh(2, a, c, b) =>it will print valid instuctions to move 2 discs from a to c using b
       2. toh(2, c, b, a) =>it will print valid instuctions to move 2 discs from c to b using a
*/



    public static void toh(int n, int t1id, int t2id, int t3id){

        if (n==0){
            return;
        }
        toh(n-1, t1id, t3id,t2id );  //now t1 = 3rd disc, t2 = empty, t3 = 1st and 2nd disc 
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");  // now t1 = empty, t2 = 3rd disc, t3 = 1st and 2nd disc  
        toh(n-1, t3id, t2id,t1id);   // now t1 = empty, t2 = all 3 disc, t3 = empty
        
    }

}