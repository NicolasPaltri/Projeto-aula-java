package Animal;

public class App {

	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		Tatu t1 = new Tatu();
		Cachorro c1 = new Cachorro();

	
			g1.setHora(7);
			g1.setCor("malhado");
			g1.setPeso(50);
			g1.setTamanho(30);

			g1.emitirSom();
			System.out.print("O gato " + g1.getCor());
			g1.dormir();
			g1.comer();

		
			
			t1.emitirSom();

			
			Animal[] animais = new Animal[2];

			animais[0] = new Gato();
			animais[1] = new Tatu();
			

			for (Animal a : animais) {
				a.emitirSom();
			}
			
			g1.brincar();
			c1.brincar();

		}

	}