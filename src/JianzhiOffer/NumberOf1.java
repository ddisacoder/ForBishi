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
		//�͵õ����λ�����,����λ��Ϊ0,
		//������λ��0��1�� ֮������ ��0�������1����֮����1��
		//����32λ������ �����ƶ�32�� �ͼ�¼���������������1�ĸ����� 
		 int count=0;
         for(int i=0;i<32;i++){
            if((n>>i&1)==1)  
                count++;  
         }
         return count;
	}
}
