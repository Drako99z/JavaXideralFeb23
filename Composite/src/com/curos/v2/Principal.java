package com.curos.v2;

public class Principal {

	public static void main(String[] args) {


		Component com03 = new CompositeResta(
				new CompositeSuma(
						new LeafConstante(2.8) ,
						new CompositeResta(
								new LeafConstante(7.8),
								new LeafConstante(1.8)
						) 
				)
				,
				new CompositeResta(
						new CompositeResta(
								new LeafConstante(3.8),
								new CompositeSuma(
										new LeafConstante(4.8),
										new LeafConstante(8.8)
								) 
						)  ,
						new CompositeSuma(
								new LeafConstante(7.8),
								new LeafConstante(9.8)
						) 
				)
		);
		
		System.out.println(com03.getValor());
		
	}

}
