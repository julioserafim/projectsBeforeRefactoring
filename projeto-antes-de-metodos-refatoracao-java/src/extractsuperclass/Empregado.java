package extractsuperclass;

public class Empregado {
	
	private String nome;
	private String cpf;
	private String carteiraDeTrabalho;
	
	
	
	
	
	public void comer() {
		System.out.println("Comer");
	}
	
	public void trabalharEscritorio() {
		System.out.println("Trabalhando no escritório");
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
	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}
	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}
	
	
}
