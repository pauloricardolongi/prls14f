package entities;

public class Inividual extends taxaPagamento {
	
	private Double despesaSaude;
	
	public Inividual() {
		
	}

	public Inividual(String nome, Double rendaAnual, Double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}



	public Double getDespesaSaude() {
		return despesaSaude;
	}



	public void setDespesaSaude(Double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	@Override
	public double taxa() {
		double taxaBasica;
		if(getRendaAnual() < 20000.0) {
			taxaBasica= getRendaAnual() * 15.0 /100.0;
		}
		else {
			taxaBasica = getRendaAnual() * 25.0/100.0;
		}
		taxaBasica = taxaBasica - getDespesaSaude()* 0.5;
		if(taxaBasica < 0.0) {
			taxaBasica =  0.0;
		}
		
		{
			return taxaBasica;
		}
	}
}

	
		
	
	


