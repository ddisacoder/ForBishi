package JianzhiOffer;

public class HuaWei {
/*
	汽水瓶：有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：
	先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，
	喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？ 

	输入描述:
	输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。

	输出描述:
	对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。

	输入例子1:
	3
	10
	81
	0

	输出例子1:
	1
	5
	40

	java：第一种：
	import java.util.Scanner;
	public class Main{
	    public static void main(String[] args){
	        int num = 0;
	        Scanner scanner = new Scanner(System.in);
	        
	        while(scanner.hasNext()){
	            num = scanner.nextInt();
	            if(num == 0){
	                continue;
	            }
	            else{
	                System.out.println(num/2);
	            }
	        }
	        
	    }
	}

	第二种：
	import java.util.*;
	public class Main{
	    public static void main(String[] args){
	        int num = 0;
	        Scanner scanner = new Scanner(System.in);
	        
	        while(scanner.hasNext()){
	            num = scanner.nextInt();
	            if(num == 0){
	                continue;
	            }
	            else{
	                System.out.println(bb(num));
	            }
	        }     
	    }
	    public static int bb(int a){
	        int count = 0;
	        while(a>2){
	            int temp_a = a/3;
	            int temp_b = a%3;
	            a = temp_a+temp_b;
	            count += temp_a;
	            
	            if(a==2){
	                count++;
	                break;
	            }
	        }
	        return count;
	    }
	}

	第三种：递归
	public static int bb(int a){
	        if(a==1){
	        	return 0;
	        }else if(a==2){
	        	return 1;
	        }else{
	        	return (a/3+bb(a/3+a%3));
	        }
	    }


	明明的随机数（排序+去重）
	一：
	import java.util.*;
	public class Main{
	    public static void main(String[] args){
	    	Scanner sa = new Scanner(System.in);
	        
	        while(sa.hasNext()){
	    	
	            int num = sa.nextInt();
	            int[] arr = new int[num];
	            for(int i=0;i<num;i++){
	                arr[i]=sa.nextInt();
	            }

	            Set set = new HashSet();
	            for(int i=0;i<num;i++){
	                set.add(arr[i]);
	            }

	            Object[] arr1 = set.toArray();
	            Arrays.sort(arr1);
	            for (int i = 0; i < arr1.length; i++) {
	                System.out.println(arr1[i]);
	            }
	        }
	    }
	}

	二：
	import java.util.*;
	public class Test{
	    public static void main(String[] args){
	    	Scanner sa = new Scanner(System.in);

	    	while(sa.hasNext()){
		    	int num = sa.nextInt();
		    	int[] arr = new int[num];
		    	for(int i=0;i<num;i++){
		    		arr[i]=sa.nextInt();
		    	}
		    	
		    
		    	Arrays.sort(arr);
		    	System.out.println(arr[0]);
		    	for (int i = 1; i < arr.length; i++) {
		    		if(arr[i]==arr[i-1])
		    			continue;
		    			
					System.out.println(arr[i]);
		    		
		    	}
	    	}   	  
	    }
	}

	第三题：16进制转10进制
	import java.util.*;
	public class Main{
	    public static void main(String[] args){
	    	Scanner sa = new Scanner(System.in);
	    	while(sa.hasNext()){
	    		String num16 = sa.nextLine();
	    		System.out.println(transfer(num16));
	    	}
	    }
	    
	    public static String transfer(String str){
			int index = str.length();
			int count =0;
			int a = 0;
			for(int i=index-1;i>1;i--){
				if(str.charAt(i)=='A'){
					a=10;
				}else if(str.charAt(i)=='B'){
					a=11;
				}else if(str.charAt(i)=='C'){
					a=12;
				}else if(str.charAt(i)=='D'){
					a=13;
				}else if(str.charAt(i)=='E'){
					a=14;
				}else if(str.charAt(i)=='F'){
					a=15;
				}else{
					a = Integer.parseInt(String.valueOf(str.charAt(i)));
				}
				int b = (int) (a*Math.pow(16, index-i-1));
				count += b;
			}
			
			String sc=String.valueOf(count);
	    	
	    	return sc;
	    	
	    }
	}
	
	第四题：老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.
	import java.util.Scanner;
   
	public class Main {
	   
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while(sc.hasNext()){
	               
	            String input = sc.nextLine();
	            //将输入以字符串数组形式保存
	            String[] arr1 = input.split(" ");
	            //第一个数为学生数量
	            int stuNum = Integer.parseInt(arr1[0]);
	            //第二个数为操作的数目
	            int operaNum = Integer.parseInt(arr1[1]);
	               
	            String inputscore =  sc.nextLine();
	            String[] arr2 = inputscore.split(" ");
	            int[] score = new int[arr2.length];
	            for(int i=0;i<arr2.length;i++){
	                score[i] = Integer.parseInt(arr2[i]);
	            }
	               
	            int count = 1;
	            int querynum = 0;
	            int[] resultarr = new int[operaNum];
	            while(count<=operaNum){
	                String inputopera = sc.nextLine();
	                String[] arr3 = inputopera.split(" ");
	                int firstnum = Integer.parseInt(arr3[1]);
	                int secondnum = Integer.parseInt(arr3[2]);
	                if(arr3[0].equals("Q")){
	                    int result = query(score,firstnum,secondnum);
	                    resultarr[querynum]=result;
	                    querynum++;
	                }else if(arr3[0].equals("U")){
	                    update(score,firstnum,secondnum);
	                }
	                count++;
	            }
	               
	            for(int i=0;i<querynum;i++){
	                System.out.println(resultarr[i]);
	            }
	        }
	    }
	       
	    public static int query(int[] arr,int left,int right){
	        if(left>right){
	            int max = arr[right-1];
	            for(int i=right;i<left;i++){
	                if(arr[i]>max){
	                    max = arr[i];
	                }
	            }
	            return max;
	        }
	        else{
	            int max = arr[left-1];
	                for(int i=left;i<right;i++){
	                    if(arr[i] > max){
	                        max = arr[i];
	                    }
	                }
	            return max;
	        }
	    }
	    public static void update(int[] arr,int index,int newscore){
	        arr[index-1] = newscore;
	    }
	   
	}
	
	第五题：按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;
	 
	public class Main {
	 
	    public static void main(String[] args) {
	 
	        Scanner sc = new Scanner(System.in);
	       
	        while(sc.hasNext()){
	            String s = sc.nextLine();
	            char[] ch = s.toCharArray();
	            StringBuilder sb = new StringBuilder();
	             
	            for(int i = 0; i<ch.length;i++){
	                String s1 = String.valueOf(ch[i]);
	                if(!sb.toString().contains(s1)){
	                    sb.append(s1);
	                }
	            }
	            System.out.println(sb.toString());
	        }
	    }
	}
	
	第六题：删数，约瑟夫环
	一：递推
	 import java.util.*;
		public class Main{
		    public static void main(String[] args){
		       Scanner sc = new Scanner(System.in);
		        while(sc.hasNext()){
		            int length = sc.nextInt();
		            int number = 0;
		            for(int i =2;i<=length;i++){
		                number = (number+3)%i ;
		            }
		            System.out.println(number);
		        }
		    }
		}
		
		二：构造环形链表
		
	*/
}
