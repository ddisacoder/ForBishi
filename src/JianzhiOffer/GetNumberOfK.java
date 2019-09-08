package JianzhiOffer;
//统计一个数字在排序数组中出现的次数。
public class GetNumberOfK {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,7,7,8};
		int k = 7;
		System.out.println(GetNumberOfK(arr,k));
	}
	
	public static int GetNumberOfK(int [] array , int k) {
		//在排序数组中该数组一定是连续出现的。
		if(array.length==0) return 0;
		int firstindex = getFirstIndex(array, 0, array.length-1, k);
		int lasttindex = getLastIndex(array, 0, array.length-1, k);
		if(firstindex!=-1&&lasttindex!=-1){
			return lasttindex-firstindex+1;
		}
		return 0;
    }
	
	private static int getFirstIndex(int[] arr,int lo,int hi,int k){
		/*//二分法，用递归做
		if(lo>hi) return -1;
		int mid = (lo+hi)/2;
		if(arr[mid]>k) return getFirstIndex(arr, lo, mid-1, k);
		else if(arr[mid]<k) return getFirstIndex(arr, mid+1, hi, k);
		else if(mid-1>=0&&arr[mid-1]==k) return getFirstIndex(arr, lo, mid-1, k);
		else return mid;*/
		
		//hi若等于给定值，则继续往左逼近。
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(arr[mid]<k) lo=mid+1;
			else hi=mid-1;
		}
		return lo;
		
	}
	
	private static int getLastIndex(int[] arr,int lo,int hi,int k){
		/*//二分法，循环方法
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(arr[mid]>k) hi = mid-1;
			else if(arr[mid]<k) lo = mid+1;
			else if(mid+1<arr.length&&arr[mid+1]==k) lo = mid+1;
			else return mid;
		}
		return -1;*/
		
		//lo若等于给定值，则继续往右逼近
		while(lo<=hi){
			int mid = (lo+hi)/2;
			if(arr[mid]<=k) lo=mid+1;
			else hi=mid-1;
		}
		return hi;
	}
	

}
