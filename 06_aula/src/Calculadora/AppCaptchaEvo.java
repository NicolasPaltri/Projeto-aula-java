package Calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppCaptchaEvo {

	public static void main(String[] args) {
		String entrada;
		String captcha;
		boolean continua = true;

		Scanner teclado = new Scanner(System.in);
		AppCaptchaEvo app = new AppCaptchaEvo();

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

		String urna = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz0123456789";

		Random sorteio = new Random();
		// length CAPTURA TODOS OS ELEMENTOS
		for (int i = 0; i < 6; i++) {
			valor = sorteio.nextInt(urna.length());
			captcha += urna.subSequence(valor, valor + 1);
		}
		return captcha;
	}

}
