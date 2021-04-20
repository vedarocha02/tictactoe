package br.com.softblue.tictactoe;

public class Espanhol implements InterfaceExemplo {
	
	@Override
	public String fala() {
		
		String fala = "Hola mucho gusto!"; 
		return fala;
		
	}

	@Override
	public int anda(int quilometros) {
		
		int quilometragem = 5000;
		System.out.println("Caminé " + quilometragem + " km hoy."); 
		return quilometragem;
		
	}
}


