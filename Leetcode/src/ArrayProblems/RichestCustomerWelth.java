//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
package ArrayProblems;

public class RichestCustomerWelth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int maximumWealth(int[][] accounts) {
	        int rowSum=0;
	        int wealthySum =0;
	        for(int i=0;i<accounts.length;i++){
	            for(int j=0;j<accounts[0].length;j++){
	                rowSum = rowSum + accounts[i][j];
	            }
	            if(wealthySum<=rowSum){
	                wealthySum = rowSum;
	            }  
	            rowSum = 0;
	        }
	        return wealthySum;
	    }
}
