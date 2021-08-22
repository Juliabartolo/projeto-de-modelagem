package model;

public class ModalidadePedido {
	private ModalidadeServico modalidade;
	private float metragem;
	private Money precoMetro;
	private String observacao;
	
	//Metodos
	public Money obterSubtotal() {
		return metragem * precoMetro;
	}
}
