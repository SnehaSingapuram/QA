package Details;

public class ObjDetails
{

int eno;
String ename;
double esal;

void getdetails(int temp_eno, String temp_ename, double temp_esal)
{

eno = temp_eno;
ename = temp_ename;
esal = temp_esal;

}


void Displaydetails()

{


	System.out.println("eno:" +eno);
	System.out.println("ename:" +ename);
	System.out.println("esal:" +esal);
	
	
	
}




}
