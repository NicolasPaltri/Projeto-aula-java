import java.util.ArrayList;
import java.util.List;

public class App {

	/*Demonstração do uso de ArrayList*/
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Matheus");
		lista.add("Joao");
		lista.add("Beatriz");
		lista.add("Marcus");
		lista.add("Vinicius");
		lista.add("Lucas Renan");
		lista.add("Lucas");
		lista.add("Danilo");
		lista.add("Filipe");
		lista.add("Arian");
		lista.add("Ana");
		lista.add("Nicolas");
		lista.add("Henrrique");

		for(String temp: lista) {
	System.out.println(temp);
}
		//Procurando na lista
		System.out.println("O Array tem " + lista.size() + " elementos.");
		System.out.println(lista.contains("Beatriz"));
		System.out.println("O valor está no indice " + lista.indexOf("Beatriz"));
		System.out.println("O Conteudo do indice 2 é " + lista.get(2));
	}

}
