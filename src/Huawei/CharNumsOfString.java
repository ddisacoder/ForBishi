package Huawei;

import java.util.*;
 
public class CharNumsOfString{
     
    public static void main(String[] args){
                     
        int count=0;
         
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toUpperCase();
        String[] arr = str.split(" ");
        String str1 = arr[0];
         
        String a = arr[1].toUpperCase();
        char target = a.charAt(0);
       
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) == target){
                count++;
            }
        }
         
         
         
        System.out.println(count);
 
    }    
}
     