package atividadeFixacao;

import java.util.LinkedList;

public class MaquinaDeKaraoke {
	
		private LinkedList<String> filaMusicas;
		
		public MaquinaDeKaraoke(LinkedList<String> filaMusicas) {
			filaMusicas = new LinkedList<String>(); 
		}
		
		public void adicionaMusica(String m)
		{
			filaMusicas.addLast(m);
	}
		
		public void executaMusica()
		{
			if(filaMusicas.isEmpty())
			{
				System.out.println("Não há músicas na fila");
			}
			else 
			{
				System.out.println("Rodando: " +filaMusicas.removeFirst());
			}
		}

}
