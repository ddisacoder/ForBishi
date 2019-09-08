package JianzhiOffer;

public class RotateMinNumOfArray {
	
	public static void main(String[] args) {
		int [] array = {1,0,1,1,1};
		System.out.println(minNumberInRotateArray(array));
	}
	public static int minNumberInRotateArray(int [] array) {
        if(array.length==0){
        	return 0;
        }
        int index1 = 0;
        int index2 = array.length-1;
        int midind = 0;
        while(array[index1]>=array[index2]){
        	if(index2-index1==1){
        		midind = index2;
        		break;
        	}
        	midind = index1 + (index2 - index1)/2;
        	if(array[index1]==array[midind]&&array[index2]==array[midind]){
        		int result = array[index1];
        		for(int i = index1+1;i<=index2;i++){
        			if(array[i]<result){
        				result = array[i];
        			}
        		}
        		return result;
        	}
        	if(array[midind]>=array[index1]){
        		index1 = midind; 
        	}else if(array[midind]<=array[index2]){
        		index2 = midind;
        	}
        }
        return array[midind];
    }
	
	
	
}
