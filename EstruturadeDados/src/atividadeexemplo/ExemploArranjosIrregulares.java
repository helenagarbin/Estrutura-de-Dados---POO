package atividadeexemplo;

public class ExemploArranjosIrregulares {
	
	public static void main(String[] args) {
		
		int[][] passageiros = new int[7][]; 
		//declaração 
		//inicializando com tamanho 7 dias da semana, area da coluna sem preencher
		passageiros[0]= new int[10];
		passageiros[1]= new int[10];
		passageiros[2]= new int[10];
		passageiros[3]= new int[10];
		passageiros[4]= new int[10]; 
		//primeira linha, segunda linha, ..., 
		// ate dias da semana (segunda a sexta) com 10 colunas (10 viagens) 
		passageiros[5]= new int [2]; 
		passageiros[6]= new int [2];
		//restante das linhas dos dias da semana com 2 colunas, finais de semana 
	}
}
