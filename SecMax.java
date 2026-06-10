import java.util.Scanner;
public class SecMax {
    public static void main(String args[]){
        int[] arr={12,15,80,56,23,78};
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele>fmax)
            {
                smax=fmax;
                fmax=ele;
            }
            else if(ele > smax && ele!=fmax)
            {
                smax=ele;
            }

        }
        if(smax==Integer.MIN_VALUE){
        System.out.println(-1);
        }
        else{
            System.out.println(smax);
        }
    }
    
    
}
