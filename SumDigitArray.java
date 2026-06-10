import java.util.Scanner;
public class SumDigitArray {
    public static void  main(String args[]){
        int[] arr={54,93,12,65};
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            System.out.print(sum +" ");
        }



    }
    
}
