package Details;

public class DiffObjDeclare {

	public static void main(String[] args)
	{
	DiffObjDeclare obj = new DiffObjDeclare();
	ObjDetails obj1 = new ObjDetails();
	ObjDetails obj2 = new ObjDetails();
	ObjDetails obj3 = new ObjDetails();
	ObjDetails obj4 =new ObjDetails();
	
		obj1.getdetails(001, "Sneha",8000.0);
		obj2.getdetails(002,"Anvesh",10000.0);
		obj3.getdetails(003, "Aarush",20000.0);
		obj4.getdetails(004,"Varnitha",30000.0);

		System.out.println("First Employee Details:");
		obj1.Displaydetails();
		System.out.println();
		
		System.out.println("Second Employee Details:");
		obj2.Displaydetails();
		System.out.println();
		
		System.out.println("Third Employee Details:");
		obj3.Displaydetails();
		System.out.println();
		
		System.out.println("Fourth  Employee Details:");
		obj4.Displaydetails();
		

	}

}
