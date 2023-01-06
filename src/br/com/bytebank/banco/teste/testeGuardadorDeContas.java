package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.Conta;

public class testeGuardadorDeContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta cc = new ContaCorrente(11,22);
		guardador.adiciona(cc);
		Conta cc2 = new ContaCorrente(22,33);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeElemento();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref);
		

	}

}
