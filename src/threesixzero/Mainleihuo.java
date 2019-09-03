package threesixzero;

public class Mainleihuo {

	public static void main(String[] args) {
		String a = "qqq";
		a.charAt(0);
		a.length();
		a.substring(1);
		Mainleihuo m = new Mainleihuo();
		int i = 0;
		m.inc(i);
		i = i++;
		System.out.println(i);
		//for test
	}
	
	void inc(int i) {
		i++;
	}

}
