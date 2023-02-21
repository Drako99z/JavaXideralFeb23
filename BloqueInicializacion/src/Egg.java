
public class Egg {
	
	public Egg() {
		System.out.println("PASO2");

		number = 5;

	}

	public static void main(String[] args) {

		Egg egg = new Egg();
		System.out.println("PASO3");
		System.out.println(egg.number); //5
		
		//egg = new Egg();
	}

	private int number = 3;

	{
		System.out.println("PASO1");
		number = 4;
	}
}