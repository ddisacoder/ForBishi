package threesixzero;

import java.util.Scanner;

import org.junit.Test;

public class WW {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int res;
            
        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
  
        res = strToInt(_str);
        System.out.println(String.valueOf(res));  

	}

	public static int strToInt(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new RuntimeException("输入错误,无法转换成字符串");
        }
        char[] charArray = str.toCharArray();
        int start = 0;
        if (charArray[0] == '-') {
            // 有可能是负数，start+1
            start++;
        }
        int result = charArrayToInt(charArray, start, charArray.length - 1);
        return start == 1 ? -result : result;
 
    }
 
    // 字符数组[start,end]转换成一个数字
    private static int charArrayToInt(char[] charArray, int start, int end) {
        if (start < 0 || end < 0 || start > end) {
            return 0;
        }
        long result = 0;
        result = charToNum(charArray[end]) + (long)10 * charArrayToInt(charArray, start, end - 1);
        if (result > Integer.MAX_VALUE) {
            throw new RuntimeException("数据溢出");
        }
        if (start > 0 && result > (long) Integer.MAX_VALUE+1 ) {// 负数
            throw new RuntimeException("数据溢出");
        }
        if(end != charArray.length -1 && result == 0){
            throw new RuntimeException("数据非法");
        }
        return (int) result;
    }
 
    // 把char转换成0-9的数字
    private static int charToNum(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else {
            throw new RuntimeException("输入错误，无法转换成字符串");
        }
    }

}
