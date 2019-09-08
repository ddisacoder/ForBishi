package JianzhiOffer;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		/*Map<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		for(Map.Entry<Integer, String> m : map.entrySet()){
			System.out.println(m.getValue());
		}*/
		System.out.println(FirstNotRepeatingChar("aasddfff"));
		int[] arr = new int[2];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static int FirstNotRepeatingChar(String str) {
        char[] array = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<array.length;i++){
        	if(map.containsKey(array[i])){
        		int j = map.get(array[i]);
        		map.put(array[i], ++j);
        	}else
        		map.put(array[i], 1);
        }
        for(int i = 0;i<array.length;i++){
        	if(map.get(array[i])==1){
        		return i;
        	}
        }
		return -1;
    }
}
