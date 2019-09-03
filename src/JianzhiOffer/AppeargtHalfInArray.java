package JianzhiOffer;

public class AppeargtHalfInArray {

	public static void main(String[] args) {
		int [] a = {1,1,2,2};
		System.out.println(MoreThanHalfNum_Solution(a));
	}
	public static int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length==0){
            return 0;
        }
        int count = 1;
        int result = array[0];
        for(int i=1;i<array.length;i++){
            if(count==0){
                result = array[i];
            }else if(result!=array[i]){
                count--;
            }else{
                count++;
            }
        }
        count = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i]==result){
                count++;
            }
        }
        if(2*count<=array.length){
            result = 0;
        }
        return result;
    }
}
