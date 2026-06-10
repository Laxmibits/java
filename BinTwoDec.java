package day5;

public class BinTwoDec {
    public static int bin2dec(int n){
        int sum=0,e=0,val;
        int rem;
        while(n>0){
            rem=n%10;
            val=rem*((int)Math.pow(2,e));
            sum+=val;
            e++;
            n=n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(bin2dec(101));
    }
    
}
