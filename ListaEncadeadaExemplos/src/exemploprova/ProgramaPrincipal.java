package exemploprova;

import java.util.LinkedList;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		LinkedList<String> fila = new LinkedList<>(); 
	
		fila.addFirst("Titulo 1");
		fila.addFirst("Titulo 2");
		fila.addFirst("Titulo 3");
		
		fila.removeFirst(); 
		
		System.out.println(fila);
		
	
		
	}

}
