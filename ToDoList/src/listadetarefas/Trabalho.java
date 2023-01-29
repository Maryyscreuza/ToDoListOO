package listadetarefas;

import java.util.ArrayList;

public class Trabalho extends Lista {

	private String destinatario;
	protected boolean Tipo2;
	private boolean tipo2;

	public Trabalho(String nome, String destinatario, boolean tip2) {
		this.nome = nome;
		this.destinatario = destinatario;
		this.Tipo2 = tip2;
		this.tarefas = new ArrayList<>();
	}

	// gets sets

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public boolean getTipo2(boolean tipo2) {
		return tipo2;
	}

	public void setTipo2(boolean tipo2) {
		this.Tipo2 = tipo2;
	}

	// outros metodos

	public String atualizaDados(boolean dados) {
		if (toString() == "Presencial") {
			tipo2 = true;
		} else {
			tipo2 = false;
		}
		return toString();
	}

}