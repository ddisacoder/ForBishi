package JianzhiOffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
public class MinKnums {
	public static void main(String[] args) {
		MinKnums m = new MinKnums();
		System.out.println(m.GetLeastNumbers_Solution(new int[]{1,3,7,2,5}, 3));
	}
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> re = new ArrayList<>();
        if(k<=0||k>input.length) {
        	return re;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k,new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return o2-o1;
					}
		});
        for(int i = 0;i<input.length;i++) {
        	if(maxHeap.size()<k) {
        		maxHeap.offer(input[i]);
        	}else {
        		if(maxHeap.peek()>input[i]) {
        			maxHeap.poll();
        			maxHeap.offer(input[i]);
        		}
        	}
        }
        for(Integer i : maxHeap) {
        	re.add(i);
        }
        return re;
    }

}
