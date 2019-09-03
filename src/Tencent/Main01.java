package Tencent;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[m];
        int aodd = 0,aeven = 0,bodd = 0,beven = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
            if(a[i]%2==0)
                aeven++;
            else
                aodd++;
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextLong();
            if(b[i]%2==0)
                beven++;
            else
                bodd++;
        }
        int ans = 0;
        ans = Math.min(aeven,bodd)+Math.min(aodd,beven);
        System.out.println(ans);
    }
}
