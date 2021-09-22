
public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double 
		double [] max = new double[10];
		
		double []values = {25.3, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double max1 = values[0];
		
		for (int i = 0; i<values.length; i++)
		{
			System.out.print(values[i] + "  ");
		}
		//Prints out all of the numbers within the array.
		
		for (int i = 0; i<values.length; i++)
		{
			if (values[i]>max1)
			{
				max1 = values[i];
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Maximum is " + max1);
		//Print out the maximum number within the array.
		
		System.out.println();
		
		for (int i = 0; i<values.length; i++)
		{
			if (values[i]<0)
			{
				max1 = values[i];
				System.out.print(max1 + " ");
			}
		}
	}

}
