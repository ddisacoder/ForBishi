package JianzhiOffer;

public class CutRope {

	public static void main(String[] args) {
		int len = 18;
		System.out.println(maxlen1(len)+" "+maxlen2(len));
	}
	//1、动态规划
	private static int maxlen1(int length){
		if(length<2){
			return 0;
		}else if(length==2){
			return 1;
		}else if(length==3){
			return 2;
		}
		
		int[] products = new int[length+1];
		products[0] = 0;
		products[1] = 1;
		products[2] = 2;
		products[3] = 3;
		
		for(int i=4;i<=length;i++){
			int max = 0;
			for(int j=1;j<=i/2;j++){
				int product = products[j]*products[i-j];
				if(max<product){
					max = product; 
				}	
			}
			products[i] = max;
		}
		
		return products[length];
	}
	
	//2、贪婪算法：
	//n>=5时，尽可能的剪长度为3的绳子，当剩下的长度为4时，剪成2×2.
	private static int maxlen2(int length){
		if(length<2){
			return 0;
		}else if(length==2){
			return 1;
		}else if(length==3){
			return 2;
		}
		
		int timesof3 = length/3;
		if(length%3 == 1){
			timesof3 -= 1;
		}
		int timesof2 = (length - 3*timesof3)/2;
		return (int) (Math.pow(3, timesof3)*Math.pow(2, timesof2));
	}

}
