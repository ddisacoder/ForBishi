package JianzhiOffer;

public class JumpFloor {

	public static void main(String[] args) {

		int s =JumpFloorII(3);
		System.out.println(s);
	}
	
	public static int JumpFloor(int target) {
		if(target==0){
			throw new RuntimeException("����������");
		}else if(target==1){
			return 1;
		}else if(target==2){
			return 2;
		}else{
			return JumpFloor(target-1)+JumpFloor(target-2);
		}
    }
//	һֻ����һ�ο�������1��̨�ף�Ҳ��������2������
//	��Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
	public static int JumpFloorII(int target){
		if(target==0){
			throw new RuntimeException("����������");
		}else if(target==1){
			return 1;
		}else{
			int sum = 1;
			for(int i=2;i<=target;i++){
				sum+=JumpFloorII(i-1);
			}
			return sum;
		}
	}

}
