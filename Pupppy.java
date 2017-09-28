
public class Pupppy {
	int pupppyAge;
	 public Pupppy(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Name:" + name );
	   }

	   public void setAge( int age ) {
	      pupppyAge = age;
	   }

	   public int getAge( ) {
	      System.out.println("Pupppy's age:" + pupppyAge );
	      return pupppyAge;
	   }

	   public static void main(String []args) {
	      /* Object creation */
	      Pupppy myPupppy = new Pupppy( "tommy" );

	      /* Call class method to set puppy's age */
	      myPupppy.setAge( 2 );

	      /* Call another class method to get puppy's age */
	      myPupppy.getAge( );

	      /* You can access instance variable as follows as well */
	      System.out.println("Variable Value :" + myPupppy.pupppyAge );
	   }

	
	}


