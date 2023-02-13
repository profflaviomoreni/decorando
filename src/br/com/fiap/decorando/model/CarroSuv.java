package br.com.fiap.decorando.model;

public class CarroSuv extends CarroDecorator {

	public CarroSuv(Carro c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" + Adicionando os detalhes de uma SUV ");
	}
	
	
}
