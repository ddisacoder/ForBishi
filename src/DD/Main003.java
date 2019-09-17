package DD;

import java.util.Scanner;

public class Main003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int fa = sc.nextInt();
        int fb = sc.nextInt();
        int[] u = new int[m];
        int[] v = new int[m];
        int[] a = new int[m];
        int[] b = new int[m];
        int k =0;
        for(int i =0;i<m;i++){
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int maxa = 0;
        for(int i=0;i<m;i++){
            if(a[i]>maxa){
                maxa = a[i];
            }
        }
        int maxb = 0;
        for(int i=0;i<m;i++){
            if(b[i]>maxb){
                maxb = b[i];
            }
        }
        k = fa*maxa+fb*maxb;
        System.out.println(k);
    }


}
