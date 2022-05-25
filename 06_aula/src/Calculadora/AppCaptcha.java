package Calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppCaptcha {

	public static void main(String[] args) {
		String entrada;
		String captcha;
		boolean continua = true;

		Scanner teclado = new Scanner(System.in);
		AppCaptcha app = new AppCaptcha();

		do {
			captcha = app.gerarCaptcha();

			System.out.println("------------");
			System.out.println(captcha);
			System.out.println("------------");
			System.out.println("Digite o código acima: ");
			entrada = teclado.next();

			if (captcha.equals(entrada)) {
				System.out.println("Parabens! Você não é um robô!");
				continua = false;
			} else {
				System.out.println("Robôs não são permitidos");
			}

		} while (continua);

		teclado.close();
	}

	public String gerarCaptcha() {
		String captcha = "";
		int valor;

		List<String> urna = new ArrayList<String>();
		urna.add("A");
		urna.add("B");
		urna.add("C");
		urna.add("D");
		urna.add("E");
		urna.add("F");
		urna.add("G");
		urna.add("H");
		urna.add("I");
		urna.add("J");
		urna.add("K");
		urna.add("L");
		urna.add("M");
		urna.add("N");
		urna.add("O");
		urna.add("P");
		urna.add("Q");
		urna.add("R");
		urna.add("S");
		urna.add("T");
		urna.add("U");
		urna.add("V");
		urna.add("X");
		urna.add("W");
		urna.add("Y");
		urna.add("Z");
		
		urna.add("0");
		urna.add("1");
		urna.add("2");
		urna.add("3");
		urna.add("4");
		urna.add("5");
		urna.add("6");
		urna.add("7");
		urna.add("8");
		urna.add("9");
		
		urna.add("a");
		urna.add("b");
		urna.add("c");
		urna.add("d");
		urna.add("e");
		urna.add("f");
		urna.add("g");
		urna.add("h");
		urna.add("i");
		urna.add("j");
		urna.add("k");
		urna.add("l");
		urna.add("m");
		urna.add("n");
		urna.add("o");
		urna.add("p");
		urna.add("q");
		urna.add("r");
		urna.add("s");
		urna.add("t");
		urna.add("u");
		urna.add("v");
		urna.add("x");
		urna.add("w");
		urna.add("y");
		urna.add("z");
		
		

		Random sorteio = new Random();
		//URNA SIZE CAPTURA TODOS OS ELEMENTOS DO ARRAY
		for (int i = 0; i < 6; i++) {
			valor = sorteio.nextInt(urna.size());
			captcha += urna.get(valor);
		}
		return captcha;
	}

}
