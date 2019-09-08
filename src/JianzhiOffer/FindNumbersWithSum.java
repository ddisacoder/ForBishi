package JianzhiOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
public class FindNumbersWithSum {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9,10,11};
		int sum = 8;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = FindNumbersWithSum(a,sum);
		System.out.println(list.get(0)+" "+list.get(1));
	}
	
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<array.length;i++){
        	int val = sum - array[i];
        	if(map.containsValue(val)){
        		if(list.isEmpty()){
	        		list.add(val);
	        		list.add(array[i]);
        		}else if(val*array[i]<list.get(0)*list.get(1)){
        			list.set(0,val);
	        		list.set(1,array[i]);
        		}
        	}
        	map.put(i, array[i]);
        }
          
        return list;
    }
}
