package workouts;

import java.util.List;
import java.util.ArrayList;

public class FindMaxSubArray {

	public static void main(String[] args) {
		
		int nums[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int target = 8; 
		int result = 0;
		List<Integer> resultList = new ArrayList<>();
		for (int i=0; i<nums.length-1;i++) {
			result = 0;
			for(int j =i;j<nums.length;j++ ) {
				result = result + nums[j];
				if(result > target) {
					break;
				}else if(result == target) {
					resultList = new ArrayList<>();
					for(int k=i; k<=j; k++) {
						resultList.add(nums[k]);
					}
					System.out.println(resultList);
				}else {
					
				}
			}
		}
	}

}
