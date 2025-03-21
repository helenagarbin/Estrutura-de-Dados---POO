package InterfaceComLinkedList;

import java.util.LinkedList;

import LinkedListProva.Impressao;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		LinkedList<String> instrumentoMusical = new LinkedList<>(); 
		
		Guitarra G1 = new Guitarra(); 
		Teclado T1 = new Teclado(); 
		Violao V1 = new Violao(); 
		
		instrumentoMusical.add("Tocando Guitarra"); 
		instrumentoMusical.add("Tocando Teclado"); 
		instrumentoMusical.add("Tocando Violão"); 
		
		System.out.println(instrumentoMusical);
	}
}
