package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Mario"; // object literal
		String outro = new String ("Alura"); // má prática
		
		//String novo = outro.replace("A","a");
		//String novo = outro.toLowerCase();
		String novo = outro.toUpperCase();	
		System.out.println(novo);
		
		char c = nome.charAt(3);
		
		System.out.println(c);
		
		int pos = nome.indexOf("rio"); // informa onde começa a posição no array
		System.out.println(pos);
		
		String sub = nome.substring(2);// escreve a partir da posição mencionada
		System.out.println(sub);
		
		for(int i=0;i<nome.length();i++) {
			System.out.println(nome.charAt(i));
			
			//https://docs.oracle.com/javase/10/docs/api/java/lang/String.html
		}
	}
	
	
	
	
	

}
