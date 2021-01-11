//Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//Clarification:
//
//Confused why the returned value is an integer but your answer is an array?
//
//Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
//nums = [0,0,1,1,1,2,2,3,3,4]


package ArrayProblems;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] arr = new int[] {0,0,1,1,1,2,2,3,3,4};
		int i =0;
		int j;
		
		for(j=1;j<arr.length;j++) {
			if(arr[j]!=arr[j-1]) {
				arr[i]=arr[j-1];
				i++;
			}
		}
		arr[i]=arr[j];
//		return i++;
	}
}
