package Bytedance;

import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char[] a = in.toCharArray();
        Stack<Character> s = new Stack<>();
        //boolean flag = true;
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]=='('){
                //flag = false;
                count++;
            }
            if(count==0 && a[i]=='<'){
                if(!s.isEmpty()) {
                	s.pop();
                }
                
            }
            if(count==0 && a[i]!='<'&&a[i]!=')'){
                s.push(a[i]);
            }

            if(a[i]==')'){
                count--;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        StringBuilder ans = sb.reverse();
        System.out.println(ans.toString());

    }
}

