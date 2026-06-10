package day5;

public class SumNatural {
    public static int SumNatural(int n){
    if(n==1){
        return 1;

    }
    else{
        return(n+SumNatural(n-1));
    }
}
    public static void main(String[] args) {
        System.out.println(SumNatural(5));
    }
    }
    
    

