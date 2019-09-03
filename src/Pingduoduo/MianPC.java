package Pingduoduo;
import java.util.Scanner;
public class MianPC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int totalnum = sc.nextInt();
			int operationnum = sc.nextInt();
			sc.nextLine();
			String line = sc.nextLine();
			String[] ar = line.split(" ");
			int[] arr = new int[totalnum];
			for (int i =0;i<arr.length;i++) {
				arr[i] = Integer.valueOf(ar[i]);
			}
			int count = 0;
			int[] res = new int[operationnum];
			while(count<operationnum) {
				int num = sc.nextInt();
				for (int i =0;i<arr.length;i++) {
					if(arr[i]>=num) {
						arr[i]-=1;
						res[count] ++;
					}
				}
				System.out.println(res[count]);
				count++;
			}
		}
	}
}
