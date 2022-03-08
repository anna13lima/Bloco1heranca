package Atividade;

public class Cavalo extends Cachorro{
	
	private String alimentacao;
	
	public void alimento()
	{
		System.out.println("Esse cavalo se alimenta de : "+alimentacao);
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	

}
