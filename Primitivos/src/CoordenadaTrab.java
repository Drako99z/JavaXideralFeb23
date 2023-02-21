
public class CoordenadaTrab {
	
	String nombre;
	Integer posX; //0
	Integer posY; //0

	public CoordenadaTrab(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		
		CoordenadaTrab c1 = new CoordenadaTrab("Patrobas");
		c1.posX = 6;
		c1.posY = 9;
		
		//Persistir en DB
		
		CoordenadaTrab c2 = new CoordenadaTrab("Tercio");
		System.out.println(c2.posX);
		System.out.println(c2.posY);

		
		//Persistir en DB
		

	}

}
