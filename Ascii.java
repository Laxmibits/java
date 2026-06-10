package day4;

public class Ascii {
    public static void main(String[] args) {
       String s="a1s2c5d8";
       int len=s.length();
       int sum=0;
       for(int i=0;i< s.length();i++){
        char ch=s.charAt(i);
        if(ch>='0' && ch<='9'){
            sum=sum+(ch-'0');
        }
       }
       System.out.println("Sum+ " +sum);

       
    
       

       
       
    }
}

