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
import view.TelaEducacao;
import view.TelaTrabalho;

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

	public void atualizaDadosEducação(int i, String nome, String campus, boolean tipo1, boolean participantes) {
		usuario.getEducacao().get(i).setNome(nome);
		usuario.getEducacao().get(i).setCampus(campus);
		usuario.getEducacao().get(i).atualizaDados(tipo1);
		usuario.getEducacao().get(i).atualizaDados(participantes);
	}

	public void excluirEducacao(Educacao educacao) {
		usuario.excluirEducacao(educacao);
	}

	public void excluirPessoal(String string) {
		usuario.excluirPessoal(string);
	}

	// crud lista Trabalho
	public void atualizaDadosTrabalho(int i, String nome, String destinatario, boolean tipo2) {
		usuario.getTrabalho().get(i).setNome(nome);
		usuario.getTrabalho().get(i).setDestinatario(destinatario);
		usuario.getTrabalho().get(i).atualizaDados(tipo2);

	}

}
