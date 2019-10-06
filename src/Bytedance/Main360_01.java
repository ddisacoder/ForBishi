package Bytedance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main360_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] s1 = o1.split(" ");
                String[] s2 = o2.split(" ");
                return (Integer.parseInt(s2[0])-Integer.parseInt(s1[0]));
            }
        });
        double ans = 0;
        double v0 = 0;
        for(int i=0;i<n;i++){
            String[] s1 = arr[i].split(" ");
            double t = Integer.parseInt(s1[1]);
            double a = Integer.parseInt(s1[0]);
            ans += v0*t + 0.5*a*t*t;
            v0 += a*t;
        }
        System.out.printf("%.1f",ans);

    }
}
