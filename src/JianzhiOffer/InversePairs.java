package JianzhiOffer;

public class InversePairs {

	public static void main(String[] args) {
		System.out.println(InversePairs(new int[]{7,5,6,4}));
	}
	public static int InversePairs(int [] array) {
        if(array==null||array.length==0)
            return 0;
        int[] copy = new int[array.length];
        int count = InversePairsCore(array,copy,0,array.length-1);//数值过大求余
        return count;
    }
    private static int InversePairsCore(int[] array,int[] copy,int low,int high)
    {
        if(low==high)
            return 0;
        int mid = (low+high)>>1;
        int leftCount = InversePairsCore(array,copy,low,mid)%1000000007;
        int rightCount = InversePairsCore(array,copy,mid+1,high)%1000000007;
        int count = 0;
        int i=mid;
        int j=high;
        int locCopy = high;
        while(i>=low&&j>mid)
        {
            if(array[i]>array[j])
            {
                count += j-mid;
                copy[locCopy--] = array[i--];
                if(count>=1000000007)//数值过大求余
                    count%=1000000007;
            }
            else
                copy[locCopy--] = array[j--];
        }
        //i>=low&&j>mid不同时满足了
        for(;i>=low;i--)
            copy[locCopy--]=array[i];
        for(;j>mid;j--)
            copy[locCopy--]=array[j];
        for(int s=low;s<=high;s++)
            array[s] = copy[s];
        return (leftCount+rightCount+count)%1000000007;
    }
}
