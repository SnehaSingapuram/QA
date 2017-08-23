package newselenium;

class A{
	protected static void calculate(){
		System.out.println("Inside Class A");
	}
}
class B extends A{
protected static void calculate(){
		System.out.println("Inside Class B");
	}
}
public class test {
	/*public static void main(){
		B b = new B();
		b.calculate();
	}
	*/
	public  void main(String[] args) {
		B b = new B();
		b.calculate();
	}
}
