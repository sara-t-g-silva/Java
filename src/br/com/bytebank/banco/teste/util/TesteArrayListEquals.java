package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		//Generics
		ArrayList<Conta> lista = new ArrayList<>();
						
		Conta cc = new ContaCorrente(22,22);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		//lista.add(cc2);
		
		boolean existe = lista.contains(cc2);// mesmo iguais, o método compara só as referÊncias, não os elementos dentro
		System.out.println(existe);
								
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
		
		boolean igual = cc.equals(cc2);
		System.out.println(igual);
		
	}

}
