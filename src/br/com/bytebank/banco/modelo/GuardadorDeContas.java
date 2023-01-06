package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[]referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
	}
	
	public void adiciona(Conta ref) {
		referencias[this.posicaoLivre]=ref;
				this.posicaoLivre++;
	}

	public int getQuantidadeElemento() {
		return this.posicaoLivre; // quantos elementos foram guardados 
	}

	public Conta getReferencia(int posicao) {
		return this.referencias[posicao];
		
	}

}
