package br.com.softblue.tictactoe;

public class Brasileiro implements InterfaceExemplo {
	
	@Override
	public String fala() {
		
		String fala = "Olá, muito prazer"; 
		return fala;
		
	}

	@Override
	public int anda(int quilometros) {
		
		int quilometragem = 2000;
		System.out.println("Andei " + quilometragem + " km hoje."); 
		return quilometragem;
		
	}
}
