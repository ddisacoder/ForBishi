package Bytedance;

import java.util.Scanner;
import java.util.Stack;
public class Mainbili01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = help(n);
        System.out.println(ans);
    }

	private static int help(int n) {
		/*int temp = 0;
		for(int k=1;k<=2*n;++k) {
			if(2*n%k==0) {
				int y = 2*n/k-k-1;
				if(y%2==0 && y>=0) {
					temp = temp + 1;
				}
			}
		}
		return temp;*/
		
		/*while((n&1)==0) {
			n>>=1;
		}
		int ans = 1,d=3;
		while(d*d<=n) {
			int e = 0;
			while(n%d==0) {
				n/=d;
				e++;
			}
			ans*=e+1;
			d+=2;
		}
		if(n>1) ans<<=1;
		return ans;		*/
		
		int c = 0;
		for(int i=1;(i-1)*i/2<n;i++) {
			int te = n-(i-1)*i/2;
			if(te%i==0) {
				c++;
			}
		}
		return c;
	}
}


