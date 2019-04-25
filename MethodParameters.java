public class MethodParameters {
	//Main method
	public static void main(String[] args)
	{
		//Initialization
		int result1,result2;
		//Using the sum method with its parameters and it is static so call the method directly
		result1 = sum(1,2);
		//Using multiply method and it is non-static method so calling the method by creating an object
		MethodParameters obj = new MethodParameters();
		result2 = obj.multiply(2,2);
		System.out.println("Sum of the given number is: "+result1);
		System.out.println("Multiplication of given number is: "+result2);
	}
	//Created a static method
	public static int sum(int a, int b)
	{
	return a+b;
	}
	//Create a static method
	public int multiply(int a, int b)
	{
		return a*b;
	}
}
	
