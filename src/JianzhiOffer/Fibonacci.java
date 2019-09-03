package JianzhiOffer;

public class Fibonacci {

	public static void main(String[] args) {

		int i = Fibonacci(4);
		System.out.println(i);
	}
	
	public static int Fibonacci(int n) {
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return Fibonacci(n-2)+
					Fibonacci(n-1);
		}   
    }
}
