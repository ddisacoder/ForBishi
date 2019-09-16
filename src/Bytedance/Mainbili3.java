package Bytedance;

import java.util.Scanner;
import java.util.Stack;
public class Mainbili3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int ans = help(a,b);
        System.out.println(ans);
    }

	private static int help(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();

		int[][] dp = new int[len1 + 1][len2 + 1];
		for (int i = 0; i <= len1; i++) {
			for (int j = 0; j <= len2; j++) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else if (a.charAt(i - 1) == b.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1])+1;
				}
			}

		}
		return dp[len1][len2];
	}
}

