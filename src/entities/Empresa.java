package entities;

public class Empresa extends taxaPagamento {
	private Integer numeroFuncionario;
	
	public Empresa() {
		
	}	

	public Empresa(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}
	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}
	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public double taxa() {
		if(numeroFuncionario > 10) {
			return getRendaAnual() * 0.14;
		}else {
			return getRendaAnual()* 0.16;
		}
	}

}
