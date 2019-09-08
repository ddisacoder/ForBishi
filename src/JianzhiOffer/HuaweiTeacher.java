package JianzhiOffer;

import java.util.Scanner;

public class HuaweiTeacher {
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
