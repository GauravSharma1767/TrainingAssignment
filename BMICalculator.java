import java.util.*;
public class BMICalculator
{
	//attributes
	private float weight;
	private float height;
	
	//getter
	public float getWeight()
	{
		return this.weight;
	}
	//setter
	public void setWeight(float weight)
	{
		this.weight = weight;
	}
	
	//getter
	public float getHeight()
	{
		return this.height;
	}
	//setter
	public void setHeight(float height)
	{
		this.height = height;
	}
	
	public float BMICal()
	{
		return this.getWeight() / (this.getHeight() * this.getHeight());
	}
	
	public static void main(String[] args)
	{
		System.out.println("Please enter your weight in Kg(s)");
		float weight = Float.parseFloat(new Scanner(System.in).nextLine());
		
		System.out.println("Please enter your height in meters");
		float height = Float.parseFloat(new Scanner(System.in).nextLine());
		
		BMICalculator bmi = new BMICalculator();
		bmi.setWeight(weight);
		bmi.setHeight(height);
		
		//calculate BMI here
		System.out.println("BMI of the person is " + bmi.BMICal());
		
		new Scanner(System.in).nextLine();
	}
}
