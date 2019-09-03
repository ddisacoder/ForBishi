package YouZan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int ans = help(A,B);
        System.out.println(ans);
    }

    private static int help(String s, String t) {
        if(s.length()==0)
            return t.length()==0 ? 1 : 0;
        if(t.length() ==0)
            return 1;
        int cnt = 0;
        for(int i=0;i<s.length()-t.length()+1;i++){
            if(s.substring(i,t.length()+i).equals(t)){
                cnt ++;
            }
        }
        return cnt;
    }
}
