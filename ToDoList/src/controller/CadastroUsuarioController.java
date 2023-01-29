package controller;

import listadetarefas.Usuario;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

import listadetarefas.Educacao;
import listadetarefas.Lista;
import listadetarefas.Pessoal;
import listadetarefas.Tarefa;
import listadetarefas.Trabalho;

import view.TelaOpcao;
import view.TelaPessoal;
import view.TelaTarefa;
import view.EducacaoTela;
import view.TrabalhoTela;

public class CadastroUsuarioController {

	private static final long serialVersionUID = 1L;
	public static Usuario usuario;
	public static Lista lista;
	public static int i;
	public Pessoal pessoal;

	// cadastrar usuario

	public void cadastrarUsuario(String email, String nome) {
		usuario = new Usuario(email, nome);
		System.out.println(usuario.getNome() + " - " + usuario.getEmail());
		new TelaOpcao(usuario);
	}

	// crud lista educação

	public void exibirEducacao(String nome) {
		for (i = 0; i < usuario.getEducacao().size(); i++) {
			if (usuario.getEducacao().get(i).getNome().equals(nome)) {
				System.out.println(usuario.getEducacao().get(i).getNome());
				new TelaTarefa(i);
			}
		}
	}

	public void exibirDadosListaEducacao(String nome) {
		for (i = 0; i < usuario.getEducacao().size(); i++) {
			if (usuario.getEducacao().get(i).getNome().equals(nome))
				;
		}

	}

	public void atualizaDadosEducação(int i, String nome, String campus, boolean tipo1, boolean participantes) {
		usuario.getEducacao().get(i).setNome(nome);
		usuario.getEducacao().get(i).setCampus(campus);
		usuario.getEducacao().get(i).atualizaDados1(tipo1);
		usuario.getEducacao().get(i).atualizaDados(participantes);
	}

	public void excluirEducacao(Educacao educacao) {
		usuario.excluirEducacao(educacao);
	}

	public void excluirPessoal(String string) {
		usuario.excluirPessoal(string);
	}

	// crud lista Trabalho
	public void cadastrarTrabalho(String nome, String destinatario, boolean tipo2) {

		Trabalho listaTrabalhoCadastrada = new Trabalho(nome, destinatario, tipo2);
		usuario.cadastrarTrabalho(listaTrabalhoCadastrada);
		System.out.println("Nome: " + listaTrabalhoCadastrada.getNome());
		System.out.println("Destinatário: " + listaTrabalhoCadastrada.getDestinatario());
		System.out.println("Tipo: " + listaTrabalhoCadastrada.getTipo2(tipo2));
		System.out.println(usuario.getTrabalho().get(0).getNome());

	}

}
