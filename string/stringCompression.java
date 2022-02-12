
import java.util.*;

public class stringCompression {

	public static String compression1(String str){
		// write your code here
 
        String ans ="";

        for (int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                //nothing
            }else{
                ans+= str.charAt(i);
            }
        }

        ans+= str.charAt(str.length() - 1); 
/*here we need to put above statement bcz we want to print last element 
too here we cannot change ith loop to print last element bcz it is going
to give us errror  */

		return ans;
	}

	public static String compression2(String str){
		// write your code here

        String anstwo ="";

        int count =1;
        for (int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                anstwo+= str.charAt(i);
                if(count > 1){
                    anstwo+= count;
                    count = 1;
                }
                
            }
        }

        anstwo+= str.charAt(str.length() - 1); 
        if(count > 1){
        anstwo+= count;
      }

		return anstwo;
	}
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}