package LinkedListProva;

import java.util.LinkedList;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		LinkedList<Impressao> filaImpressao = new LinkedList<>();
		
		filaImpressao.add(new Impressao ("Relatório Anual", 15)); 
		filaImpressao.add(new Impressao("TCC", 25)); 
		filaImpressao.add(new Impressao("Documentação", 10));
		
		
		Impressao proximaImpressao = filaImpressao.removeFirst();
		System.out.println("Impressão removida: " +proximaImpressao.getTitulo());
		
		System.out.println("Impressões restantes na lista: ");
		for(Impressao impressao: filaImpressao)
		{
			System.out.println(impressao.getTitulo());
		}

	}

}
