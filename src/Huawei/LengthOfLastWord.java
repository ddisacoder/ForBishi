package Huawei;

import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			String resultstr = arr[arr.length-1];
			System.out.println(resultstr.length());
		}
	}

}
