package primeiroexemplo;

import java.util.LinkedList;

public class LinkedListPilha {

	public static void main(String[] args) {
		
		//instanciar 
		LinkedList<Integer> pilha = new LinkedList<Integer>(); 
		//metodo para empilhar, adicionar no topo
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		System.out.println(pilha);
		//metodo pop, vai tirar o primeiro do topo 
		pilha.pop(); 
		pilha.pop(); 
		pilha.removeFirst(); 
		System.out.println(pilha);		
	}
}
