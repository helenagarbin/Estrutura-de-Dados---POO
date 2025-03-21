package LinkedListKaraoke;

import java.util.LinkedList;

public class MaquinaKaraoke {

	private LinkedList<String> filaMusicas; //encapsulamento 

	public MaquinaKaraoke(LinkedList<String> filaMusicas) {
		super();
		this.filaMusicas = filaMusicas;
	}
	
	public void adicionaMusica(String musica)
	{
		filaMusicas.addLast(musica);
	}
	
	public void executaMusica()
	{
		if(filaMusicas.isEmpty())
		{
			System.out.println("Fila está vazia");
		}
		else
		{
			System.out.println("Rodando: " +filaMusicas.pop());
		}
	}
	
	public void listaMusicas()
	{
		for(String i: filaMusicas) //for each
		{
			System.out.println(i);
		}
	}
}
