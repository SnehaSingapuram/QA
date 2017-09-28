package methodoverloading;

public class overriding {

void m1()
{
System.out.println("overriding");
}
}
class override extends overriding
{
void m1()
{
System.out.println("overrided");
}
public static void main(String[] args)
{
overriding ol = new overriding();
}
}
