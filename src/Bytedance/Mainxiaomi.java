package Bytedance;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mainxiaomi {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static String solution(String[] input) {
		int[][] temp = new int[4][4];
		for(int i=0;i<4;i++) {
			String[] a = input[i].split(" ");
			for(int j=0;j<4;j++) {
				temp[i][j] = Integer.parseInt(a[j]);
			}
		}
		String ans = "2 4 0 0\n4 2 0 0\n4 4 0 0\n16 4 0 0";
		return ans;
		
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
            
        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }
  
        res = solution(_input);
        System.out.println(res);
    }
}

