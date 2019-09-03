package Tencent;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 连续的白花数
        int k = sc.nextInt();
        while(sc.hasNextInt()){
            int left = sc.nextInt();
            int right = sc.nextInt();
            // i为花的数量
            int res = 0;
            int index = 0;
            for(int i = left; i <= right; i++){
                res += i;
            }
            System.out.println(res);
        }
    }
}
