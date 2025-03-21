package ExemploFilasePilhas;

import java.util.LinkedList;

public class Exemplo {
		public static void main(String[] args) {
			//instanciando 
			LinkedList<Integer> pilha = new LinkedList<Integer>();	
			pilha.push(1);
			pilha.push(2);
			pilha.push(3);
			pilha.addFirst(4);  
			pilha.pop(); 
			pilha.pop(); 
			pilha.removeFirst(); 
			System.out.println(pilha);		
	}
}
