package Bytedance;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mainxiaomi2 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static int solution(int[] arr) {
    	int[] temp = new int[arr.length];
    	for(int i=0;i<arr.length;i++) {
    		temp[i] = arr[i];
    	}
    	Arrays.sort(temp);
    	int count = 0;
    	for(int i=0;i<arr.length;i++) {
    		if(temp[i]!=arr[i]) {
    			count++;
    		}
    	}
    	int ans = count/2;
    	return ans;
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }
  
        res = solution(_arr);
        System.out.println(String.valueOf(res));    

    }
}
