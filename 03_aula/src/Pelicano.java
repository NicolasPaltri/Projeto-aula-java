

public class Pelicano {
	private boolean bico;
	private String cor;
	private int peso;
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
		
	}
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public boolean getBico() {
		return bico;
	}
	
	public void setBico(boolean bico) {
		this.bico = bico;
	}
	
	public void voar() {
		if(peso > 50) {
		System.out.println("O pelicano n�o consegue voar , est� muito pesado");
	}else {
		System.out.println("O pelicano est� voando!");
	 }
	}
	public void comer() {
		System.out.println("O pelicano est� comendo");
	}
	public void definirNome(String nome) {
		System.out.println("O nome do Pelicano �" + nome);
	}
	public String retornaCor() {
	return cor ;
	}
}
