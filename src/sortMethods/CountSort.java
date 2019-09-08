package sortMethods;

import java.util.Arrays;

/**
 * 计数排序
 * @author TL3050FWZ
 *
 */
public class CountSort {

	public static void main(String[] args) {

		int[] arr = {2,3,4,3,2,4,6,7,5,8,0,5,9};
		int[] result = sort(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] sort(int[] arr) {
		//结果数组
		int[] result = new int[arr.length];
		//计数数组
		int[] count = new int[10];
		//填写计数数组
		for(int i=0;i<arr.length;i++){
			count[arr[i]]++;
		}
		
		//根据计数数组的值将原数组整合成结果数组(不能保证稳定性)
		for(int i=0,j=0;i<count.length;i++){
			while(count[i]-- >0){
				result[j++] = i;
			}
		}
		/*//保证稳定性
		for(int m = 1;m<count.length;m++){
			count[m] = count[m-1]+count[m];
		}
		
		for(int n = arr.length-1;n>=0;n--){
			result[--count[arr[n]]] = arr[n];
		}*/
		return result;
	}

}
