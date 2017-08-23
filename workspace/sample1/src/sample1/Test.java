package sample1;

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
public class Test {
	/*public static void main(){
		B b = new B();
		b.calculate();
	}
	*/
	public static  void main(String[] args) {
		B b = new B();
		b.calculate();
		try{
			System.out.println(5/0);
		}
		catch(ArithmeticException e){
			StaleElementException
		}
	}
}