import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener{

	private JTextField txtTexto;
	private JLabel jlTexto;
	private JButton jbMostrar, jbLimpar, jbSair;
	
	public Tela() {
		super("Texto");
		
		JPanel painelDadosEntrada = new JPanel(new GridLayout(4,2));
		JPanel painelEntrada = new JPanel(new FlowLayout());
		
		txtTexto = new JTextField(20);
		jlTexto = new JLabel("Texto: ");
		painelDadosEntrada.add(jlTexto);
		painelDadosEntrada.add(txtTexto);
		painelEntrada.add(painelDadosEntrada);
		
		
		JPanel painelBotoes = new JPanel (new FlowLayout());
		jbMostrar = new JButton("Mostrar");
		jbLimpar = new JButton("Limpar");
		jbSair = new JButton("Sair");
		
		painelBotoes.add(jbMostrar);
		painelBotoes.add(jbLimpar);
		painelBotoes.add(jbSair);
		
		Container caixa = getContentPane();
		caixa.setLayout(new BorderLayout());
		caixa.add(painelEntrada, BorderLayout.WEST);
		caixa.add(painelBotoes, BorderLayout.SOUTH);
		
		jbMostrar.addActionListener(this);
		jbLimpar.addActionListener(this);
		jbSair.addActionListener(this);
		
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbMostrar) {
			String texto = txtTexto.getText();
			JOptionPane.showMessageDialog(this, texto);
		}else if (e.getSource()==jbLimpar){
			txtTexto.setText("");
		}else {
			System.exit(0);
		}
	}
}
