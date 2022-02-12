import java.util.*;


public class interning {
    
    public static void main(String[] args)throws Exception{

        //INTERNING

        String s1 = "hello";
        String s2 = "hello";//here interning going to take place
        String s3 = new String("hello");//here interning going to take place
        String s4 = s1;//reference copy

        // == just checks on stack not the character
        /*equals first check the stack if equal return true, otherwise check the content
          character by character */





           //USE OF(==):
          System.out.println(s1 == s2);//true
          System.out.println(s2 == s3);//false




          //USE OF equals(=):
          System.out.println(s1.equals(s2));//true
          System.out.println(s2.equals(s3));//true

// example of immutable effects

          String p = "tripti";
          char ch = p.charAt(0);
          //s.setChar(0 , 'b'); this type of function is missing


          p.replace('t','b');
          System.out.println(p);//this is going to print hello bcz hmne yha p ko pakda nhi

           p = p.replace('t','d');
           System.out.println(p);


//example of performance issue
        String m ="";

        long start = System.currentTimeMillis();
        for(int i =0; i< 100000 ;i++){
            m=m+1;

        }
    long end = System.currentTimeMillis();

     long duration = end -start;
     System.out.println(duration);//inthis code time list will exceed bcz this is n^2 ka code.
     //this code wil run on 10000 loop but this will also take son much time 
     //hence above code proves performance issue of string
     //i.e agar replace krne k function h but usme performance issue h
         

















    }
}
