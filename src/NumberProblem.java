
public class NumberProblem {
	class TwoSum {
		/**
		 * Given an array of integers, return indices of the two
		 * numbers such that they add up to a specific target.
		 * You may assumes that each input would have exactly one solution,
		 * and you may not use the same element twice.
		 *
		 * Example
		 * Given nums = [2,7,11,15], taget = 9l
		 *  because nums[0] + nums[1] = 2 + 7 =9,
		 *  return [0,1]
		 */
	    public int[] twoSum(int[] nums, int target) {
	        // for(int i = 0; i < nums.length; i++){
	        //     for(int j = i+1; j < nums.length; j++){
	        //         int sum = nums[i] + nums[j];
	        //         if(sum == target){
	        //             return new int[]{i,j};
	        //         }
	        //     }
	        // }
	        // return null;
	        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	        for(int i = 0; i < nums.length; i++){
	            int remainder = target - nums[i];
	            if(map.containsKey(remainder)){ // If remainder equal to any previous number
	                return new int[]{map.get(remainder), i}; // that previous number + current = target
	            } else {
	                map.put(nums[i], i); // Save remainder -> index
	            }
	        }
	        return null;
	    }
	}
}
