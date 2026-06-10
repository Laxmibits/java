package day5;

public class Even {
    public static int EvenArraySum(int nums[]){
        int sum=0;
        for(int ele:nums){
            if(ele%2==0){
                sum+=ele;
            }
        }
    
    return sum;}
    
    public static void main(String args[]){
        int[] nums={4,9,12,35,22,14};
        System.out.println("The Even sum is: "+EvenArraySum(nums));

    }
    
}
