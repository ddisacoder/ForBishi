package JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

public class ReOrderArray {

	public static void main(String[] args) {
		int [] arr = {2,6,3,3,5,5,7};
		reOrderArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
    public static void reOrderArray(int[] array) {
        //解法一：需要导包，代码不通过
		/*List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        for(int i=0;i<array.length;i++){
        	if((array[i]%2)==1){
        		list1.add(array[i]);
        	}else{
        		list2.add(array[i]);
        	}
    	}
    	list1.addAll(list2);
    	
    	
    	for(int i1 = 0;i1<list1.size();i1++){
    	    array[i1] = (int) list1.get(i1);
    	}*/
    
    	//解法2：辅助数组
    	/*int[] newarr =new int[array.length];
    	int oddnum=0,begin=0;
    	for(int i=0;i<array.length;i++){
        	if((array[i]%2)==1) oddnum++;
    	}
    	
    	for(int i=0;i<array.length;i++){
        	if((array[i]%2)==1){
        		newarr[begin++] = array[i];
        	}else{
        		newarr[oddnum++] = array[i];
        	}
    	}
    	for(int i =0;i<array.length;i++){
    		array[i] = newarr[i];
    	}*/
    	
    	//解法3：类似于排序的思想
    	for(int i = 0;i<array.length;i++){
	    	for(int j = 0;j<array.length-1-i;j++){
	    		if(array[j]%2==0&&array[j+1]%2==1){
	    			int temp = array[j];
	    			array[j] = array[j+1];
	    			array[j+1] = temp;
	    		}
	    	}
    	}
    }

}
