package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.nfse_nf")
public class NotaRelat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String nome_razao_social;
	private String cidade;
	private String cpfcnpj;
	private String valor_total;
	private String valor_ir;
	
	public NotaRelat() {

	}

	public NotaRelat(int id, String nome_razao_social, String cidade, String cpfcnpj, String valortotal, String valorir) {
		super();
		this.id = id;
		this.nome_razao_social = nome_razao_social;
		this.cidade = cidade;
		this.cpfcnpj = cpfcnpj;
		this.valor_total = valortotal;
		this.valor_ir = valorir;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getnome_razao_social() {
		return nome_razao_social;
	}

	public void setnome_razao_social(String nome_razao_social) {
		this.nome_razao_social = nome_razao_social;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public String getValortotal() {
		return valor_total;
	}

	public void setValortotal(String valortotal) {
		this.valor_total = valortotal;
	}

	public String getValorir() {
		return valor_ir;
	}

	public void setValorir(String valorir) {
		this.valor_ir = valorir;
	}
}