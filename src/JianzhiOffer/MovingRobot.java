package JianzhiOffer;

public class MovingRobot {
	public int movingCount(int threshold, int rows, int cols)
	{
		boolean flag[][] = new boolean[rows][cols];
		return moving(0,0,rows,cols,flag,threshold);
	        
    }
	
	private int moving(int i, int j, int rows, int cols, boolean[][] flag, int threshold) {
		if(i<0 || i>=rows || j<0 || j>=cols || sum(i)+sum(j) > threshold || flag[i][j]==true){
			return 0;
		}
		flag[i][j]=true;
		return moving(i-1,j,rows,cols,flag,threshold)
				+moving(i+1,j,rows,cols,flag,threshold)
			    +moving(i,j-1,rows,cols,flag,threshold)
			    +moving(i,j+1,rows,cols,flag,threshold)
			    +1;
	}

	public int sum(int i){
		if(i==0) return 0;
		int sum = 0;
		while(i!=0){
			sum+=i%10;
			i/=10;
		}
		return sum;
	}
}
