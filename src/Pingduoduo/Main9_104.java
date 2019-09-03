package Pingduoduo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main9_104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        String[] arr = tmp.split(",");
        String[] a = arr[arr.length-1].split(";");
        arr[arr.length-1] = a[0];
        int N = Integer.parseInt(a[1]);
        long[] num = new long[arr.length];
        List<Long> odd = new ArrayList<>();
        List<Long> even = new ArrayList<>();
        for(int i=0;i<num.length;i++){
            num[i] = Long.parseLong(arr[i]);
            if(num[i]%2==0)
                even.add(num[i]);
            else
                odd.add(num[i]);
        }
        long[] odd1 = new long[odd.size()];
        long[] even1 = new long[even.size()];
        for(int i = 0;i<odd1.length;i++){
            odd1[i] = odd.get(i);
        }
        for(int i = 0;i<even1.length;i++){
            even1[i] = even.get(i);
        }
        Arrays.sort(even1);Arrays.sort(odd1);
        if(even1.length<N){
            for(int i=even1.length-1;i>=0;i--){
                System.out.print(even1[i]+",");
            }
            for(int j = odd1.length-1;j>odd1.length-N+even1.length;j--){
                System.out.print(odd1[j]+",");
            }
            System.out.print(odd1[odd1.length-N+even1.length]);
        }else{
            for(int i=even1.length-1;i>even1.length-N;i--){
                System.out.print(even1[i]+",");
            }
            System.out.print(even1[even1.length-N]);
        }
    }
}
