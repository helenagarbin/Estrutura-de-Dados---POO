package questao6;

import java.util.LinkedList;

public class MaquinaDeKaraoke {
		private LinkedList <String> filaDeMusicas;

		public MaquinaDeKaraoke() {
			filaDeMusicas = new LinkedList<>();
		} 
		
		public void adicionarMusica(String musica)
		{
			filaDeMusicas.addLast(musica); 
			System.out.println("Música adionada: " +musica);
		}
		
		public void executarMusica ()
		{
			if(filaDeMusicas.isEmpty())
			{
				System.out.println("Não tem musicas na fila");
			} 
			else {
				System.out.println("Rodando: "+filaDeMusicas.removeFirst());
			}
		}

		public String toString() {
			StringBuffer lista = new StringBuffer(filaDeMusicas.size()*50);
			for(int i=0; i<filaDeMusicas.size(); i++)
			{
				String musica = filaDeMusicas.get(i); 
				lista.append((i+1) + ": " +musica); 
				lista.append("\n"); 
			}
			return lista.toString(); 
		} 
			
}
	
