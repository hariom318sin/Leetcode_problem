class Solution {
    public int maximumWealth(int[][] accounts) {
        int row=0;
        int col=0;
        int max=col;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                col=col+accounts[i][j];
                if(max<col){
                    max=col;
                }

            }
            col=0;
        }
        return max;
    }
}