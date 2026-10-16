class Solution {
    public int maximumWealth(int[][] accounts){
        int max_amount = 0;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[0].length;j++){
                sum += accounts[i][j];
            }
            if(sum>max_amount){
                max_amount = sum;
            }
        }
        return max_amount;
        
    }
}