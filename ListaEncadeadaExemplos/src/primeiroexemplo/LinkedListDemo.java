package primeiroexemplo;
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<Character> lista1 = new LinkedList<Character>(); 
		
		//metodo add para ir adicionando a lista 
		//add e remove 
		lista1.add('B'); 
		lista1.add('E'); 
		lista1.add('F'); 
		System.out.println("Lista com o método add: " + lista1);
		
		//metodo addFirst e addLast, extremidades da lista
		lista1.addFirst('G'); //primeira posição
		lista1.addLast('H'); //segundo posição
		System.out.println("Lista com os métodos addFirst e addLast: " +lista1);
		
		//metodo add para adicionar um elemento com indice 
		lista1.add(1, 'D');
		lista1.add(2, 'C');	
		System.out.println("Lista com os métodos de add com indice: " +lista1);
	}
}
