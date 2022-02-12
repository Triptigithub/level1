import java.util.*;

public class Main .java {
    public static void main (String[] args){
        StringBuilder sb = new StringBuilder("hello");

        char ch = sb.charAt(0);//for getting single Character
        System.out.println(ch);

        sb.setCharAt(0, 'b');//change
        System.out.println(sb);

        sb.deleteCharAt(0);//remove
        System.out.println(sb);

        sb.insert(0,'t');  //to insert someword in string
        System.out.println(sb);

        String s= sb.toString();
        System.out.println(sb);


























    }
}