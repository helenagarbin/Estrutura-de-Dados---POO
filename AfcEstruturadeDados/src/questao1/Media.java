package questao1;

public class Media {
	public static void main(String[] args) {
		double [] valores = {2,2,2,2}; 
		
		double soma=0.0; 
		
		for(double valor: valores)
		{
			soma = soma + valor; 
		}
		
		double media = soma/valores.length; 
		
		System.out.println("A média de valores é: " +media);
	}

}
