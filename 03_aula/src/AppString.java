
public class AppString {

	public static void main(String[] args) {
		Pelicano[] filhotes= new Pelicano[3];
		
		Pelicano p1 = new Pelicano();
		Pelicano p2 = new Pelicano();
		
		p1.setCor("Branco");
		p1.setPeso(10);
	
		
		filhotes[0] = p1;
		filhotes[1] = p2;
		filhotes[2] = new Pelicano();
		
		filhotes[1].setCor("Azul");
		filhotes[1].setPeso(50);
		
		filhotes[2].setCor("Preto");
		filhotes[2].setPeso(40);
		
		System.out.println(filhotes[0].getCor()+(" ")+filhotes[0].getPeso());
		filhotes[0].voar();
		filhotes[1].voar();
		filhotes[2].voar();
		
		for(Pelicano exemplo: filhotes) {
			System.out.println("O pelicano tem a cor " + exemplo.getCor() +(" ") + ("e o peso ? ") + exemplo.getPeso());
			
		}
	}

}