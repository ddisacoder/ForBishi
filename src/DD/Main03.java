package DD;

import java.util.Scanner;

public class Main03 {
    //使得子集合中的数尽可能接近sum/2,动态规划
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        long[][] dp = new long[n+1][(int) (sum/2+1)];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum/2;j++){
                if(j>=arr[i-1])
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-arr[i-1]]+arr[i-1]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        int ans = (int) Math.abs(sum-2*dp[n][(int) (sum/2)]);
        System.out.println(ans);
    }
}
