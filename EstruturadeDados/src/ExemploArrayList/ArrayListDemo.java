package ExemploArrayList;

import java.util.ArrayList;
//import automat, para essas classes que estão nesse pacote util 

public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList<Character> lista = new ArrayList<Character>();
	//declara o objeto da classe ArrayList: lista 
	//tipo dentro do < >, classe empacotadora do tipo char	
	System.out.println("Tamanho: " +lista.size()); 
	//metodo size para retorna tamanho 
	//metodo add pra adicionar elementos(caracteres)
	// no final da lista 
	lista.add('A'); 
	lista.add('B'); 
	lista.add('C'); 
	lista.add('D'); 
	lista.add('E'); 
	lista.add('F'); 
	//cada elemento ocupa uma posição na memoria, vai sendo armazenado 
	//sem ser esse metodo pode ser add no indice 
	System.out.println("Tamanho depois do metodo de adição: " +lista.size());	
}
}
