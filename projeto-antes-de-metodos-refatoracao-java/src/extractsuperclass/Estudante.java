package extractsuperclass;

public class Estudante {
	private String nome;
	private String cpc;
	private String matricula;
	private double ira;
	

	
	public void comer() {
		System.out.println("Comer");
	}
	
	public void estudarParaProvaFacul() {
		System.out.println("Estudando");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpc() {
		return cpc;
	}
	public void setCpc(String cpc) {
		this.cpc = cpc;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	
	
	
	
	
	

}
