package Huawei;

import java.util.Arrays;
import java.util.Scanner;
//����Ԫ����������γ������飬�������ֵ��ȥ��Сֵ��С�������С��ֵ
public class MindifferencebetwMaxandMin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int len = in.nextInt();
			in.nextLine();
			int[] arr = new int[len];
			String arrstr = in.nextLine();
			String[] arr2 = arrstr.split(" ");
			//����ĸ�ֵ
            for(int i=0;i<arr2.length;i++){
                arr[i] = Integer.parseInt(arr2[i]);
            }
			Arrays.sort(arr);
			int[] arr3 = new int[len/2];
			for(int i=0;i<arr3.length;i++){
				arr3[i] = arr[i]+arr[len-1-i];
			}
			Arrays.sort(arr3);
			System.out.println(arr3[len/2-1]-arr3[0]);
		}
	}
}
