
public class Principal {

	public static void main(String[] args) {

		String cadena = "Hola"; //INMUTABLE
		StringBuilder sb = new StringBuilder("Hello"); //MUTABLE
		int x = 5; //PRIMITIVO
		
		transforma(cadena,sb,x);
		
		System.out.println("***************");
		System.out.println(cadena); //Hola
		System.out.println(sb); //Hello World
		System.out.println(x); //5 	
		
		
	}

	static void transforma(String cadena, StringBuilder sb, int x) {
		
		cadena.concat(" Mundo");
		sb.append(" World");
		x += 5;
		
		System.out.println(cadena); //Hola
		System.out.println(sb); //Hello World
		System.out.println(x); //10	
				
	}

}
