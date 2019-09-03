package Bytedance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

//合并区间
public class MergeInterval {

	private static class MyCo implements Comparator<int[]>{	
		@Override
		public int compare(int[] a, int[] b) {
			return a[0]-b[0];
		}
	}
    public static int[][] merge(int[][] intervals) {
    	Arrays.sort(intervals,new MyCo());
    	LinkedList<int[]> res = new LinkedList<>();
    	if (intervals.length == 0 || intervals == null) 
    		return res.toArray(new int[0][]);
    	for(int i=0;i<intervals.length;i++){
    		if(res.isEmpty()){
    			res.add(new int[]{intervals[i][0],intervals[i][1]});
    		}else{ 
    			int[] last = res.getLast();
				if(last[1]<intervals[i][0]){
					res.add(new int[]{intervals[i][0],intervals[i][1]});
				}
				else{
					last[1] = last[1]>=intervals[i][1]?last[1]:intervals[i][1];
				}
    		}
    	}
		return res.toArray(new int[0][]);//骚操作？
    }
    public static void main(String[] args) {
    	int[][] aa = {{1,3},{2,6},{8,10},{15,18}};
    	int[][] a = merge(aa);
    	Arrays.sort(a,new MyCo());
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}
}
