import java.util.*;
public class TwoSumArray{
    public static void main(String[] args) {
        int[] arr={1,7,9,10};
        int target=19;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
        
    }
    public static int[] TwoSum(int[]  arr,int target){
        Map <Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];

            if(map.containsKey(complement))
                return new int[]{map.get(complement),i};

            map.put(arr[i],i);
        } 
        return null;
    }
}