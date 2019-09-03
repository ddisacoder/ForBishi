package JianzhiOffer;

import java.util.Scanner;

public class StrToInt_Class {

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		while(sa.hasNext()){
			String s = sa.nextLine();
			int aa = StrToInt(s);
			System.out.println(aa);
		}
	}
	
	public static int StrToInt(String str) {
		boolean flag = true;
		char[] c = str.toCharArray();
		if(str.equals("")){
			flag = false;
		}else{
			if(c[0]=='+'||c[0]=='-'){
				if(c.length==1){
					flag = false;
				}else{
					for(int i = 1;i<c.length;i++){
						if(c[i]<48||c[i]>57){
							flag = false;
						}
					}
				}
			}else if(c[0]>=48&&c[0]<=57){
				for(int i = 1;i<c.length;i++){
					if(c[i]<48||c[i]>57){
						flag = false;
					}
				}
			}
			else{
				flag =false;
			}
        }
		
		if(flag==false){
			return 0;
		}else{
			int num = 0;
			if(c[0]=='+'){
				for(int i = 1;i<c.length;i++){
					//将字符转换为字符串，再将字符串转换为int.
					String tempp = String.valueOf(c[i]);
					int temp = Integer.parseInt(tempp);
					num+=temp*(Math.pow(10, c.length-i-1));
				}
			}else if(c[0]=='-'){
				num = Integer.parseInt(str);
			}
			else{
				for(int i =0;i<c.length;i++){
					String tempp = String.valueOf(c[i]);
					int temp = Integer.parseInt(tempp);
					num+=temp*(Math.pow(10, c.length-i-1));
				}
			}
			return num;
		}
    }
}
