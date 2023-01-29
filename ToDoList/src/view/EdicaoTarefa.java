package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class EdicaoTarefa extends JFrame {
 
 public EdicaoTarefa(Usuario usuario, Tarefa tarefa, Lista lista) {
 super("Edição Tarefa");

 // TODO: lista.removerTarefa(tarefa.getTitulo());

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
 
 JLabel EditarLocal = new JLabel("Editar Destinatário:");
 EditarLocal.setForeground(Color.WHITE);
 EditarLocal.setFont(fonte2);
 EditarLocal.setBounds(300, 50, 230, 34);
 c.add(EditarLocal);
 
 JTextField Local = new JTextField("", 15);
 Local.setBounds(300, 80, 230, 34);
 c.add(Local);
 
 JLabel EditarTipo = new JLabel("Editar Tipo:");
 EditarTipo.setForeground(Color.WHITE);
 EditarTipo.setFont(fonte2);
 EditarTipo.setBounds(170, 120, 220, 34);
 c.add(EditarTipo);
 
 JComboBox<String> Tipo = new JComboBox();
 Tipo.setBounds(170, 150, 220, 34);
 Tipo.addItem("À Distância");
 Tipo.addItem("Presencial");
 c.add(Tipo);
 
 /*JButton jbtSalvar = new JButton("Salvar");
 jbtSalvar.setForeground(new Color(255, 255, 255));
 jbtSalvar.setBackground(new Color(0, 0, 121));
 jbtSalvar.setBounds(215, 195, 130, 40);
 jbtSalvar.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
   if(e.getSource() == jbtSalvar) {
    edit(i, k);
   }
   }
   });
 c.add(jbtSalvar);*/
 
 c.setBackground(new Color(128, 128, 255));
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(600,300);
 setVisible(true);
 setResizable(false);
 
 }
 
 public static void main(String[] args) {
  new EdicaoTrabalhoTela();
 }


}
