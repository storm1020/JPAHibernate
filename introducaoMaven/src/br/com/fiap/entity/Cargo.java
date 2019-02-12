package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name= "T_CARGO") //Anota��o n�o obrigat�rio.
@SequenceGenerator(name="cargo", sequenceName="SQ_T_CARGO", allocationSize=1) // Se n�o for colocado allocationSize=1, � incrementado de 50 em 50.
public class Cargo {
	
	@Id
	@Column(name="cd_cargo")
	@GeneratedValue(generator="cargo", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="vl_salario", nullable = false)
	private float salario;
	
	@Column(name="ds_nivel")
	private Nivel nivel;
	
	@Column(name="ds_cargo", length = 300)
	private String descricao;
	
	@Column(name="dt_cadastro", updatable = false, nullable = false) // Updatable = false (s� ser cadastrado, e n�o editado mais).
	private Calendar dataCadastro;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
