package Pingduoduo;

public class Pengcheng {
	

	public static void main(String[] args) {
		Alpha a = new Beta();
		a.f();
		System.out.println(a.getClass().getName());
		try {
			Beta b = (Beta)a;
			b.g();
		}catch(Exception e) {
			System.out.println("Error");
		}
	}

}

interface Alpha{
	void f();
}
class Beta implements Alpha{
	public void f() {
		System.out.println("Beta.f()");
	}
	public void g() {
		System.out.println("Beta.g()");
	}
}
