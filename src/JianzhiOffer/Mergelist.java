package JianzhiOffer;
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
public class Mergelist {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	    //非递归方法
	    public ListNode Merge(ListNode list1,ListNode list2) {
	        if(list1==null) return list2;
	        if(list2==null) return list1;
	        //结果链表的头节点
	        ListNode resultlist = null;
	        //程序运行时的当前节点，用于拼接链表
	        ListNode templist = null;
	        while(list1!=null&&list2!=null){
	        	if(list1.val<list2.val){
	        		if(resultlist==null){
	        			resultlist = templist = list1;
	        		}else{
	        			templist.next = list1;
	        			templist = templist.next;
	        		}
	        		list1 = list1.next;
	        	}else{
	        		if(resultlist==null){
	        			resultlist = templist = list2;
	        		}else{
	        			templist.next = list2;
	        			templist = templist.next;
	        		}
	        		list2 = list2.next;
	        	}
	        }
	        if(list1 == null) templist.next = list2;
	        else templist.next = list1;
	        
	        return resultlist;
	    }
	    
	    //递归方法
	    
	}
}
