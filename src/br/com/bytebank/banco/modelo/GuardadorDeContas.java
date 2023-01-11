package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Object[]referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Object[10];
	}
	
	public void adiciona(Object ref) {
		referencias[this.posicaoLivre]=ref;
				this.posicaoLivre++;
	}

	public int getQuantidadeElemento() {
		return this.posicaoLivre; // quantos elementos foram guardados 
	}

	public Object getReferencia(int posicao) {
		return this.referencias[posicao];
		
	}

}
