package Atividade;

public class Animalobjeto {

	public static void main(String[] args) {
		Cavalo c1 = new Cavalo();
		Cachorro c2 = new Cachorro();
		Preguica p1 = new Preguica();
		
		c1.setAlimentacao("feno");
		c2.setRaca("viralata");
		p1.setSubiremArvore(true);
		
		System.out.println("o cavalo se alimenta de :"+c1.getAlimentacao());
		System.out.println("a raça do cachorro é: "+c2.getRaca());
		System.out.println("a preguiça sobe em arvore: "+p1.isSubiremArvore());
		

	}

}
