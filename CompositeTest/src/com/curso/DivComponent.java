package com.curso;

public class DivComponent implements Component {
	
	Component c1;
	Component c2;

	public DivComponent(Component c1, Component c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public double getValor() {
		return c1.getValor() / c2.getValor();
	}

}
