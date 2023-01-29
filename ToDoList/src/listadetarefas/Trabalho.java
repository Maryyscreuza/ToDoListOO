package listadetarefas;

import java.util.Date;
import java.util.ArrayList;

public class Trabalho extends Lista {
	
	private String destinatario;
	private boolean Tipo2;
	
	public Trabalho(String nome, String destinatario, boolean Tipo2) {
		this.nome = nome;
		this.destinatario = destinatario;
		this.Tipo2 = Tipo2;
		this.tarefas = new ArrayList<>();
		}

	//gets sets
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public boolean getTipo2(boolean tip2){
		return tip2;
	}

	public void setTipo2( boolean tip2) {
		this.Tipo2 = tip2;
	}
	
	//outros metodos 
	
	public void cadastrarTarefaTrabalho(Tarefa tarefa) {
		tarefas.add(tarefa);
	}
	
	public void buscarTarefaTrabalho(String titulo) {
		for (int i = 0; i < tarefas.size(); i++) {
			if(tarefas.get(i).getTitulo().equals(titulo)) {
				System.out.println(tarefas.get(i).getTitulo() + " | " + tarefas.get(i).getData());
			}
		
		}
	}
	
	public void excluirTarefasTrabalho(Tarefa tarefa) {
		for (int i = 0; i < tarefas.size(); i++) {
			if(tarefas.get(i).equals(tarefa)) {
				tarefas.remove(tarefas.get(i));
			}
		}
}}