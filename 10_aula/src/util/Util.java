package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.Cliente;

public class Util {

	public List<Cliente> carregarBanco(){
		List<Cliente> lista = new ArrayList<Cliente>();
		List<String> nomes = new ArrayList<String>();
		Cliente cliente;
		Random random = new Random();
		
		nomes.add("Nicolas");
		nomes.add("Carla");
		nomes.add("Claudia");
		nomes.add("João");
		nomes.add("Toni");
		nomes.add("Fabio");
		nomes.add("Edina");
		nomes.add("Lucas");
		
		for(int i = 0; i < 5; i++) {
			cliente = new Cliente();
			
			cliente.setNome(nomes.get(random.nextInt(nomes.size())));
			cliente.setTelefone("xx-xxxx-xxx"+i);
			cliente.setIdade(random.nextInt(98) + 1);
			
			lista.add(cliente);
		}
		
		return lista;
	}
	public double calcularMedia(List<Cliente> lista) {
		int somaIdade = 0;
		for(Cliente c: lista) {
			somaIdade += c.getIdade();
		}
		
		return(somaIdade / lista.size());
	}
}
