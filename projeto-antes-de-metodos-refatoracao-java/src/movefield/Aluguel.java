package movefield;

public class Aluguel {
	private Filme filme;
	private double valorTotal;
	
	
	
	public double calculoDoAluguel(Aluguel aluguel, Filme filme) {
		this.valorTotal = filme.getDias() * filme.getPrecoDiario();
		return valorTotal;
	}
	
	public double retornarDiasAlugados(Filme filme) {
		return filme.getDias();
	}
	
	
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
	
	
	
	

}
