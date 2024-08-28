package demo;

public class swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float first = 1.20f, second = 2.45f;

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	        
	        float temporary = first;

	        
	        first = second;

	        
	        second = temporary;

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	    }
	

	}

