package JianzhiOffer;

public class FindKthToTail {

	public static void main(String[] args) {

	}
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	
	public ListNode FindKthToTail(ListNode head,int k) {
		ListNode pre = head;
		ListNode pre2 = head;
		int size = 1;
		while(pre.next!=null){
			size++;
			pre = pre.next;
		}
		if(k>size) return null;
		else{
			for(int i = 0;i<size-k;i++){
				pre2 = pre2.next;
			}
			return pre2;
		}
		
    }
	
	}
	

}
