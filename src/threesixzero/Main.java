package threesixzero;
import java.util.Scanner;
public class Main {

	 static int string2int(String str) {
		 if(str.equals("0")){
			 return 0;
		 }
		 char[] charArray = str.toCharArray();
		 StringBuffer sb = new StringBuffer();
		 for(int i=0;i<charArray.length;i++){
				 if(Character.isDigit(charArray[i]))  sb.append(charArray[i]);
				 if(!Character.isDigit(charArray[i])&&charArray[i]!='.')  sb.append(0);
				 if(charArray[i]=='.') break; 	 
		 }
		 int res = 0;
		 if(charArray[0]!='-') res = Integer.parseInt(sb.toString());
		 else res = -1*Integer.parseInt(sb.toString());
		 return res;
	}
	/******************************结束写代码******************************/
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        int res;
	            
	        String _str;
	        try {
	            _str = in.nextLine();
	        } catch (Exception e) {
	            _str = null;
	        }
	  
	        res = string2int(_str);
	        System.out.println(String.valueOf(res));    

	    }

}
