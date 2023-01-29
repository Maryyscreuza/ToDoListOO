package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import controller.CadastroUsuarioController;
import listadetarefas.Usuario;
import listadetarefas.Lista;
import listadetarefas.Pessoal;
import listadetarefas.Tarefa;

public class TelaTarefa extends JFrame {

	DefaultListModel model = new DefaultListModel();

	private JTextField Nome = new JTextField("", 15);
	private JTextField Data = new JTextField("", 15);
	private JComboBox<String> Tipo = new JComboBox<>();

	public TelaTarefa(Usuario usuario, Lista lista, String tipoLista) {
		super("Tarefa");

		Font fonte = new Font("Serif", Font.PLAIN, 20);
		String listaNome = "Lista " + lista.getNome();
		JLabel label = new JLabel(listaNome);
		label.setFont(fonte);
		label.setForeground(Color.WHITE);
		label.setBounds(550, 0, 355, 40);

		Container c = getContentPane();
		c.setLayout(null);
		Font fonte2 = new Font("Serif", Font.PLAIN, 18);

		JLabel AdicionarNome = new JLabel("Adicionar Nome:");
		AdicionarNome.setForeground(Color.WHITE);
		AdicionarNome.setFont(fonte2);
		AdicionarNome.setBounds(200, 50, 220, 34);

		Nome.setBounds(200, 80, 347, 34);

		JLabel AdicionarData = new JLabel("Data:");
		AdicionarData.setForeground(Color.WHITE);
		AdicionarData.setFont(fonte2);
		AdicionarData.setBounds(650, 50, 220, 34);

		Data.setBounds(650, 80, 347, 34);

		JLabel Tipo1 = new JLabel("Tipo:");
		Tipo1.setForeground(Color.WHITE);
		Tipo1.setFont(fonte2);
		Tipo1.setBounds(480, 120, 220, 34);

		Tipo.setBounds(480, 150, 220, 34);
		Tipo.addItem("Importante");
		Tipo.addItem("Normal");

		c.add(label);
		c.add(AdicionarNome);
		c.add(Nome);
		c.add(AdicionarData);
		c.add(Data);
		c.add(Tipo1);
		c.add(Tipo);

		String[] Listas = {};
		JList jlista = new JList<>(Listas);
		jlista.setBounds(250, 250, 670, 300);
		jlista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		c.add(jlista);

		JButton botaoAdicionar = new JButton("ADICIONAR");
		botaoAdicionar.setBounds(520, 200, 150, 23);
		botaoAdicionar.setBackground(new Color(128, 128, 255));
		botaoAdicionar.setForeground(new Color(255, 255, 255));
		botaoAdicionar.addActionListener((ActionListener) new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String tipoSelecionado = Tipo.getSelectedItem().toString(); // TODO: Consertar tipo
				model.addElement(Nome.getText() + " - " + Data.getText() + " - " + true);
				jlista.setModel(model);
				lista.cadastrarTarefa(Nome.getText(), Data.getText(), true);

				JOptionPane msg = new JOptionPane("Tarefa cadastrada com sucesso!");
			}
		});

		JButton botaoVoltar = new JButton("VOLTAR");
		botaoVoltar.setBounds(300, 600, 150, 23);
		botaoVoltar.setBackground(new Color(128, 128, 255));
		botaoVoltar.setForeground(new Color(255, 255, 255));
		botaoVoltar.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tipoLista.equals("pessoal")) {
					new TelaPessoal(usuario);
				} else if (tipoLista.equals("educacao")) {
					new EducacaoTela(usuario);
				} else {
					new TrabalhoTela(usuario);
				}

				dispose();
			}
		});

		JButton botaoEditar = new JButton("EDITAR LISTA");
		botaoEditar.setBounds(500, 600, 150, 23);
		botaoEditar.setBackground(new Color(128, 128, 255));
		botaoEditar.setForeground(new Color(255, 255, 255));
		botaoEditar.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				jlista.setModel(model);

			}
		});

		JButton botaoExcluir = new JButton("EXCLUIR LISTA");
		botaoExcluir.setBounds(700, 600, 150, 23);
		botaoExcluir.setBackground(new Color(128, 128, 255));
		botaoExcluir.setForeground(new Color(255, 255, 255));
		botaoExcluir.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuario.apagarListaPeloNome(lista.getNome(), tipoLista);

			}
		});

		c.add(botaoAdicionar);
		c.add(botaoVoltar);
		c.add(botaoEditar);
		c.add(botaoExcluir);

		// Listar previamente as tarefas
		ArrayList<Tarefa> listaDeTarefas = lista.getTarefas();
		for (Tarefa tarefa : listaDeTarefas) {
			System.out.println(tarefa.getTitulo());
			model.addElement(tarefa.getTitulo() + " - " + tarefa.getData() + " - " + tarefa.getTipo());
		}
		jlista.setModel(model);
		setVisible(true);

		c.setBackground(new Color(0, 0, 121));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 700);
		setVisible(true);

	}

}