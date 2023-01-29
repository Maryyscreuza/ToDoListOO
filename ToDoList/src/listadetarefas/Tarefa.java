package listadetarefas;

import java.util.ArrayList;

public class Tarefa {

	private String titulo;
	private String data;
	private boolean tipo;

	public Tarefa(String titulo, String data, boolean tipo) {
		this.titulo = titulo;
		this.data = data;
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String toString() {
		return titulo + " - " + data;
	}

	public boolean getTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

}
