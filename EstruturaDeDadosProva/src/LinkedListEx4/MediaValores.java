package LinkedListEx4;

import java.util.LinkedList;

public class MediaValores {

	public static void main(String[] args) {
		LinkedList<Double> pilha = new LinkedList<>(); 
		
		pilha.push(10.0);
		pilha.push(10.0);
		pilha.push(10.0); 
		pilha.push(10.0);
		pilha.push(10.0);
		
		double soma = 0.0; 
		
		while(!pilha.isEmpty())
		{
			soma = soma + pilha.pop(); 
		}
		
		double media = soma/5; 
		System.out.println("Média é: " +media);
		
		
		
	}
}
