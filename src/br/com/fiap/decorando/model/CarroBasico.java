package br.com.fiap.decorando.model;

public class CarroBasico implements Carro {

	@Override
	public void assemble() {
		System.out.print("Carro b�sico - Assemble");
	}

}
