#Square of Sorted Araay

class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int[] ans = new int[n];
      int i =0;
      int j=n-1;
      int index =n-1;

    while(i <= j) {
        int iSquare = nums[i]*nums[i];
        int jSquare = nums[j]*nums[j];

        if(iSquare>jSquare){
            ans[index] = iSquare;
            i++;
        } else {
            ans[index] = jSquare;
            j--;
        }
        index--;
      }

      return ans;
    }
}
