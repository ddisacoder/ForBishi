package YouZan;

import java.lang.*;
import java.util.*;
//# : a:3#b:8#c:9

public class Mainb{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String str=r.nextLine();
        String[] strs=str.split(" ");

        String part=strs[0];
        String cut=strs[1];
        String deal=strs[2];
        String[] lis=deal.split(part);

        System.out.println(lis.length);
        for(String s:lis) {
            String[] kv=s.split(cut);
            String key=kv[0];
            String val=kv[1];
            System.out.println(key+" "+val);
        }
    }
}
