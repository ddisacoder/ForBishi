package Pingduoduo;
import java.util.Scanner;
public class Main02 {
	
	private static int num = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int result = 1;
			int L = sc.nextInt(); int S = sc.nextInt();
			if(L<3){
				System.out.println("请输入大于等于3的L");
			}
			else{
				if(L==3) System.out.println(S);
				else if(L>=3*S){
					System.out.println(0);
				}
				else{
					help("",S,0,L);
					System.out.println(num);
				}
			}
		}
	}
	
	
	
	static void help(String s,int S,int l,int L){
		if(l==L){
			num++;
		}
		for(int i=0;i<S;i++){
			
			if(('a'+i)==s.charAt(l-1)&&s.charAt(l-1)==s.charAt(l)-2){
				
			}
			StringBuffer sb = new StringBuffer(s);
			sb.append('a'+i);
			help(sb.toString(),S,l+1,L);
		}
		
	}
}
