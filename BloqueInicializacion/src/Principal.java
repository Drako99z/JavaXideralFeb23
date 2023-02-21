
public class Principal {
	
	{
		System.out.println("Paso 1");
	}
	
	Principal(){
		System.out.println("Paso por constructor");
	}

	public static void main(String[] args) {

		{
			//System.out.println("Hola Mundo");
		}
		
		Principal p01 = new Principal();
		Principal p02 = new Principal();
		
		{	
			//System.out.println("Hello world");
		}
	}
	
	{
		System.out.println("Paso 2");
	}


}
