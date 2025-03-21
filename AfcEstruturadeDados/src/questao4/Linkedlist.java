package questao4;

import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		
	LinkedList<Character> lista = new LinkedList<Character>();	
	
	lista.add('A');
	lista.add('B'); 
	lista.add('C'); 
	lista.add('D'); 
	
	for(int i=0; i<lista.size(); i++)
	{
		System.out.print(lista.get(i));
		
		if(i<lista.size() - 1)
		{
			System.out.print("-");
		}
	}
	
	}
	
}
