package listadetarefas;

import java.util.ArrayList;
import java.util.Date;

public class Pessoal extends Lista {
	
	private String local;
	private boolean tipo;

	public Pessoal(String nome, String local, boolean tipo){
		this.nome = nome;
		this.local = local;
		this.tipo = tipo;
		this.tarefas = new ArrayList<>();
	
	}

	//gets sets

	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public boolean getTipo(boolean tip1){
		return tip1;
	}

	public void setTipo( boolean tip1) {
		this.tipo = tip1;
	}

	

	public void add(Pessoal listaPessoal) {
		System.out.println(listaPessoal);
	}

	public Object getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


	
}