package Huawei;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String arrstr = in.nextLine();
			int arr[] = new int[10];
			String[] arr2 = arrstr.split(" ");
			List li = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                arr[i] = Integer.parseInt(arr2[i]);
                for(int j = 0;j<arr[i];j++){
                	li.add(i);
                }
            }
            int[] temp = new int[li.size()] ;
            for (int i = 0; i < temp.length; i++) {
				temp[i] = (int) li.get(i);
			}
            int len1 = in.nextInt(); int len2 = in.nextInt();
            int numA = 0 ; int numB = 0;
            for(int i = 0;i<len1;i++){
        		numA += (int) (Math.pow(10, len1-1-i)*temp[i]);
		    }
            for(int i = 0;i<len2;i++){
            	numB += (int) (Math.pow(10, len2-1-i)*temp[len1+i]);
            }
            System.out.println(numA*numB);
		}
	}
}
