package JianzhiOffer;
//���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
public class Mergelist {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	    //�ǵݹ鷽��
	    public ListNode Merge(ListNode list1,ListNode list2) {
	        if(list1==null) return list2;
	        if(list2==null) return list1;
	        //��������ͷ�ڵ�
	        ListNode resultlist = null;
	        //��������ʱ�ĵ�ǰ�ڵ㣬����ƴ������
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
	    
	    //�ݹ鷽��
	    
	}
}
