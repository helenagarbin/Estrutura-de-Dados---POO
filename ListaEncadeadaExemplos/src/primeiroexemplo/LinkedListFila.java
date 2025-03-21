package primeiroexemplo;
import java.util.LinkedList;
public class LinkedListFila {
	public static void main(String[] args) {
		LinkedList<Integer> fila = new LinkedList<Integer>(); 
		//metodo para colocar no final
		fila.addLast(4);
		fila.addLast(3);
		fila.addLast(2);
		fila.addLast(1);
		System.out.println(fila);
		//metodo para removeFarst, primeiro a entrar é o ultimo a sair
		fila.removeFirst(); 
		System.out.println(fila);	
		//pegar alguem especifico pelo indice
		System.out.println(fila.get(0)); 
	}
}
