package JianzhiOffer;
import java.util.ArrayList;
import java.util.Scanner;
public class YuesefuCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int result = getLastNum_1(n, 2);
            System.out.println(result);
        }
    }
     private static class LinkedNode {    
         int value;
         LinkedNode next;    
         LinkedNode(int value) { 
             this.value = value;
         }
         public int getValue() {
             return value;
         }
     } 
    /**
      * 
      * 解法1: 使用循环链表模拟删数字的过程,
      * @param n  n为数组的长度
      * @param m  每隔m个数删除一个数字
      * @return
      */
    public static int getLastNum_1(int n, int m) {     
         if (n < 1 || m < 1) {
             throw new RuntimeException("输入的参数不合法");
         }
         //初始化循环链表
         LinkedNode head = new LinkedNode(0);
         LinkedNode tail = head;
         for (int i = 1; i < n; i++) {
              tail.next = new LinkedNode(i);
              tail = tail.next;
         }         
         //上面的循环出来后tail指向 new LinkedNode(n-1);所以下面让tail.next指向head,即完成了循环链表的初始化
         tail.next = head;       
         //模拟删数字过程
         LinkedNode currNode = head;
         int count = 1;  
         while (currNode != currNode.next) { //当只剩一个节点时就会跳出循环
             /*if (count == m) { //每隔m个数删一个数
            	 currNode.next = currNode.next.next;
            	 currNode = currNode.next;
                 count = 1;
             } else { //还没遍历到m个数就继续遍历
                 currNode = currNode.next;
                 count++;
             }*/
        	 for(int i=1;i<m;i++){
        		 currNode = currNode.next;
        	 }
        	 currNode.next = currNode.next.next;
        	 currNode = currNode.next;
         } 
         return currNode.getValue(); 
     }
   }

