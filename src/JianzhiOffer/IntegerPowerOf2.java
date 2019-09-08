package JianzhiOffer;

public class IntegerPowerOf2 {

	public static void main(String[] args) {
		System.out.println(isPow(32));
	}
	/*private static boolean isPow(int n){
		while(n>2){
			n/=2;
		}
		if(n==2) return true;
		else return false;
	}*/
	
	//如果整数为2的整数次方，那么他的二进制中有且只有一位是1.
	private static boolean isPow(int n){
		if(n==0||n==1){
			return false;
		}
		if(((n-1)&n)==0){
			return true;
		}
		else{
			return false;
		}
	}
}
