package JianzhiOffer;

/**
 * 题目描述
       在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
       请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author DYJ
 */
public class Find_in_Two_dimensional_array {

	public static void main(String[] args) {

		int[][] arr = new int[][]{{1,2,3,4},{3,4,5,6},{7,8,9,16}}; 
		System.out.println(Find02(10,arr));
	}
	
	//方法一：二分法遍历数组每一行
	public static boolean Find(int target,int[][] array){
		for(int i=0;i<array.length;i++){
			int lo = 0;
			int hi = array[i].length - 1;
			while(lo<=hi){
				int mid = lo + (hi - lo) / 2;
				if(target<array[i][mid]){
					hi = mid - 1;
				}else if(target>array[i][mid]){
					lo = mid + 1;
				}else{
					return true;
				}
			}
		}
		return false;	
	}
	/*选取右上角或者左下角的元素a[row][col]与target进行比较，
	当target小于元素a[row][col]时，那么target必定在元素a所在行的左边,
	即col--；
	当target大于元素a[row][col]时，那么target必定在元素a所在列的下边,
	即row++；*/
	public static boolean Find02(int target,int[][] array){
		int row = 0;
		int col = array[0].length - 1;
		while(row <= array.length-1&&col >= 0){
			if(target>array[row][col]){
				row++;
			}else if(target<array[row][col]){
				col--;
			}else{
				return true;
			}
		}
		return false;
	}

}
