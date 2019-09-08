package JianzhiOffer;

public class NumberOf1Between1AndN {

	public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(13));
	}
	
	
	//暴力解法
	public static int NumberOf1Between1AndN_Solution(int n) {
	    StringBuffer sb = new StringBuffer();
	    for(int i=1;i<=n;i++){
	    	sb.append(i);
	    }
	    String sbstr = sb.toString();
	    int sum = 0;
	    for (int i = 0; i < sbstr.length(); i++) {
			if(sbstr.charAt(i)=='1'){
				sum++;
			}
		}
	    return sum;
	}
}
