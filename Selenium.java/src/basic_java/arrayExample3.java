package basic_java;

public class arrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object a[]=new Object[4];
		
		a[0]="Ameerpet";
		a[1]=100;
		a[2]='A';
		a[3]=true;
		
		for(int i=0; i<4; i++)
			System.out.println(a[i]);
		
		System.out.println("*****");
		
		for(Object j:a)
		System.out.println(j);
		
		//for(int j=0; j<4; j++)
			//System.out.println(j);

	}

}
