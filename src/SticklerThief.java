import java.util.Arrays;
class Solution {

    public int maxLoot(int arr[], int idx, int dp[])
    {
        if(arr.length<=idx) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int steal=arr[idx]+maxLoot(arr,idx+2,dp);
        int skip=maxLoot(arr,idx+1,dp);
        return dp[idx]=Math.max(steal,skip);
    }

    public int findMaxSum(int arr[]) {

        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        return maxLoot(arr,0,dp);

    }

    public static void main(String[] args) {
        Solution thief = new Solution();
        int[] houses = {6, 7, 1, 30, 8, 2, 4};
        System.out.println("Maximum loot possible: " + thief.findMaxSum(houses)); // Output: 41
    }
}