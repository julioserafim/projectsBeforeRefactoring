package extractsubclass;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String cpf;
	private String nomeEmprego;
	private Date dataNascimento;
	private String linguagemDeProgramacaoFavorita;
	
	
	
	
	public Pessoa(String nome, String cpf, String nomeEmprego, Date dataNascimento,
			String linguagemDeProgramacaoFavorita) {
		this.nome = nome;
		this.cpf = cpf;
		this.nomeEmprego = nomeEmprego;
		this.dataNascimento = dataNascimento;
		this.linguagemDeProgramacaoFavorita = linguagemDeProgramacaoFavorita;
	}

	public void programar() {
		System.out.println("Programando");
	}
	
	public void trabalhar() {
		System.out.println("Trabalhando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeEmprego() {
		return nomeEmprego;
	}

	public void setNomeEmprego(String nomeEmprego) {
		this.nomeEmprego = nomeEmprego;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getLinguagemDeProgramacaoFavorita() {
		return linguagemDeProgramacaoFavorita;
	}

	public void setLinguagemDeProgramacaoFavorita(String linguagemDeProgramacaoFavorita) {
		this.linguagemDeProgramacaoFavorita = linguagemDeProgramacaoFavorita;
	}
	
	
	
	

}
