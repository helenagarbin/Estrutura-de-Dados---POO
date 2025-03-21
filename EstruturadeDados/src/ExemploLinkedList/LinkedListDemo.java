package ExemploLinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {		
		LinkedList<Character> listaencadeada = new LinkedList<Character>();	
		//metodo add para adicionar elementos 
		listaencadeada.add('B');
		listaencadeada.add('E'); 
		listaencadeada.add('F'); 
		System.out.println("Elementos Originais da lista " +listaencadeada);	
		//alem desse metodo existe esses:
		listaencadeada.addLast('G'); 
		listaencadeada.addFirst('A');
		//adiciona nas extremidades
		System.out.println("Depois dos metodos addFirst() e addLast() os elementos serão: " +listaencadeada);
		//metodo adicionar elementos no indice
		listaencadeada.add(2, 'D');
		listaencadeada.add(2, 'C');
		System.out.println("Depois das alterações:" +listaencadeada);
	}
}
