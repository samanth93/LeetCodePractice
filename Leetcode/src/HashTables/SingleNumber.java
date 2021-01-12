//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
package HashTables;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int singleNumber(int[] nums) {
        int count =0 ;
        for(int i=0;i<nums.length;i++){
            count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==0) {
                return nums[i];
            }
        }
        return count;
    }

}
