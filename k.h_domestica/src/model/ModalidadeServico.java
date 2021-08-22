package model;
import java.time.LocalTime;

public class ModalidadeServico {
	private int codModalidade;
	private String nome;
	private Money precoAtual;
	private LocalTime tempo;
	
	
	//Métodos
	public void alterarModalidade(String nome, Money precoAtual, LocalTime tempo) {
		this.nome = nome;
		this.precoAtual = precoAtual;
		this.tempo = tempo;
	}
}
