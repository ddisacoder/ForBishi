package JianzhiOffer;

public class PrintMinNumberWithanArray {

	public static void main(String[] args) {

		int [] a = {3,32,321};
		System.out.println(PrintMinNumber(a));
		
	}
	
	public static String PrintMinNumber(int [] numbers) {
		//选择排序
	    for(int i = 0;i<numbers.length;i++){
	    	for(int j = i+1;j<numbers.length;j++){
	    		if(sort(numbers[j],numbers[i])){
	    			int temp = numbers[i];
	    			numbers[i] = numbers[j];
	    			numbers[j] = temp;
	    		}
	    	}	
	    }
	    StringBuffer sb = new StringBuffer();
	    for (int i=0;i<numbers.length;i++) {
			sb.append(numbers[i]);
		}
	    return sb.toString();
    }
	
	public static boolean sort(int num1,int  num2){
		/*String temp1 = Integer.toString(num1)+Integer.toString(num2);
		String temp2 = Integer.toString(num2)+Integer.toString(num1);*/
		String temp1 = num1+""+num2;
		String temp2 = num2+""+num1;
		if(Integer.parseInt(temp1)<Integer.parseInt(temp2)){
			return true;
		}else{
			return false;
		}
	}
	
}
