package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int opcao, idade, media, excluir, listaCliente;
		Cliente cliente;
		String nome, telefone;
		App app = new App();
		Scanner teclado = new Scanner(System.in);
		
		List<Cliente> banco = new ArrayList <Cliente>();
		
		/////////////////////////////////////////////////////////////////////
		
		do {
			System.out.println("--------MENU---------");
			System.out.println("1 - ler cliente");
			System.out.println("2 - listar cliente");
			System.out.println("3 - Mostrar a média da idade dos clientes");
			System.out.println("4 - Alterar cliente");
			System.out.println("5 - Excluir cliente");
			System.out.println("6 - F I M");
			System.out.println("--------------------");
			System.out.println("selecione uma das opções");
			
			opcao = teclado.nextInt();
			
			if(opcao == 1) {
				cliente = new Cliente();
				
				System.out.println("---------------------------");
				System.out.println("informe o nome do cliente");
				nome = teclado.next();
				cliente.setNome(nome);
				
				System.out.println("informe o telefone do cliente");
				telefone = teclado.next();
				cliente.setTelefone(nome);
				
				System.out.println("qual a idade do cliente?");
				idade = teclado.nextInt();
				cliente.setIdade(idade);
				
				banco.add(cliente);
				
				
			} else if(opcao == 2) {
				for(Cliente c: banco) {
					System.out.println(c.getNome() + " - " + c.getIdade());
				}
				
			} else if(opcao == 3) {
				
				System.out.println("A média das idades é " + app.calcularMedia(banco));
			
			}else if (opcao == 4) {
				int i;
				
				System.out.println("Qual indice você deseja alterar? ");
				i = teclado.nextInt();
				
				Cliente novoCliente = banco.get(i);
				
				System.out.println("Qual indice você deseja alterar? ");
				i = teclado.nextInt();
				
				System.out.println("Insira o nome do cliente: ");
				nome = teclado.next();
				
				System.out.println("Insira o numero do telefone : ");
				telefone = teclado.next();
				
				System.out.println("Insira a idade: ");
				idade = teclado.nextInt();
				
				novoCliente.setNome(nome);
				novoCliente.setTelefone(telefone);
				novoCliente.setIdade(idade);
				
				banco.add(novoCliente);
			

				}else if (opcao == 5) {
				System.out.println("Escolha o indice do cliente para excluilo.");
				excluir = teclado.nextInt();
				banco.remove(excluir);
				

				
			}
			
		} while(opcao < 6);
		
		System.out.println("Encerrado");
		teclado.close();

	}
	
	public double calcularMedia(List<Cliente> lista) {
		int somaIdade = 0;
		for(Cliente c: lista) {
			somaIdade += c.getIdade();
		}
		
		return(somaIdade / lista.size());
	}
	
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
}