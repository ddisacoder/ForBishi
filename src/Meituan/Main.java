package Meituan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String Matrixpara = in.nextLine();
			String[] arr = Matrixpara.split(" ");
			int chang = Integer.parseInt(arr[0]);
			int kuan = Integer.parseInt(arr[1]);
			int[][] myarr = new int[chang][kuan];
			for(int i = 0;i<chang;i++){
				String[] temp = in.nextLine().split(" ");
				for(int j = 0;j<kuan;j++){
					myarr[i][j] = Integer.parseInt(temp[j]);
				}
			}	
			System.out.println(help(myarr,chang,kuan));
		}
	}
	
	public static int help(int[][] arr,int chang,int kuan){
		List a = new ArrayList();List b = new ArrayList();
		for(int i=0;i<chang;i++){
			for(int j=0;j<kuan;j++){
				if((i+j)%2==0){
					a.add(arr[i][j]);
				}else{
					b.add(arr[i][j]);
				}
			}
		}
		int[] aa = new int[a.size()] ;
        for (int i = 0; i < aa.length; i++) {
				aa[i] = (int) a.get(i);
		}
        int[] bb = new int[b.size()] ;
        for (int i = 0; i < bb.length; i++) {
				bb[i] = (int) b.get(i);
		}
        Arrays.sort(aa);Arrays.sort(bb);
        int[] tempa = candidate(aa, aa[aa.length-1]);int[] tempb = candidate(bb, bb[bb.length-1]);
        if(tempa[0]!=tempb[0]){
        	return aa.length-tempa[1]+bb.length-tempb[1];
        }else{
        	int num1 = aa.length-tempa[1]+bb.length-tempb[2];
        	int num2 = aa.length-tempa[2]+bb.length-tempb[1];
        	return num1<num2?num1:num2;
        }		
	}

    //返回三个数：re[0]为出现频次最高的数;re[1]为最高频次数;re[2]为次高频次数
	public static int[] candidate (int[] array,int maxnum)    
    {
		// 计数数组，每个元素的默认值为0
		int[] count = new int[maxnum+1];                
        for(int i = 0; i < array.length; i++)
        {
            count[array[i]]++;                    // 对应的计数值加1
        }
        int maxCount = count[0]; int cimaxCount = 0;
        int maxNumber = 0;
        for(int i = 0;i < maxnum+1;i++){
        	if(count[i]>maxCount){
        		maxCount = count[i];
        	}
        }
        for(int i = 0; i < maxnum+1; i++)            // 找出出现最多次的那个数字
        {
        	if(count[i] == maxCount)
        		maxNumber = i;
        }
        Arrays.sort(count);
        cimaxCount = count[count.length-2];
        int[] re = new int[3];re[0] = maxNumber;re[1] = maxCount;re[2] = cimaxCount;
        return re;
    }
}
