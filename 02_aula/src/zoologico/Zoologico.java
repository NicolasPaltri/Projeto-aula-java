package zoologico;

public class Zoologico {

	public static void main(String[] args) {
		Pelicano p1, p2;
		
		p1 = new Pelicano();
		p2 = new Pelicano();
		
		p1.setCor("Branco");
		p1.setPeso(40);
		p2.setCor("Preto");
		p2.setPeso(30);
		
		p1.voar ();
		p2.comer();
		p1.definirNome(" Kleid");
		
		System.out.println("Os pelicanos s?o " +  p1.getCor() + " e " + p2.getCor() );
		System.out.println("Os pelicanos tem as cores " + p2.retornaCor() + (" e ") + p1.retornaCor());

	}
	public void comer() {
		System.out.println("O pelicano est? comendo");
		
	}
	

}
