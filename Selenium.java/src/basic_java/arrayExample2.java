package basic_java;

import java.lang.reflect.Array;

public class arrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ary [][]=new String[2][2];
		
		ary[0][0]="testing";
		ary[0][1]="manual";
		ary[1][0]="selenium";
		ary[1][1]="automation";
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
				System.out.println(ary[i][j]+" ");
	}
		System.out.println();
	}

}
