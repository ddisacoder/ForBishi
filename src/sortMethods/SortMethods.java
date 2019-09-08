package sortMethods;

public class SortMethods {

	public static void main(String[] args) {
		int[] arr1 = {5,4,7,2,1,66,8,44,5,765,777,5,4,7,89,36};
		printSortedArray(BubbleSort(arr1));
		int[] arr2 = {5,4,7,2,1,66,8,44,5,765,777,5,4,7,89,36};
		printSortedArray(SelectionSort(arr2));
		int[] arr3 = {5,4,7,2,1,66,8,44,5,765,777,5,4,7,89,36};
		printSortedArray(InsertionSort(arr3));
		int[] arr4 = {5,4,7,2,1,66,8,44,5,765,777,5,4,7,89,36};
		printSortedArray(ShellSort(arr4));
		int[] arr5 = {5,4,7,2,1,66,8,44,5,765,777,5,4,7,89,36};
		printSortedArray(MergeSort(arr5));
		int[] arr6 = {5,4,7,2,1,66,8,44,5,765,777,5,4,7,89,36};
		printSortedArray(QuickSort(arr6));
		int[] arr7 = {5,4,7,2,1,66,8,44,5,765,5,777,5,4,7,89,36};
		printSortedArray(Quick3ways(arr7));
	}
	
	//冒泡排序算法:比较相邻的两个元素，每一趟将最大数置后。
	public static int[] BubbleSort(int[] arr){
		for(int i = 0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1); 
				}
			}
		}
		return arr;
	}
	
	//选择排序:每一趟固定一个数的位置，遍历其后的数并与其比较，如果遇到较小数，则与固定位置的数替换。排序结果使得当前趟的最小数置前。
	public static int[] SelectionSort(int[] arr){
		for(int i = 0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					swap(arr,j,i); 
				}
			}
		}
		return arr;
	}
	
	//插入排序：每一趟保证左边数的有序，将有序子数组右边相邻的数往左插入到正确的位置
	public static int[] InsertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=i ; j>0 && (arr[j]<arr[j-1]) ; j--){
				swap(arr,j,j-1);
			}
		}
		return arr;
	}
	
	//希尔排序：基于插入排序的一种快速的排序算法。每一轮排序，取一个间隔值为h，形成“间隔h的元素为有序的”，h值递减，直到h=1.
	public static int[] ShellSort(int[] arr){
		int h = 1;
		while(h<arr.length/3)  h = 3*h+1;
		while(h>=1){
			for(int i=h;i<arr.length;i++){
				for(int j=i;j>=h && (arr[j]<arr[j-h]) ; j-=h){
					swap(arr,j,j-h);
				}
			}
			h = h/3;
		}
		return arr;
	}
	
	//归并排序：任意长度N，时间复杂度：O(NlogN)。分治算法的体现。稳定，但需要辅助数组，额外空间和N成正比
	public static int[] MergeSort(int[] arr){
		sort(arr,0,arr.length-1);
		return arr;
	}
	
	public static void sort(int[] a,int lo,int hi){
		if(hi<=lo) return;
		int mid = lo+(hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a,lo,mid,hi);
	}
	
	//原地归并的抽象方法
	public static void merge(int[] a,int lo,int mid,int hi){
		int i = lo; int j = mid+1;
		int[] aux = new int[a.length];
		//将数组元素复制到辅助数组中
		for(int k=lo;k<=hi;k++){
			aux[k] = a[k];
		}
		//归并过程，条件的判断
		for(int k=lo;k<=hi;k++){
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(aux[j]<aux[i]) a[k]=aux[j++];
			else a[k]=aux[i++];
		}
	}
	
	
	//快排：一种分治的排序算法，当两个子数组有序时整个数组自然就有序了。
	//方法的关键在于partition，切分的过程中，切点位置将会被排定，左边的数都不大于切点，右边的数都不小于切点。
	//初始切点，可选取a[lo]，然后从左到右扫描到一个大于等于它的数，再从右到左扫描到一个小于等于它的数，交换位置。
	//左右指针相遇时，将切点与左子数组最右侧a[j]的元素交换，返回j。
	public static int[] QuickSort(int[] arr){
		quicksort(arr,0,arr.length-1);
		return arr;
	}
	
	private static void quicksort(int[] arr, int lo, int hi) {
		if(hi<=lo) return;
		int j = partition(arr,lo,hi);
		quicksort(arr, lo, j-1);
		quicksort(arr, j+1, hi);
	}

	private static int partition(int[] arr, int lo, int hi) {
		//定义左右两个指针
		int i = lo,j = hi+1;
		//初始切点
		int v = arr[lo];
		while(true){
			while(arr[++i]<v) if(i==hi) break;
			while(v<arr[--j]) if(j==lo) break;
			if(i>=j) break;
			swap(arr,i,j);
		}
		swap(arr,lo,j);
		return j;
	}
	
	
	//三向切分快排，重复元素较多时，性能好
	public static int[] Quick3ways(int[] arr){
		quick3wayssort(arr,0,arr.length-1);
		return arr;
	}
	private static void quick3wayssort(int[] a,int lo,int hi){
		if(hi<=lo) return;
		int lt = lo,i=lo+1,gt = hi;
		int v = a[lo];
		while(i<=gt){
			if(a[i]<v)      swap(a,lt++,i++);
			else if(a[i]>v) swap(a,i,gt--);
			else            i++;  
		}
		quick3wayssort(a,lo,lt-1);
		quick3wayssort(a,gt+1,hi);
	}
	
	public static void printSortedArray(int[] arr){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//-------------------------------------------

}
