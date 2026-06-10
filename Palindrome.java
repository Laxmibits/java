package day4;

public class Palindrome {
    public static void main(String args[]){
        String s="malayalam";
        int len=s.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s)){
            System.out.println("palindrome");

        }
        else{
            System.out.println("not palindrome");
        }

    }
    
}
