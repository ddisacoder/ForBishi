package sortMethods;

import java.util.Arrays;

/**
 * 基数排序
 * @author TL3050FWZ
 *
 */
public class RadixSort {

	public static void main(String[] args) {
		int[] arr = {421,234,554,332,240,765};
		int[] result = sort(arr);
		System.out.println(Arrays.toString(result));
	}
//低位优先，先排最低位
	private static int[] sort(int[] arr) {
		int[] result = new int[arr.length];
		int[] count = new int[10];
		
		for(int i=0;i<3;i++){
			int division = (int) Math.pow(10, i);
			for(int j=0;j<arr.length;j++){
				int num = arr[j] / division % 10;
				count[num]++;
			}
			
			for(int m=1;m<count.length;m++){
				count[m] = count[m] + count[m-1];
			}
			
			for(int n=arr.length-1;n>=0;n--){
				int num = arr[n] / division % 10;
				result[--count[num]] = arr[n];
			}
			
			System.arraycopy(result, 0, arr, 0, arr.length);
			Arrays.fill(count, 0);
			
		}
		return result;
	}
	
}
