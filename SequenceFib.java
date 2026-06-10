package day5;

public class SequenceFib {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;

        }
        else{
            return(fib(n-2)+fib(n-1));
        }
    }
    public static void main(String args[]){
        int n=6;
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+ " ");
        }
    }
    }
    
    
