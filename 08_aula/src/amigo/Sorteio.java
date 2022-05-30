package amigo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) throws ParseException {

		// Instances
		Random index = new Random();

		// Scanner int
		Scanner numPessoas = new Scanner(System.in);

		// Scanner String
		Scanner resposta = new Scanner(System.in);

		// Variables
		int valor;
		String respostaSorteio, presente, nome, aniversario;
		Participante participante;
		

		// --------Program-----------
		
		System.out.println("Quantas pessoas deseja sortear?");
		valor = numPessoas.nextInt();

		// Array
		List<Participante> nomes = new ArrayList<Participante>();

		for (int i = 0; i < valor; i++) {
			
			participante = new Participante();
			
			System.out.println("O nome da pessoa: " + (i + 1));
			nome = resposta.next();
			
			System.out.println("Digite o presente");
			presente = resposta.next();
			
			System.out.println("Digite o aniversário");
			aniversario = resposta.next();
			
			
			
			nomes.add(participante);
			
			participante.setNome(nome);
			participante.setPresente(presente);
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			
			participante.setAniversario(formato.parse(aniversario));
//			participante.setAniversario(niver);
			
		}

		System.out.println("Deseja realizar o sorteio? S/N");
		respostaSorteio = resposta.next();

		if (respostaSorteio.equals("S")) {
			
//			System.out.println("A pessoa sorteada foi: " + nomes.get(index.nextInt(nomes.size())).getNome() + " "
//														+ nomes.get(index.nextInt(nomes.size())).getPresente() );
			
			System.out.println(nomes.get(index.nextInt(nomes.size())));
			
		} else if (respostaSorteio.equals("N")) {
			
			System.out.println("O sorteio foi finalizado");
			
		} else {
			
			System.out.println("Resposta inválida");
			
		}
	}

}
