package br.ifce.crato.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private TelaInicial telaInicial;
	private TelaPrincipal telaPrincipal;
	private TelaLogin telaLogin;
	
	/**
	 * Create the panel.
	 */
	public TelaLogin() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 800, 600);
		add(panel);
		
		JLabel label = new JLabel();
		label.setText("OpeMaq");
		label.setFont(new Font("Aharoni", Font.PLAIN, 30));
		label.setBounds(new Rectangle(390, 25, 342, 46));
		label.setBounds(390, 25, 342, 46);
		panel.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("E-mail:");
		label_1.setBounds(new Rectangle(390, 126, 61, 30));
		label_1.setBounds(390, 126, 61, 30);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Senha:");
		label_2.setBounds(new Rectangle(391, 171, 62, 29));
		label_2.setBounds(391, 171, 62, 29);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setText("robsonf@gmail.com");
		textField.setBounds(new Rectangle(465, 128, 212, 28));
		textField.setBounds(465, 128, 212, 28);
		panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setText("1234");
		passwordField.setBounds(new Rectangle(465, 172, 211, 28));
		passwordField.setBounds(465, 172, 211, 28);
		panel.add(passwordField);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("robsonf@gmail.com") && (new String(passwordField.getPassword())).equals("1234")){
					telaInicial.setVisible(true);
					telaLogin.setVisible(false);
					telaPrincipal.setContentPane(telaInicial);
				}else{
					JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos.");
				}
			}
		});
		button.setText("Enviar");
		button.setBounds(new Rectangle(595, 216, 80, 29));
		button.setBounds(595, 216, 80, 29);
		panel.add(button);
		
		JLabel label_3 = new JLabel(" ");
		label_3.setIcon(new ImageIcon("figuras"+File.separator+"Trator-pequeno.png"));
		label_3.setForeground(Color.WHITE);
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(23, 27, 342, 229);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setText("Desempenhos Operacional e Econ\u00F4mico de Conjuntos Tratorizados");
		label_4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_4.setBounds(new Rectangle(38, 22, 402, 46));
		label_4.setBounds(390, 61, 384, 46);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setText("Lembrete");
		label_5.setFont(new Font("Aharoni", Font.PLAIN, 18));
		label_5.setBounds(new Rectangle(390, 25, 342, 46));
		label_5.setBounds(352, 265, 80, 46);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setText("1. N\u00EDvel de fluido da bateria; ");
		label_6.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_6.setBounds(new Rectangle(38, 22, 402, 46));
		label_6.setBounds(261, 310, 261, 17);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setText("2. N\u00EDvel de \u00E1gua do radiador; ");
		label_7.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_7.setBounds(new Rectangle(38, 22, 402, 46));
		label_7.setBounds(261, 330, 261, 17);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel();
		label_8.setText("3. N\u00EDveis de \u00F3leo do c\u00E1rter e transmiss\u00E3o final;");
		label_8.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_8.setBounds(new Rectangle(38, 22, 402, 46));
		label_8.setBounds(261, 350, 261, 17);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setText("4. Combust\u00EDvel no tanque;");
		label_9.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_9.setBounds(new Rectangle(38, 22, 402, 46));
		label_9.setBounds(261, 370, 261, 17);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setText("5. Exist\u00EAncia e o funcionamento das l\u00E2mpadas; ");
		label_10.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_10.setBounds(new Rectangle(38, 22, 402, 46));
		label_10.setBounds(261, 390, 261, 17);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel();
		label_11.setText("6. Lastros met\u00E1licos e l\u00EDquidos; ");
		label_11.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_11.setBounds(new Rectangle(38, 22, 402, 46));
		label_11.setBounds(261, 410, 261, 17);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel();
		label_12.setText("7. Press\u00E3o dos rodados; ");
		label_12.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_12.setBounds(new Rectangle(38, 22, 402, 46));
		label_12.setBounds(261, 430, 261, 17);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel();
		label_13.setText("8. Altura das garras dos pneus; ");
		label_13.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_13.setBounds(new Rectangle(38, 22, 402, 46));
		label_13.setBounds(261, 450, 261, 17);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel();
		label_14.setText("9. Filtro de ar;");
		label_14.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_14.setBounds(new Rectangle(38, 22, 402, 46));
		label_14.setBounds(261, 470, 261, 17);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel();
		label_15.setText("10. Pinos graxeiros do trator;");
		label_15.setFont(new Font("Arial Unicode MS", Font.PLAIN, 12));
		label_15.setBounds(new Rectangle(38, 22, 402, 46));
		label_15.setBounds(261, 490, 261, 17);
		panel.add(label_15);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		layeredPane.setBounds(250, 265, 284, 253);
		panel.add(layeredPane);

	}

	public TelaInicial getTelaInicial() {
		return telaInicial;
	}

	public void setTelaInicial(TelaInicial telaInicial) {
		this.telaInicial = telaInicial;
	}

	public TelaPrincipal getTelaPrincipal() {
		return telaPrincipal;
	}

	public void setTelaPrincipal(TelaPrincipal telaPrincipal) {
		this.telaPrincipal = telaPrincipal;
	}

	public TelaLogin getTelaLogin() {
		return telaLogin;
	}

	public void setTelaLogin(TelaLogin telaLogin) {
		this.telaLogin = telaLogin;
	}
	
}
