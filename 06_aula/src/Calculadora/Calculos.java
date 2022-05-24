package Calculadora;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {

		double primeiroNumero, segundoNumero;
		String operacao, resposta;

		Calculos calculo = new Calculos();
		Scanner teclado = new Scanner(System.in);
		
		

		System.out.println("Digite o primeiro número: ");
		primeiroNumero = teclado.nextDouble();

		System.out.println("Digite o segundo valor:");
		segundoNumero = teclado.nextDouble();

		resposta = "sim";

		while (resposta.equals("sim")) {

			System.out.println("Escolha uma das operações (+, -, *, /)");
			operacao = teclado.next();

				System.out.println("O resultado é: " + calculo.calcular(primeiroNumero, segundoNumero, operacao));
			
			System.out.println("Gostaria de fazer outra operação? Digite sim ou não");
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

			System.out.println("Não é possível fazer essa operação");
		}
		
		return resultado;

	}
}