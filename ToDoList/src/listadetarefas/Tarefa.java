package listadetarefas;

public class Tarefa {

	private String titulo;
	private String data;

	public Tarefa(String titulo, String data) {
		this.titulo = titulo;
		this.data = data;
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

}
