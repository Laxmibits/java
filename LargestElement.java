import java.util.Scanner;
public class LargestElement {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int[] arr={12,15,80,56,23,78};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);


        
    }
    
}
