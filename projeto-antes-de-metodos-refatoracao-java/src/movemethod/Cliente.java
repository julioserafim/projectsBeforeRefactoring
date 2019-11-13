package movemethod;

public class Cliente {
	private String nome;
	private String cpf;
	
	
	public void irParaLocadoraAlugarFilme() {
		System.out.println("Indo para locadora");
	}
	
	public double calculoDoAluguel(Aluguel aluguel, Filme filme) {
		double precoTotal = aluguel.getDias() * filme.getPrecoDiario();
		return precoTotal;
	}

}
