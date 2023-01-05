package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class testeToString2 {
	
	public static void main(String[] args) {
	
		ContaCorrente cc = new ContaCorrente(22,44);
		Object cp = new ContaPoupanca(22,55);
		
		System.out.println(cc);
		System.out.println(cp);
	}
	
	
	

}
