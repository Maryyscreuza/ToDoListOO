package view;

import controller.*;

import controller.CadastroUsuarioController;

import listadetarefas.Trabalho;
import listadetarefas.Usuario;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TrabalhoTela extends JFrame implements ActionListener, ListSelectionListener {

	DefaultListModel model = new DefaultListModel();

	private static final long serialVersionUID = 1L;

	private JTextField Nome;
	private JTextField Destinatario;
	JComboBox<String> Tipo2 = new JComboBox<>();
	protected Usuario usuario;
	CadastroUsuarioController controller = new CadastroUsuarioController();
	private JList<String> listasTrabalho;

	public TrabalhoTela(Usuario user) {
		super("Trabalho");

		Container c = getContentPane();
		c.setLayout(null);
		Font fonte2 = new Font("Serif", Font.PLAIN, 18);

		Font fonte = new Font("Serif", Font.PLAIN, 20);
		JLabel label = new JLabel("Trabalho");
		label.setFont(fonte);
		label.setForeground(Color.WHITE);
		label.setBounds(550, 0, 125, 40);
		c.add(label);

		JLabel AdicionarNome = new JLabel("Adicionar Nome:");
		AdicionarNome.setForeground(Color.WHITE);
		AdicionarNome.setFont(fonte2);
		AdicionarNome.setBounds(200, 50, 220, 34);
		c.add(AdicionarNome);

		JTextField Nome = new JTextField("", 15);
		Nome.setBounds(200, 80, 347, 34);
		c.add(Nome);

		JLabel AdicionarDestinatario = new JLabel("Adicionar Destinatário:");
		AdicionarDestinatario.setForeground(Color.WHITE);
		AdicionarDestinatario.setFont(fonte2);
		AdicionarDestinatario.setBounds(650, 50, 220, 34);
		c.add(AdicionarDestinatario);

		JTextField Destinatario = new JTextField("", 15);
		Destinatario.setBounds(650, 80, 347, 34);
		c.add(Destinatario);

		JLabel JLTipo = new JLabel("Tipo:");
		JLTipo.setForeground(Color.WHITE);
		JLTipo.setFont(fonte2);
		JLTipo.setBounds(480, 120, 220, 34);
		c.add(JLTipo);

		JComboBox<String> Tipo2 = new JComboBox();
		Tipo2.setBounds(480, 150, 220, 34);
		Tipo2.addItem("À Distância");
		Tipo2.addItem("Presencial");
		c.add(Tipo2);

		String[] Lista = {};
		JList<String> listasTrabalho = new JList<>(Lista);
		listasTrabalho.setBounds(200, 250, 800, 300);
		listasTrabalho.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		c.add(listasTrabalho);
		listasTrabalho.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Object src = e.getSource();

				if (e.getValueIsAdjusting() && src == listasTrabalho) {
					controller.exibirTrabalho(listasTrabalho.getSelectedValue().toString());
					dispose();
					System.out.println(listasTrabalho.getSelectedValue().toString());

					setVisible(false);
				}
			}
		});

		JButton botaoAdicionar = new JButton("ADICIONAR");
		botaoAdicionar.setLocation(50, 50);
		botaoAdicionar.setBounds(630, 200, 150, 23);
		botaoAdicionar.setBackground(new Color(128, 128, 255));
		botaoAdicionar.setForeground(new Color(255, 255, 255));
		c.add(botaoAdicionar);
		botaoAdicionar.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tip2 = Tipo2.getSelectedItem().toString();

				Boolean tipo2;

				if (tip2 == "À Distância") {
					tipo2 = true;
				} else {
					tipo2 = false;
				}
				controller.cadastrarTrabalho(Nome.getText(), Destinatario.getText(), tipo2);
				model.addElement(Nome.getText());
				listasTrabalho.setModel(model);
				System.out.println(listasTrabalho);
			}
		});

		JButton botaoVoltar = new JButton("VOLTAR");
		botaoVoltar.setBounds(450, 200, 150, 23);
		botaoVoltar.setBackground(new Color(128, 128, 255));
		botaoVoltar.setForeground(new Color(255, 255, 255));
		c.add(botaoVoltar);
		botaoVoltar.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaOpcao();
				dispose();
			}
		});

		c.setBackground(new Color(0, 0, 121));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 700);
		setVisible(true);
		setResizable(false);

	}

	public void actionPerformed(ActionEvent e) {
		if (Nome.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Coloque um nome para a lita", "Atenção!", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Lista criada!", "Parabéns!", JOptionPane.DEFAULT_OPTION);

			String nome = Nome.getText();
			String destinatario = Destinatario.getText();

			String tip2 = Tipo2.getSelectedItem().toString();

			Boolean Tipo2;

			if (tip2 == "À Distancia") {
				Tipo2 = true;
			} else {
				Tipo2 = false;
			}

			CadastroUsuarioController cadastroUsuarioController = new CadastroUsuarioController();
			cadastroUsuarioController.cadastrarTrabalho(nome, destinatario, Tipo2);
			setVisible(false);

			JOptionPane.showMessageDialog(null, "Lista cadastrada com sucesso!");

		}

	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listasTrabalho) {

			controller.exibirTrabalho(listasTrabalho.getSelectedValue());
			dispose();
			System.out.println(listasTrabalho.getSelectedValue().toString());

			setVisible(false);
		}
	}

	public static void main(String[] args) {
		new TrabalhoTela();
	}

}