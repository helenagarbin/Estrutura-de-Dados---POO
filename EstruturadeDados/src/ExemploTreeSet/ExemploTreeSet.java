package ExemploTreeSet;

import java.util.TreeSet;

public class ExemploTreeSet {
	
	public static void main(String[] args) {	
		//declar vetor de characteres 
		char[] chrs = {'V', 'J', 'L', 'E', 'T', 'Q', 'C'};
		//objeto da classe TreeSet 
		TreeSet<Character> treeset = new TreeSet<Character>();
		System.out.println("Conteudo de chrs (vetor de characters)");
		for(char x: chrs)
		{
			System.out.print(x+ "");
		}
		for(char c: chrs)
		{
			treeset.add(c); 
			//adionando os elementos do vetor chrs no vetor c
			//do objeto treeset
			//vai manter um ordenamento, não deixa duplicata 
		}
	}
}
