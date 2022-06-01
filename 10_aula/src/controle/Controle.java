package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import util.Util;
import visao.Tela;

public class Controle {
	List<Cliente> banco = new ArrayList<Cliente>();
	
	public void avaliarOpcao(int opcao) {
		Tela tela = new Tela();
		
		if(opcao == 1) {//Incluir cliente
			tela.desenharIncluir();
			
		}else if(opcao == 2) {//Lista cliente
			
			tela.listaCliente(banco);
			
		}else if(opcao == 3){//exibir Media
			
			tela.exibirMedia(banco);
		
		}else if(opcao == 0) {
			Util util = new Util();
			List<Cliente> banco = util.carregarBanco();
		
}
}
}