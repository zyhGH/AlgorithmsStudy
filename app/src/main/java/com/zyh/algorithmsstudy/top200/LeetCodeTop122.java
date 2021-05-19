package com.zyh.algorithmsstudy.top200;

/**
 * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCodeTop122 {
    public int maxProfit(int[] prices) {
        int[][] arr = new int[prices.length][2];
        arr[0][0] = 0;
        arr[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            arr[i][0] = Math.max(arr[i - 1][0], arr[i - 1][1] + prices[i]);
            arr[i][1] = Math.max(arr[i - 1][1], arr[i - 1][0] - prices[i]);
        }
        return arr[prices.length - 1][0];
    }
}
