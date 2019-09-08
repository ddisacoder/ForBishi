package JianzhiOffer;

public class Duplicate {

	public static void main(String[] args) {
		
		int numbers[]={6,5,3,0,4,3,2};
		int length = 7;
		int[] duplication = new int[1];
		boolean flag = duplicate(numbers,length,duplication);
		System.out.println(flag+" "+duplication[0]);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
	}
	
	 public static boolean duplicate(int numbers[],int length,int [] duplication) {
		    
	        if(numbers==null||length<=0){
	            return false;
	        }
	        //1、哈希法
	        /*int[] hash = new int[length];
	        for(int i=0;i<length;i++){
	            hash[numbers[i]]++;
	        }
	        
	        for(int i=0;i<length;i++){
	            if(hash[i]>1){
	                duplication[0] = i;
	                return true;
	            }
	        }
	        return false;*/
	        
	        //2、利用set去重特性
	       /* HashSet<Integer> set = new HashSet<Integer>();
	        for(int i=0;i<length;i++){
	            if(!set.add(numbers[i])){
	                duplication[0] = numbers[i];
	                return true;
	            }
	            set.add(numbers[i]);
	        }
	        return false;*/
	        
	       for(int i=0;i<length;i++){
	            while(numbers[i]!=i){
	                if(numbers[i]==numbers[numbers[i]]){
	                    duplication[0] = numbers[i];
	                    return true;
	                }
	                int temp = numbers[i];
	                numbers[i] = numbers[temp];
	                numbers[temp] = temp;
	            }
	        }
	        
	        return false;
	    }
	

}
