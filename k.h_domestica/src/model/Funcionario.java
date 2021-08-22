package model;

public class Funcionario {
	private int codMatricula;
	private String nome;
	private Telefone telefone;
	private CPF cpf;
	private CTPS ctps;
	
	//Metodos
	public void atualizarDados(String nome, CPF cpf, Telefone telefone, CTPS ctps) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.ctps = ctps;
	}
}
