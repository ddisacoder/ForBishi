package Tencent;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int ans = 1;
        for(int i=0;i<n;i++){
            if(m>a[i]){
                m = m - a[i];
                ans++;
            }else{
               ans++;
               a[i] = a[i] - m;
               int p = i==0?0:a[i-1];
               m = m + p;
               while(a[i]>0) {
                   a[i] = a[i] - m;
                   ans++;
               }
               if(i<n-1){
                   ans++;
               }
            }
        }
        System.out.println(ans);
    }
}
