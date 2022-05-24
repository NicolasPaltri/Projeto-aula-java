package Calculadora;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {

		double primeiroNumero, segundoNumero;
		String operacao, resposta;

		Calculos calculo = new Calculos();
		Scanner teclado = new Scanner(System.in);
		
		

		System.out.println("Digite o primeiro n�mero: ");
		primeiroNumero = teclado.nextDouble();

		System.out.println("Digite o segundo valor:");
		segundoNumero = teclado.nextDouble();

		resposta = "sim";

		while (resposta.equals("sim")) {

			System.out.println("Escolha uma das opera��es (+, -, *, /)");
			operacao = teclado.next();

				System.out.println("O resultado �: " + calculo.calcular(primeiroNumero, segundoNumero, operacao));
			
			System.out.println("Gostaria de fazer outra opera��o? Digite sim ou n�o");
			resposta = teclado.next();

		}

	}
	
	public double calcular(double primeiroNumero, double segundoNumero, String operacao) {

		Calculadora calculadora = new Calculadora();
		double resultado = 0;
		
		if (operacao.equals("+")) {

			resultado = calculadora.somar(primeiroNumero, segundoNumero);

		} else if (operacao.equals("-")) {

			resultado = calculadora.subtrair(primeiroNumero, segundoNumero);

		} else if (operacao.equals("*")) {

			resultado = calculadora.multiplicar(primeiroNumero, segundoNumero);

		} else if (operacao.equals("/")) {

			resultado = calculadora.dividir(primeiroNumero, segundoNumero);

		} else {

			System.out.println("N�o � poss�vel fazer essa opera��o");
		}
		
		return resultado;

	}
}