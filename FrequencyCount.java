package day8;
import java.util.HashMap;
public class FrequencyCount {
    public static void main(String[] args) {
        int[] nums={1,5,3,2,1,4,5,2};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int count=map.get(nums[i]);
            map.put(nums[i],count+1);
        }else{
            map.put(nums[i],1);
        }
    }
    System.out.println("Frequency of each element:");
    System.out.println(map);
}
}
