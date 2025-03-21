package LinkedListEx4;

import java.util.LinkedList;

public class Lista {
	public static void main(String[] args) {
		
	LinkedList<String> lista = new LinkedList<String>();
	
	lista.add("A"); 
	lista.add("B"); 
	lista.add("C"); 
	lista.add("D"); 
	
	String resultado = String.join("-", lista); 
	
	System.out.println(resultado);
	
	}

}
