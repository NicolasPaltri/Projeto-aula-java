package amigo;

import java.util.Date;

public class Participante {
	private String nome;
	private String presente;
	private Date aniversario;

	public String getNome() {
		return nome;
	}

	public String getPresente() {
		return presente;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPresente(String presente) {
		this.presente = presente;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
		
		

	}

	@Override
	public String toString() {
		return "Participante [nome=" + nome + ", presente=" + presente + ", aniversario=" + aniversario + "]";
	}

}
