package HomeWork;

//Find the Minimum and Maximum Element with their Index Number from Given Array


public class min_max 
{

	    public static void main(String[] args) 
	    {
	        int[] array = {5, 3, 8, 1, 9, 2, 4};

	        int minIndex = 0;
	        int maxIndex = 0;
	        int minElement = array[0];
	        int maxElement = array[0];

	        for (int i = 1; i < array.length; i++) 
	        {
	            if (array[i] < minElement) 
	            {
	                minElement = array[i];
	                minIndex = i;
	            } else if (array[i] > maxElement) 
	            {
	                maxElement = array[i];
	                maxIndex = i;
	            }
	        }

	        System.out.println("Minimum Element: " + minElement + " at Index: " + minIndex);
	        System.out.println("Maximum Element: " + maxElement + " at Index: " + maxIndex);
        }
}
