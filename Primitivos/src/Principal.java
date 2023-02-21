
public class Principal {
	
	public static void main(String[] args) {
		
		float f = 5.6F; 
		
		long l1 = 1234567; //int //CAST
		
		long l2 = 2_147_483_648L; 
		
		System.out.println(l2);
		
		byte b1 = -128;
		
		int i1 = b1;
		
		short sh1 = 8;
		short sh2 = 7;
		
		short sh3 = (short)(sh1 + sh2);
		
		System.out.println(sh3);
		
		byte b2 = 8;
		byte b3 = 9;
		
		byte b4 = (byte)(b2 + b3);
		System.out.println(b4);

		long long1 = 8;
		int  int1 = 7;
		
		int1 = int1 + (int)long1;
		//int1+=long1;
		
		System.out.println("int1: "+int1);
		
		
		final int entero1 = 8;
		
		short short1 = entero1;
		
		System.out.println(short1);
		
		
		
	}

}
