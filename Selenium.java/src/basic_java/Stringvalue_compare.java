package basic_java;

public class Stringvalue_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ap1="ameerpet hyderabad";
		String ap2="Hyderabad";
		String ap3="secunderabad";
		String ap4="AmeerPET Hyderabad";
		
		if(ap1.equals(ap2))
		{
			System.out.println("both are same");
			
		}
		
			else
			{
				System.out.println("both are not same");
			}
			if(ap1.equalsIgnoreCase(ap4))
			{
				System.out.println("ap1,ap4 same");
			}
			if(ap4.contains(ap2))
			{
				System.out.println("ap2 in ap4");
			}
			else
			{
				System.out.println("ap2 not in ap4");
			}
			
		
	}

	private static boolean ap1(String ap2) {
		// TODO Auto-generated method stub
		return false;
	}

}
