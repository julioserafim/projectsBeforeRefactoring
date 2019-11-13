package decomposeconditional;

import java.util.Date;

public class HotelEmJeri {
	private double taxaVerao;
	private double taxaInverno;
	
	
	public double precoDiaria(int mes, double precoBase) {
		double precoTotal;
		
		if(mes == 7 || mes == 12) {
			precoTotal = precoBase * taxaVerao;
		}
		else {
			precoTotal = precoBase * taxaInverno;
		}
		
		return precoTotal;
			
			
	}

}
