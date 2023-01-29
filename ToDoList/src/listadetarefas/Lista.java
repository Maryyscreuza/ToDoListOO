package listadetarefas;

import java.util.ArrayList;

public abstract class Lista {

	protected String nome;
	protected ArrayList<Tarefa> tarefas;

	// gets sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public void setTarefa(ArrayList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public ArrayList<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(ArrayList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public void cadastrarTarefa(String titulo, String data, boolean tipo) {
		Tarefa tarefa = new Tarefa(titulo, data, tipo);
		tarefas.add(tarefa);
	}

	public int pegarIndexTarefa(String titulo) {
		int index = -1;

		for (int i = 0; i < tarefas.size(); i++) {
			if (tarefas.get(i).getTitulo().equals(titulo)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public Tarefa getTarefaUsandoTitulo(String titulo) {
		int index = pegarIndexTarefa(titulo);

		if (index >= 0) {
			return tarefas.get(index);
		}

		return null;
	}

	public void removerTarefa(String titulo) {
		int index = pegarIndexTarefa(titulo);

		if (index >= 0) {
			tarefas.remove(index);
		}

	}

	public void editarTarefa(String titulo, String novoTitulo, String novaData, boolean novoTipo) {
		int index = pegarIndexTarefa(titulo);

		Tarefa novaTarefa = new Tarefa(novoTitulo, novaData, novoTipo);

		if (index >= 0) {
			tarefas.set(index, novaTarefa);
		}

	}

}
