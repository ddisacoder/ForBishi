package Pingduoduo;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main9_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        int index = 0;
        for(int i=n;i>=1;i--){
            for(int j=m;j>=1;j--){
                int temp = i*j;
                if(queue.size()<k){
                    queue.offer(temp);
                }else{

                    if (temp>queue.peek()){
                        queue.poll();
                        queue.offer(temp);
                    }
                }

            }
            if(index >= k){
                break;
            }
        }
        System.out.println(queue.poll());
    }
}


//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int k = sc.nextInt();
//
//        int[] arr = new int[n*m];
//        int index = 0;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                arr[index] = i*j;
//                index++;
//            }
//        }
//        Arrays.sort(arr);
//        int res = arr[arr.length - k];
//        System.out.println(res);
//    }
//}