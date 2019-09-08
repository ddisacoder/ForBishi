package JianzhiOffer;
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
public class PowerWithUnsignedExponent {

	public static void main(String[] args) {
		System.out.println(Power(2,-2));
	}
	 //递归
	public static double Power(double base, int exponent) {
		if((base==0.0)&&exponent<0){
			throw new IllegalArgumentException("非法输入");
		}
		if(base==0.0&&exponent>=0){
			return 0;
		}
		if(exponent==0) return 1;
		if(exponent==1) return base;
		if(exponent==-1) return 1/base;
		double result = Power(base, exponent/2);
		result*=result;
		if((exponent&1)==1){
			result*=base;
		}
		return result;			
	}
}
