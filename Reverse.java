package day5;


    import java.util.Scanner;
    public class Reverse {

    public static void main(String args[]){
        int[] arr={132,674,454,901};
        for(int num:arr){
            int rev=0;
            int temp=num;
            while(temp>0){
                int digit=temp%10;
                rev=rev*10+digit;
                temp=temp/10;
                
            }
        
        
            System.out.println(rev);
        }

    }
    
}
    

