package Atividade;

public class Cachorro extends Animal {

	private String raca;
	private double correr;
	
	public void velocidade()
	{
		System.out.print("este cachorro da raça: "+raca+"atinge a velocidade: "+correr);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getCorrer() {
		return correr;
	}

	public void setCorrer(double correr) {
		this.correr = correr;
	}
}
