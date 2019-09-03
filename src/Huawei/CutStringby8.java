package Huawei;
import java.util.Scanner;
public class CutStringby8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String inputstr = sc.nextLine();
			String[] arr2 = inputstr.split(" ");
			StringBuffer sb = new StringBuffer();
			for(int i=1;i<=Integer.parseInt(arr2[0]);i++){
				String temp = completestr(arr2[i]);
				sb.append(temp);
			}
			String sbstr = sb.toString();
			String[] strarr = new String[sbstr.length()/8];
			for(int i=0;i<strarr.length;i++){
				strarr[i] = sbstr.substring(0, 8);
				sbstr = sbstr.substring(8);
			}
			String[] re = arraySort(strarr);
			for (int i=0;i<re.length-1;i++) {
	            System.out.print(re[i]+" ");
	        }
			System.out.print(re[re.length-1]);
			
		}
	}
	//补零函数，将字符串补成8的整数倍
	public static String completestr(String s){
		while (s.length()%8 != 0){
			s = s +"0";
		}
		return s;
	}
	//比较字符串函数，做升序用
	public static String[] arraySort(String[] input){       
        for (int i=0;i<input.length-1;i++){
            for (int j=0;j<input.length-i-1;j++) {
            	if(input[j].compareTo(input[j+1])>0){
                    String temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
        return input;
    }

}
