
import java.util.*;

public class palindrom {

	public static void main(String[] args){
		//write your code here
        
        Scanner scn = new Scanner (System.in);
        String s = scn.nextLine();
        for(int i= 0; i < s.length(); i++){
            for(int j =i + 1 ; j<=s.length(); j++){
                String sub = s.substring(i,j);



                boolean isPalindrom = IsPalindrom(sub);
                if(isPalindrom == true){
                  System.out.println(sub);
                }
            }
        }
    }  

    public static boolean IsPalindrom(String sub){
        boolean flag = true;


        int left = 0;
        int right = sub.length() - 1;
        while (left < right){
            char chleft = sub.charAt(left);
            char chright = sub.charAt(right);
            if(chleft != chright){
                flag = false;
                break;

            }

            left++;
            right--;
       
        }

        return flag;
    }
      
}


	