package basic_java;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=30;
		int b=35;
		int c=25;
		
		if(a>b)
		{
			System.out.println("a gresterthen b");
		}
		else
		if(b>c)
		{
			System.out.println("b greaterthen c");
		}
		else
			if(c>a)
			{
				System.out.println("c greaterthen a");
			}
			else
				if(b>a)
			{
				System.out.println("b greaterthen a");
						
			}

	}

}
