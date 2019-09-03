package Pingduoduo;

import java.util.Scanner;

public class Main9_102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.nextLine();
        String[] girl = new String[s];
        String[] boy = new String[s];
        for(int i=0;i<s;i++){
            girl[i] = sc.nextLine();
            boy[i] = sc.nextLine();
        }
        for(int i=0;i<s;i++){
            help(girl[i],boy[i]);
        }

    }

    static void help(String girl,String boy){
        String[] ans = new String[2];
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if(isAnotConB(girl,boy)){
            ans = null;
        }else{
            if(boy.length()==1){
                 for(int i=0;i<girl.length()-1;i++){
                     sb.append("d ");
                 }
                 sb.append("l");
                 ans[0] = sb.toString();
                 sb2 = sb.replace(sb.length()-1,sb.length(),"r");

                 ans[1] = sb2.toString();
            }
            else{
                sb.append("l");
                for(int i=0;i<girl.length()-1;i++){
                    sb.append(" l");
                }
                ans[0] = sb.toString();
                sb2 = sb.replace(0,1,"r");

                ans[1] = sb2.toString();
            }
        }
        System.out.println("{");
        if(ans!=null){
            System.out.println(ans[0]);
            System.out.println(ans[1]);
        }
        System.out.println("}");
    }

    static boolean isContain(String T,char aa){
        for(int i=0;i<T.length();i++){
            if(T.charAt(i) == aa){
                return true;
            }
        }
        return false;
    }

    static boolean isAnotConB(String A,String B){
        for(int i=0;i<B.length();i++){
            if(!isContain(A,B.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
