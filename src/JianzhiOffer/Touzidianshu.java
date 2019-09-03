package JianzhiOffer;
import java.util.Scanner;
public class Touzidianshu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//骰子数量
		int x = sc.nextInt();//>=此点数
		if(x<1||n<1) {
			throw new RuntimeException("非法输入");
		}else if(x<=n) {
			System.out.println(1);
		}else if(x>6*n) {
			System.out.println(0);
		}else {
			//思想见剑指offer P296
			long times[][] = new long[2][6*n+1];
			int flag = 0;
			for(int i = 1;i <= 6;i++) 
				times[flag][i] = 1;
			for(int k = 2;k <= n;k++){
				for(int i = 0;i < k;i++) {
					times[1-flag][i] = 0;
				}
				for(int i = k;i <= 6*n;i++){
					times[1-flag][i] = 0;
					for(int j=1;j<=i&&j<=6;j++) {
						times[1-flag][i] += times[flag][i-j];
					}
				}
				flag = 1 - flag;
			}
			long total = (long) Math.pow(6, n);
			long sum = 0;
			for(int i = x;i<=6*n;i++) {
				sum+=times[flag][i];
			}
			//最大公约数
			long maxdiv = help(sum,total);
			System.out.println(sum/maxdiv+"/"+total/maxdiv);
		}	
	}
	private static long help(long sum, long total) {
		if(total==0) return sum;
		return sum%total==0?total:help(total,sum%total);
	}

}
