package listadetarefas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;

import view.TelaPessoal;
import view.TelaOpcao;

public class Usuario {

	// atributos

	private String email;
	private String nome;
	private ArrayList<Educacao> listaEducacao;
	private ArrayList<Pessoal> listaPessoal;
	private ArrayList<Trabalho> listaTrabalho;

	// construtor

	public Usuario(String email, String nome) {
		this.email = email;
		this.nome = nome;
		this.listaEducacao = new ArrayList<>();
		this.listaTrabalho = new ArrayList<>();
		this.listaPessoal = new ArrayList<>();
	}

	public void irParaTelaOpcao() {
		new TelaOpcao(this);
	}

	// gets e sets
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Educacao> getEducacao() {
		return listaEducacao;
	}

	public ArrayList<Pessoal> getPessoal() {
		return listaPessoal;
	}

	public ArrayList<Trabalho> getTrabalho() {
		return listaTrabalho;
	}

	public int pegarIndexListaPessoalPeloNome(String nome) {
		int index = -1;

		for (int i = 0; i < listaPessoal.size(); i++) {
			if (listaPessoal.get(i).nome.equals(nome)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public int pegarIndexListaEducacaoPeloNome(String nome) {
		int index = -1;

		for (int i = 0; i < listaEducacao.size(); i++) {
			if (listaEducacao.get(i).nome.equals(nome)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public int pegarIndexListaTrabalhoPeloNome(String nome) {
		int index = -1;

		for (int i = 0; i < listaTrabalho.size(); i++) {
			if (listaTrabalho.get(i).nome.equals(nome)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public void editarListaPessoalPeloNome(String nome, Pessoal listaNova) {
		int index = this.pegarIndexListaPessoalPeloNome(nome);

		if (index >= 0) {
			listaPessoal.set(index, listaNova);
		}

		new TelaPessoal(this);
	}

	public void apagarListaPeloNome(String nome, String tipo) {
		if (tipo.equals("pessoal")) {
			int index = this.pegarIndexListaPessoalPeloNome(nome);
			listaPessoal.remove(index);
		} else if (tipo.equals("educacao")) {
			int index = this.pegarIndexListaEducacaoPeloNome(nome);
			listaEducacao.remove(index);
		} else if (tipo.equals("trabalho")) {
			int index = this.pegarIndexListaTrabalhoPeloNome(nome);
			listaTrabalho.remove(index);
		}

		this.irParaTelaOpcao();
	}

	public Pessoal buscarListaPessoalPeloNome(String nome) {
		int index = this.pegarIndexListaPessoalPeloNome(nome);

		if (index >= 0) {
			return listaPessoal.get(index);
		}

		return null;
	}

	public Educacao buscarListaEducacaoPeloNome(String nome) {
		int index = this.pegarIndexListaEducacaoPeloNome(nome);

		if (index >= 0) {
			return listaEducacao.get(index);
		}

		return null;
	}

	public Trabalho buscarListaTrabalhoPeloNome(String nome) {
		int index = this.pegarIndexListaTrabalhoPeloNome(nome);

		if (index >= 0) {
			return listaTrabalho.get(index);
		}
		return null;
	}

	public void cadastrarEducacao(String nome, String campus, boolean tip1, boolean part) {
		Educacao listaCadastradaEducacao = new Educacao(nome, campus, tip1, part);
		listaEducacao.add(listaCadastradaEducacao);
	}

	public void buscarEducacao(String nome) {

		for (int i = 0; i < listaEducacao.size(); i++) {
			if (listaEducacao.get(i).getNome().equals(nome)) {
				System.out.println(listaEducacao.get(i).getNome());
			}

		}
	}

	public void excluirEducacao(Educacao listaE) {
		for (int i = 0; i < listaEducacao.size(); i++) {
			if (listaEducacao.get(i).equals(listaE)) {
				listaEducacao.remove(listaEducacao.get(i));
			}
		}
	}

	public void cadastrarPessoal(String nome, String local, boolean tip1) {
		Pessoal listaCadastradaPessoal = new Pessoal(nome, local, tip1);
		listaPessoal.add(listaCadastradaPessoal);

	}

	public void buscarPessoal(String nome) {

		for (int i = 0; i < listaPessoal.size(); i++) {
			if (listaPessoal.get(i).getNome().equals(nome)) {
				System.out.println(listaPessoal.get(i).getNome());
			}

		}
	}

	public void excluirPessoal(String string) {
		System.out.println("esther");
		for (int i = 0; i < listaPessoal.size(); i++) {
			if (listaPessoal.get(i).equals(string)) {
				listaPessoal.remove(listaPessoal.get(i));
			}
		}
	}

	public void cadastrarTrabalho(Trabalho listaTrabalhoCadastrada) {
		listaTrabalho.add(listaTrabalhoCadastrada);
	}

	public void buscarTrabalho(String nome) {

		for (int i = 0; i < listaTrabalho.size(); i++) {
			if (listaTrabalho.get(i).getNome().equals(nome)) {
				System.out.println(listaTrabalho.get(i).getNome());
			}

		}
	}

	public void excluirTrabalho(Trabalho litaT) {
		for (int i = 0; i < listaTrabalho.size(); i++) {
			if (listaTrabalho.get(i).equals(litaT)) {
				listaTrabalho.remove(listaTrabalho.get(i));
			}
		}
	}

}