package br.com.softblue.tictactoe;

public class TipoAnimal {
	
	private Animal animal;
	
	public TipoAnimal(Animal a){	
		this.animal = a;
	}
	
	public void falar() {
		animal.falar();
	}
}
