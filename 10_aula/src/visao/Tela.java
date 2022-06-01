package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;

import util.Util;

public class Tela {
	public Cliente desenharIncluir() {
		Scanner teclado = new Scanner(System.in);
		String nome, telefone;
		int idade;
		Cliente cliente = new Cliente();

		System.out.println("---------------------------");
		System.out.println("informe o nome do cliente");
		teclado.nextLine();
		nome = teclado.nextLine();

		System.out.println("informe o telefone do cliente");
		telefone = teclado.next();

		System.out.println("qual a idade do cliente?");
		idade = teclado.nextInt();

		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setIdade(idade);

		//teclado.close();

		return cliente;
	}

	public void listaCliente(List<Cliente> banco) {
		for(Cliente c: banco) {
			System.out.println(banco.indexOf(c) + " - " + c.getNome() + " - " + c.getTelefone() + " - " + c.getIdade());
		}
	}

	public void exibirMedia(List<Cliente> banco) {
		Util util = new Util();
		System.out.println("A média das idades é : " + util.calcularMedia(banco));
	}
}
