package JianzhiOffer;

public class PracticeRecursive {
	static int k = 0;
	 
    static void aa(int a) {
        if (a == 1) {
            System.out.println("[a == 1]参数a为："+a);
            return;
        } else {
            System.out.println("[a != 1]参数a为："+a);
            aa(a - 1);
            System.out.println("[a - 1]参数a为："+a);
            System.out.println("递归a:"+a);
            if (k == 2) {
                System.out.println("[k == 2]参数a为："+a+",变量k:"+k);
                return;
            }
            k++;
            System.out.println("[k++]参数a为："+a+",变量k:"+k);
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
