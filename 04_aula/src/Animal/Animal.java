package Animal;

public class Animal {


	private String cor;
	private int tamanho;
	private int peso;
	private int hora;
	

	public int getHora() {
		return hora;
	}
		
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	

	public void comer() { 
		
if (hora < 8) {
			
			System.out.print(" e não está com fome.");
			
		} else {
			
			System.out.print(" Em breve irá procurar comida");
		}

		
	}

	public void dormir() {

		if (hora < 8) {
			
			System.out.print(" está a dormindo,");
			
		} else {
			
			System.out.print(" está acordado");
		}

	}

	public void emitirSom() {
		
		System.out.println("Miau!");

	}
		

}