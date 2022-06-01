package Cliente;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import controle.Controle;
import visao.Menu;
import visao.Tela;

public class App {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		Menu menu = new Menu();
		Controle controle = new Controle();
		
		do {
			menu.desenharMenu();;
			opcao = teclado.nextInt();
			
			controle.avaliarOpcao(opcao);
		}while(opcao < 6);
		
		teclado.close();
	}
}	
			