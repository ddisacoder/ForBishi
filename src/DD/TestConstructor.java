package DD;

import java.util.Scanner;

public class TestConstructor {
    private int age;
    private String name;

   public TestConstructor(int age,String name){
        this.age = age;
        this.name = name;
    }

    public TestConstructor(){

    }

    public static void main(String[] args) {
        Child c = new Child();
        short a = 1;
        a+=1;
        System.out.println(a);
        String ss = new String("njnjn");
        String sss = ss;

        ss = ss.substring(2);
        System.out.println(sss+" "+ss);
        int[] arr = new int[]{1,1};
        int[] arr1 = arr;
        arr1[1] = 100;
        System.out.print(arr1[1]+" "+arr[1]);
    }

}

class Child extends TestConstructor{
    private int age;
    private String name;



}


