package model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Pedido {
	private int codPedido;
	private Money valorTotal;
	private Collection<ModalidadePedido> servicos = new ArrayList<ModalidadePedido>();
	private  Date dataSolicitacao;
	private LocalDateTime dataPedido;
	private Status statusAlocacao;
	
	//Metodos
	public Money obterValorTotal(ArrayList<ModalidadePedido> servicos) {
		for(int i = 0; i < servicos.size(); i++) {
			this.valorTotal += servicos.get(i).obterSubtotal();
		}
	}
	
	public void adicionarModalidade(ModalidadeServico modalidade, float metragem, String observacao) {
		ModalidadePedido novaModalidade = new ModalidadePedido(modalidade, metragem, observacao);
		servicos.add(novaModalidade);
	}
}
