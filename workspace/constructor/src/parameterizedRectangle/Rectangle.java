package parameterizedRectangle;

 class rectangle {

	 public static void main(String[] args) 
		{
			rectangle objRect = new rectangle(20, 50);
			objRect.rectArea();
			
		}
	int length, width, res;
	
	//parameterized constructor
	rectangle(int x, int y)
	{
		length = x;
		width = y;
	}
	void rectArea()
	{
	    res =  length*width;
		System.out.println("Area of Rectangle is " +res);
	}
}
