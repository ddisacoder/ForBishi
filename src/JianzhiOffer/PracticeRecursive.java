package JianzhiOffer;

public class PracticeRecursive {
	static int k = 0;
	 
    static void aa(int a) {
        if (a == 1) {
            System.out.println("[a == 1]����aΪ��"+a);
            return;
        } else {
            System.out.println("[a != 1]����aΪ��"+a);
            aa(a - 1);
            System.out.println("[a - 1]����aΪ��"+a);
            System.out.println("�ݹ�a:"+a);
            if (k == 2) {
                System.out.println("[k == 2]����aΪ��"+a+",����k:"+k);
                return;
            }
            k++;
            System.out.println("[k++]����aΪ��"+a+",����k:"+k);
            aa(a - 1);
        }
    }
    
    static int ss(int n){
    	if(n==1){
    		return 1;
    	}else{
    		return 3*ss(n-1);
    	}
    }
 
    public static void main(String[] args) {
        //aa(5);
    	System.out.println(ss(4));
    }
}
