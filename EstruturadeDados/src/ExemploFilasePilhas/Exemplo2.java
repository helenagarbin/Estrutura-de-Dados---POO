package ExemploFilasePilhas;

import java.util.LinkedList;

public class Exemplo2 {
		public static void main(String[] args) {
		//instanciando 
		LinkedList<Integer> fila = new LinkedList<Integer>();		
		//metodo para adicionar ao final 
		fila.addLast(1); //equivalente ao add
		fila.addLast(2);
		fila.addLast(3);
		//metodo para alguem especifico da fila 
		System.out.println(fila.get(0)); //informa o indice 
	}
}

