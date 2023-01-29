package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EdicaoEducacao extends JFrame {

	public EdicaoEducacao() {
		super("Edição Educacao");

		Container c = getContentPane();
		c.setLayout(null);

		Font fonte = new Font("Serif", Font.PLAIN, 20);
		JLabel label = new JLabel("Editar");
		label.setFont(fonte);
		label.setForeground(Color.WHITE);
		label.setBounds(250, 0, 125, 40);
		c.add(label);

		Font fonte2 = new Font("Serif", Font.PLAIN, 18);

		JLabel EditarNome = new JLabel("Editar Nome:");
		EditarNome.setForeground(Color.WHITE);
		EditarNome.setFont(fonte2);
		EditarNome.setBounds(50, 50, 230, 34);
		c.add(EditarNome);

		JTextField Nome = new JTextField("", 15);
		Nome.setBounds(50, 80, 230, 34);
		c.add(Nome);

		JLabel EditarLocal = new JLabel("Editar Campus:");
		EditarLocal.setForeground(Color.WHITE);
		EditarLocal.setFont(fonte2);
		EditarLocal.setBounds(300, 50, 230, 34);
		c.add(EditarLocal);

		JTextField Local = new JTextField("", 15);
		Local.setBounds(300, 80, 230, 34);
		c.add(Local);

		JButton jbtSalvar = new JButton("Salvar");
		jbtSalvar.setForeground(new Color(255, 255, 255));
		jbtSalvar.setBackground(new Color(0, 0, 121));
		jbtSalvar.setBounds(215, 195, 130, 40);
		c.add(jbtSalvar);

		c.setBackground(new Color(128, 128, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		setVisible(true);
		setResizable(false);

	}

	public static void main(String[] args) {
		new EdicaoEducacao();
	}

}