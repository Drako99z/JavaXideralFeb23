import java.math.BigDecimal;

public class Principal2 {

	public static void main(String[] args) {

		double a = 0.02;
		double b = 0.03;
		double c = b - a;
		System.out.println(c);
		
		BigDecimal _a = new BigDecimal("0.02");
		BigDecimal _b = new BigDecimal("0.03");
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c);
		
		//https://stackoverflow.com/questions/3413448/double-vs-bigdecimal
		
		double d1 = 0.3;
	    double d2 = 0.2;
	    System.out.println("double:\t 0,3 - 0,2 = " + (d1 - d2));

	    float f1 = 0.3f;
	    float f2 = 0.2f;
	    System.out.println("float:\t 0,3 - 0,2 = " + (f1 - f2));

	    BigDecimal bd1 = new BigDecimal("0.3");
	    BigDecimal bd2 = new BigDecimal("0.2");
	    System.out.println("BigDecimal:\t 0,3 - 0,2 = " + (bd1.subtract(bd2)));
		
	}

}
