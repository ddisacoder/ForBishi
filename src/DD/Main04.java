package DD;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = help(arr);
        System.out.println(ans);
    }
     public static int help(int[] a){
        int[][] dp = new int[a.length][20001];
        if(a.length<2)
            return 0;
        int maxnum = 0;
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                int tp = a[i]-a[j]+10000;
                if(dp[j][tp]>0){
                    dp[i][tp] = Math.max(dp[j][tp]+1,dp[i][tp]);
                }else {
                    dp[i][tp] = 2;
                }
                maxnum = Math.max(maxnum,dp[i][tp]);
            }
        }
        return maxnum;
     }

}
