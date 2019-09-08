package JianzhiOffer;

public class ReverseList {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	    
	    public ListNode ReverseList(ListNode head) {
	    	//已反序的头结点
	    	ListNode pre = null;
	    	//待反序链表的头结点
	    	ListNode next = null;
	    	
	    	while(head != null){
	    		next = head.next;
	    		head.next = pre;
	    		pre = head;
	    		head = next;
	    	}
	    	return pre;
	    }

	}
}
