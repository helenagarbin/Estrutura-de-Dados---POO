package LinkedListKaraoke;

import java.util.LinkedList;

public class ProgramPrincipal {
	public static void main(String[] args) {
		LinkedList<String> maquina = new LinkedList<String>(); 
		
		MaquinaKaraoke maq = new MaquinaKaraoke(maquina); 
		
		maq.adicionaMusica("Sorry"); 
		maq.adicionaMusica("What Do You Mean");
		maq.adicionaMusica("Pourpose");
		maq.adicionaMusica("Confident");
		maq.adicionaMusica("Yummy");
		
		//System.out.println(maq);
		
		maq.executaMusica();
		maq.executaMusica();
		
		//System.out.println(maq);
		maq.listaMusicas();
		
	}

}
