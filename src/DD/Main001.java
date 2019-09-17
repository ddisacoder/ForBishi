package DD;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        int a =0;
        int b =0;
        int sum = 0;
        if(n < m){
            a = (int) (n - k/m);
        }else{
            b = (int)(m - k/n);
        }
        sum = a + b;
        System.out.println(sum);
    }

}
