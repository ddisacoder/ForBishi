package DD;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String l = sc.nextLine();
        String[] arr = l.split(" ");
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i].equals("+")&&arr.length==3)||
                        ((arr[i].equals("+")&&i==1) && (!arr[i+2].equals("*")&&!arr[i+2].equals("/")))||
                        ((arr[i].equals("+")&&i==arr.length-2) && (!arr[i-2].equals("*")&&!arr[i-2].equals("/")))||
                        (arr[i].equals("+") && ((!arr[i+2].equals("*")&&!arr[i+2].equals("/"))&&(!arr[i-2].equals("*")&&!arr[i-2].equals("/"))))
                        ) {
                    if (Integer.parseInt(arr[i + 1]) < Integer.parseInt(arr[i - 1])) {
                        swap(arr, i + 1, i - 1);
                        flag = true;
                    }
                }
                if ((arr[i].equals("*") && i == 1) || (arr[i].equals("*") && !arr[i - 2].equals("/"))) {
                    if (Integer.parseInt(arr[i + 1]) < Integer.parseInt(arr[i - 1])) {
                        swap(arr, i + 1, i - 1);
                        flag = true;
                    }
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
