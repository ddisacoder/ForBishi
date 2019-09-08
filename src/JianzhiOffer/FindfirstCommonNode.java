package JianzhiOffer;

import java.util.Stack;

public class FindfirstCommonNode {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	//利用辅助栈。空间复杂度为O(m+n);时间复杂度为O(m+n)
	public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 if(pHead1 == null || pHead2 == null){
			 return null;
		 }
		 Stack<ListNode> sk1 = new Stack<>();
		 Stack<ListNode> sk2 = new Stack<>();
		 while(pHead1!=null){
			 sk1.push(pHead1);
			 pHead1=pHead1.next;
		 }
		 while(pHead2!=null){
			 sk2.push(pHead2);
			 pHead2=pHead2.next;
		 }
		 
		 ListNode common = null;
		 ListNode temp = null;
		 while(!sk1.isEmpty()&&!sk2.isEmpty()&&(temp = sk1.pop())==sk2.pop()){
			 common = temp;
		 }
		 return common;
    }
	
	//不用辅助空间
	public ListNode findFirstCommonNode02(ListNode pHead1, ListNode pHead2){
		if(pHead1 == null || pHead2 == null){
			 return null;
		 }
		ListNode cu1 = pHead1;
		ListNode cu2 = pHead2;
		int length1 = getlength(cu1);
		int length2 = getlength(cu2);
		//1比2长，1先走
		if(length1 >= length2){
			int len = length1 - length2;
			while(len > 0){
				pHead1 = pHead1.next;
				len--;
			}
		}
		else{
			int len = length2 - length1;
			while(len > 0){
				pHead2 = pHead2.next;
				len--;
			}
		}
		
		while(pHead1!=pHead2){
			pHead1 = pHead1.next;
			pHead2 = pHead2.next;
		}
		return pHead1;
	}
	
	public static int getlength(ListNode head){
		int length = 0;
		while(head!=null){
			length++;
			head = head.next;
		}
		return length;
	}
	
}
