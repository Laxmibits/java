package day5;

import java.util.Arrays;



public class CheckAnagram {
    public static void main(String args[]){
        String s1="mam";
        char[] ch1=s1.toCharArray();
        Arrays.sort(ch1);
        String res1=new String(ch1);
        String s2="amma";
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch2);
        String res2=new String(ch2);
        if(res1.equals(res2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
    
}
