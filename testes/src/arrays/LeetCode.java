package arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class LeetCode {
	public static void main(String[] args) {
		int[] nums = {3, 2, 4};
		int target = 6;
		
		for(int n: getTarget(nums, target)) {
			System.out.println(n);
		}
	}
	
	private static int[] getTarget(int[] nums, int target) {
		int[] solution = new int[2];

        for(int i = 0; i <= (nums.length - 1) ; i++) {
            for(int si = 0; si <= (nums.length - 1) ; si++) {
                if ((nums[i] + nums[si]) == target && i != si){
                    solution[0] = i;
                    solution[1] = si;
                    
                    return solution;
                }
            }
        }
        
        return new int[]{-1, -1};
	}
	
	private static int[] leetSolution(int[] nums, int target) {
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        
        for(int i=0;i<=nums.length;i++){
          
            if(map.containsKey(target-nums[i]) && i!= map.get(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};
            map.put(nums[i],i);
        }
        return new int[2];
	}
	
}
