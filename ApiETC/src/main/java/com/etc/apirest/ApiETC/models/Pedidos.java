package com.etc.apirest.ApiETC.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PEDIDOS")
public class Pedidos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_pedidos;
	
	private String localOrigem;
	
	private String localDestino;
	
	private String dataIda;
	
	private String dataVolta;

	public Integer getId_pedidos() {
		return id_pedidos;
	}

	public void setId_pedidos(Integer id_pedidos) {
		this.id_pedidos = id_pedidos;
	}

	public String getLocalOrigem() {
		return localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	public String getLocalDestino() {
		return localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}

	public String getDataIda() {
		return dataIda;
	}

	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}

	public String getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}
	
}
