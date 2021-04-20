package br.com.softblue.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Object> tipoLista = new ArrayList<Object>();
		tipoLista.add("abc");             
		tipoLista.add("teste");  
		
		
		for(int i = 0; i < tipoLista.size(); i++){
		    String s = (String) tipoLista.get(i);   
		    System.out.println(s);
		}
	}
}
