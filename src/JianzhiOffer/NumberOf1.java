package JianzhiOffer;

public class NumberOf1 {

	public static void main(String[] args) {
		 int y = NumberOf1(-122);
		 System.out.println(y);
	}

	public static int NumberOf1(int n) {
		/*String s = Integer.toBinaryString(n);
		char[] c = s.toCharArray();
		int num = 0;
			for(int i=0;i<c.length;i++){
				if(c[i]=='1')
					num++;
				}
			return num;
		
		}*/
		//return Integer.toBinaryString(n).replaceAll("0","").length();
				//return Integer.bitCount(n);
				//就得到最低位的情况,其他位都为0,
				//如果最低位是0和1与 之后依旧 是0，如果是1，与之后还是1。
				//对于32位的整数 这样移动32次 就记录了这个数二进制中1的个数了 
		 int count=0;
         for(int i=0;i<32;i++){
            if((n>>i&1)==1)  
                count++;  
         }
         return count;
	}
}
