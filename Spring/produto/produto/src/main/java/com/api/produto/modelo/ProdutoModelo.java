package com.api.produto.modelo;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Produtos")
public class ProdutoModelo {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Codigo")
	private int codigo;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Valor")
	private double valor;
	
	//Get e Set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
