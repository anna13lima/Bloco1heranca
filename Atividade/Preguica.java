package Atividade;

public class Preguica extends Animal {
	
	private boolean subiremArvore;
	
	public void arvore()
	{
		System.out.println("pregui�a");
	}

	public boolean isSubiremArvore() {
		return subiremArvore;
	}

	public void setSubiremArvore(boolean subiremArvore) {
		this.subiremArvore = subiremArvore;
	}

}
