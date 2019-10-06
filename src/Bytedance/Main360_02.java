package Bytedance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main360_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        double ans = help(m,arr);
        System.out.printf("%.3f",ans);
    }

    public static double help(int m,int[] arr) {
        double lo = Integer.MAX_VALUE;
        double hi = Integer.MIN_VALUE;
        for(int i = 0;i<=arr.length-1;i++){
            if(arr[i] > hi)
                hi = arr[i];
            if(arr[i] < lo)
                lo = arr[i];
        }
        while(hi - lo >= 1e-6){
            double mi_ddle = (hi + lo)/2.0;
            if(helpmesearch(arr , m ,mi_ddle))
                lo = mi_ddle;
            else
                hi = mi_ddle;
        }
        return hi;
    }

    public static boolean helpmesearch(int[] arr , int m , double mi_ddle){
        double mym_in = 0;
        double[] s_um = new double[arr.length + 1];
        s_um[0] = 0;
        for(int i = 1;i<arr.length+1;i++){
            s_um[i] = s_um[i - 1] + arr[i - 1] - mi_ddle;
            if(s_um[i] >= mym_in && m<=i)
                return true;
            if(m<=i)
                mym_in = Math.min(mym_in , s_um[i - m + 1]);
        }
        return false;
    }
}
