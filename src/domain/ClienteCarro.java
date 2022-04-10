package domain;

import java.time.LocalDateTime;

public class ClienteCarro {
	private Cliente cliente;
	private Carro carro;
	private LocalDateTime data;
	private String movimento;
	
	public ClienteCarro(Cliente cliente, Carro carro, LocalDateTime data, String movimento) {
		super();
		this.cliente = cliente;
		this.carro = carro;
		this.data = data;
		this.movimento = movimento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}

	@Override
	public String toString() {
		return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() + " às " +
			   data.getHour() + ":" + data.getMinute() + ":" + data.getSecond() +
				": " +
			   "Carro " + carro.getMarca() + " (marca), " + 
			   carro.getModelo() + " (modelo), " + 
			   carro.getPlaca() + " (placa), " +
			   "foi " +
			   this.getMovimento() +
			   " por " +
			   cliente.getNome() + " (nome do Cliente)";
	}
	
}
