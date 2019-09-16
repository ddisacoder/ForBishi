package Bytedance;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] h = new int[n];
        for(int i=0;i<n;i++) {
        	x[i] = sc.nextInt();
        	h[i] = sc.nextInt();
        }
        int[] xt = new int[n];
        int[] ht = new int[n];
        xt = x;
        ht = h;
        Arrays.sort(ht);
        Arrays.sort(xt);
        int[][] tmp = new int[n][2];
        /*for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(x[i] == xt[j]) {
        			tmp[i][0] = j;
        			break;
        		}
        		
        	}
        	for(int j = 0;j<n;j++) {
        		if(h[i] == ht[j]) {
        			tmp[i][1] = j;
        			break;
        		}
        	}
        }*/
        int[] re = new int[n];
        for(int i=0;i<n;i++) {
        	re[i] = Math.min(tmp[i][0], tmp[i][1]);
        }
        Arrays.sort(re);
        System.out.println(n/2);
    }
}

