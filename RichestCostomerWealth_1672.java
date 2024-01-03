package com.Arrays;

public class RichestCostomerWealth_1672 {
    public static void main(String[] args) {

            int[][] accounts = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            RichestCostomerWealth_1672 wealthCalculator = new RichestCostomerWealth_1672();
            int maxWealth = wealthCalculator.maximumWealth(accounts);

            System.out.println("Maximum Wealth: " + maxWealth);

    }
    public int maximumWealth(int[][] accounts) {
        int row= accounts.length;;
        int col=accounts[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

}
