package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;
public class TesteArrayReferencias {

	public static void main(String[] args) {
		Conta[]contas = new Conta[5]; // array mais genérico que aceita todo tipo de conta
		//ContaCorrente[] contas = new ContaCorrente[5]; // array de contas que guarda 5 contas
		ContaCorrente cc1 = new ContaCorrente(11,22);
		
		contas[0]=cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22,33);
		contas[1]=cc2;
		
		ContaPoupanca cp1 = new ContaPoupanca(33,44);
		contas[2]=cp1;
		
		System.out.println(contas[1].getNumero());
		ContaCorrente ref =  (ContaCorrente) contas[0];// tem que deixar claro com cast que a referência é de uma ContaCorrente
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		System.out.println(cp1.getNumero());
		System.out.println(contas[2].getNumero()); // possível ser acessado pelas duas formas e também por referência
		
		
		
		
		
		

	}

}
