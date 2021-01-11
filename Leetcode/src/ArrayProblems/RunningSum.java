//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
package ArrayProblems;

public class RunningSum {
	public static void main(String[] args) {
		 int[] arr = runningSum(new int[] {1,2,3,4});
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }		 
	}
	public static int[] runningSum(int[] nums) {
        int[] x = new int[nums.length];
        int sum = 0;
        for(int i=0;i<x.length;i++) {        	
        	sum=sum+nums[i];
        	x[i]=sum;
        }
		return x;
    }
}
