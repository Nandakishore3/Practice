package myPackage;

public class MyClass {

	public static void main(String[] args) 
	{
		int[] data = new int [5];
		data [0] = 44;
		data [1] = 75;
		data [2] = 65;
		data [3] = 99;
		data [4] = 20;
		
		System.out.println("length: "+data.length);
		for (int i=0;i<data.length;i++)
		System.out.println(data[i]);
		
	}

}
