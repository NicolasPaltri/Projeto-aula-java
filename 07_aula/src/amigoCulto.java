

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class amigoCulto {

	public static void main(String[] args) {
		String pary, iniciar;
		int qtdPessoas;
		String pos;
		
		
		Scanner nomePessoa = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		
		List<String> nomes = new ArrayList<String>();
		
		Random posicao = new Random();
		
		
		System.out.println("Quantas pessoas irão participar?");
		qtdPessoas = teclado.nextInt();
		
		for(int i = 0; i<qtdPessoas; i++ ) {
			
			System.out.println("Nome dos participantes");
			pary = nomePessoa.next();
			nomes.add(pary);
		}
		
		System.out.println("Deseja  sortear?");
		iniciar = nomePessoa.next();
		
		if(iniciar.equals("Sim")) {
			System.out.println(nomes.get(posicao.nextInt(nomes.size())));
		}else {
			teclado.close();
		}
	}

}