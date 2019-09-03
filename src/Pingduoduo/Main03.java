package Pingduoduo;

import java.util.Scanner;
import java.util.Stack;

public class Main03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int num = 0;   // A 的个数

        for(int i = 1; i < K; i++){
            if((((i + 1) * i) / 2) == K){
                num = i;
            }
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        if(num == 0){
            // 不满足条件时
            System.out.println("-");
        }else{
            // 拼成对的AB
            for(int i = 0; i < num; i++){
                stack.push('B');
                stack.push('A');
            }
        }

        for(int j = 0; j < (N - 2 * num); j++){
            str.append("B");
        }

        for(int i = 0; i < num * 2; i++){
            str.append(stack.pop());
        }

        // 最后需要判断拼成的结果字符串长度大于N
        if(str.length() > N){
            System.out.println("-");
        }else{
            System.out.println(str.toString());
        }
    }
}
