package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		//==
		//Las variables de referencia apuntan 
		//al mismo objeto??
		
		//equals()
		//Definido por Object: apuntan al mismo objeto
		//Sobreescritura: Comparar contenido dependiendo
		//   de los atributos definidos en equals()

		String x = "Hello";
		String y = "Hello";
		String z = "Hello";
		
		System.out.println("y == z : "+(y == z));
		
		//OBJETOS: 1
		//VARIABLES DE REFERENCIA: 3
		
		String w = new String("Hello");
		String v = new String("Hello");
		
		System.out.println("x == v : "+(x == v));

		//OBJETOS: 3
		
		boolean res = x.equals(z); 
		System.out.println("x.equals(z): "+res); //true
		res = x.equals(w); //true
		System.out.println("x.equals(w): "+res);  

		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Hola");

		res = sb1.equals(sb2); 
		System.out.println("sb1.equals(sb2): "+res); //false
		
		Integer i1 = 500;
		Integer i2 = 500;
		
		boolean res50 = (i1 == i2); 
		System.out.println("i1 == i2: " + res50); //false
		
		Integer i3 = 100;
		Integer i4 = 100;
		
		boolean res60 = (i3 == i4); 		
		System.out.println("i3 == i4: " +res60); //true
		
		Integer i5 = new Integer(100);
		
		
		//MUNDO PRIMITIVO
		//==
		//TIENEN EL MISMO VALOR??
		int dato1 = 500;
		int dato2 = 500;
		
		System.out.println(dato1==dato2);
		
		int dato3 = 100;
		int dato4 = 100;
		
		System.out.println(dato3==dato4);


	}

}
