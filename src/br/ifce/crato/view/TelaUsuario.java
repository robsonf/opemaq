package br.ifce.crato.view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.ifce.crato.actions.UsuarioAction;
import br.ifce.crato.beans.Usuario;

public class TelaUsuario extends JPanel {
	private JPasswordField pfUsuarioConfirmaSenha;
	private JTextField tfUsuarioNome;
	private JTextField tfUsuarioEmail;
	private JPasswordField pfUsuarioSenha;
	private JTextField tfUsuarioQualificacao;
	private JTextField tfUsuarioIdade;
	private JTextField tfUsuarioAcesso;
	private JTextField tfUsuarioUso;
	private JTextArea tfUsuarioObs;
	private JTextArea tfUsuarioExperiencia;
	private UsuarioAction usuarioAction;
	
	/**
	 * Create the panel.
	 */
	public TelaUsuario() {
		setLayout(null);
		usuarioAction = new UsuarioAction();
		
		pfUsuarioConfirmaSenha = new JPasswordField();
		pfUsuarioConfirmaSenha.setText((String) null);
		pfUsuarioConfirmaSenha.setBounds(new Rectangle(15, 210, 195, 25));
		pfUsuarioConfirmaSenha.setBounds(10, 206, 195, 25);
		add(pfUsuarioConfirmaSenha);
		
		JLabel label = new JLabel();
		label.setText("E-mail:");
		label.setBounds(new Rectangle(15, 71, 61, 16));
		label.setBounds(10, 67, 61, 16);
		add(label);
		
		tfUsuarioNome = new JTextField();
		tfUsuarioNome.setText((String) null);
		tfUsuarioNome.setBounds(new Rectangle(15, 35, 195, 25));
		tfUsuarioNome.setBounds(10, 31, 195, 25);
		add(tfUsuarioNome);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Confirmar Senha:");
		label_1.setBounds(new Rectangle(15, 189, 106, 16));
		label_1.setBounds(10, 185, 106, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Nome:");
		label_2.setBounds(new Rectangle(15, 15, 61, 16));
		label_2.setBounds(10, 11, 61, 16);
		add(label_2);
		
		tfUsuarioEmail = new JTextField();
		tfUsuarioEmail.setText((String) null);
		tfUsuarioEmail.setBounds(new Rectangle(15, 95, 195, 25));
		tfUsuarioEmail.setBounds(10, 91, 195, 25);
		add(tfUsuarioEmail);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Senha:");
		label_3.setBounds(new Rectangle(15, 130, 61, 16));
		label_3.setBounds(10, 126, 61, 16);
		add(label_3);
		
		pfUsuarioSenha = new JPasswordField();
		pfUsuarioSenha.setText((String) null);
		pfUsuarioSenha.setBounds(new Rectangle(15, 150, 195, 25));
		pfUsuarioSenha.setBounds(10, 146, 195, 25);
		add(pfUsuarioSenha);
		
		JButton jbUsuarioSalvar = new JButton();
		jbUsuarioSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario u = recuperarFormulario();
				if(u != null){
					usuarioAction.alterar(u);
					alterarFormulario(u);
					JOptionPane.showMessageDialog(null, "Informações salvas com sucesso!");
				}
			}
		});
		jbUsuarioSalvar.setText("Salvar");
		jbUsuarioSalvar.setBounds(new Rectangle(15, 315, 91, 31));
		jbUsuarioSalvar.setBounds(10, 311, 91, 31);
		add(jbUsuarioSalvar);
		
		JLabel label_4 = new JLabel();
		label_4.setText("Qualifica\u00E7\u00E3o T\u00E9cnica:");
		label_4.setBounds(new Rectangle(15, 15, 61, 16));
		label_4.setBounds(231, 11, 140, 16);
		add(label_4);
		
		tfUsuarioQualificacao = new JTextField();
		tfUsuarioQualificacao.setText((String) null);
		tfUsuarioQualificacao.setBounds(new Rectangle(15, 35, 195, 25));
		tfUsuarioQualificacao.setBounds(231, 31, 195, 25);
		add(tfUsuarioQualificacao);
		
		JLabel label_5 = new JLabel();
		label_5.setText("Idade:");
		label_5.setBounds(new Rectangle(15, 71, 61, 16));
		label_5.setBounds(231, 67, 61, 16);
		add(label_5);
		
		tfUsuarioIdade = new JTextField();
		tfUsuarioIdade.setText((String) null);
		tfUsuarioIdade.setBounds(new Rectangle(15, 95, 195, 25));
		tfUsuarioIdade.setBounds(231, 91, 195, 25);
		add(tfUsuarioIdade);
		
		JLabel label_6 = new JLabel();
		label_6.setText("Experi\u00EAncia:");
		label_6.setBounds(new Rectangle(15, 130, 61, 16));
		label_6.setBounds(231, 126, 128, 16);
		add(label_6);
		
		tfUsuarioExperiencia = new JTextArea();
		tfUsuarioExperiencia.setBounds(231, 146, 195, 85);
		add(tfUsuarioExperiencia);
		
		JLabel label_7 = new JLabel();
		label_7.setText("\u00DAltimo acesso:");
		label_7.setBounds(new Rectangle(15, 15, 61, 16));
		label_7.setBounds(10, 242, 117, 16);
		add(label_7);
		
		tfUsuarioAcesso = new JTextField();
		tfUsuarioAcesso.setText((String) null);
		tfUsuarioAcesso.setBounds(new Rectangle(15, 35, 195, 25));
		tfUsuarioAcesso.setBounds(10, 262, 195, 25);
		add(tfUsuarioAcesso);
		
		JLabel label_8 = new JLabel();
		label_8.setText("Tempo de uso:");
		label_8.setBounds(new Rectangle(15, 15, 61, 16));
		label_8.setBounds(231, 242, 106, 16);
		add(label_8);
		
		tfUsuarioUso = new JTextField();
		tfUsuarioUso.setText((String) null);
		tfUsuarioUso.setBounds(new Rectangle(15, 35, 195, 25));
		tfUsuarioUso.setBounds(231, 262, 195, 25);
		add(tfUsuarioUso);
		
		JLabel label_9 = new JLabel();
		label_9.setText("Observa\u00E7\u00F5es:");
		label_9.setBounds(new Rectangle(15, 130, 61, 16));
		label_9.setBounds(231, 298, 106, 16);
		add(label_9);
		
		tfUsuarioObs = new JTextArea();
		tfUsuarioObs.setBounds(231, 318, 195, 85);
		add(tfUsuarioObs);
		
		Vector<Usuario> lista = usuarioAction.pesquisar();
		alterarFormulario(lista.get(0));

	}
	public void limparCampos(){
        tfUsuarioAcesso.setText("");
		tfUsuarioNome.setText("");
        tfUsuarioEmail.setText("");
        tfUsuarioIdade.setText("");
		tfUsuarioQualificacao.setText("");
		tfUsuarioUso.setText("");
		tfUsuarioExperiencia.setText("");
		tfUsuarioObs.setText("");
	}
	
	public Usuario recuperarFormulario() {
		java.sql.Date uso = null;
		java.sql.Date acesso = null;
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        java.util.Date parsed = format.parse(tfUsuarioUso.getText());
	        uso = new java.sql.Date(parsed.getTime());
	        parsed = format.parse(tfUsuarioAcesso.getText());
	        acesso = new java.sql.Date(parsed.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
		
        String nome = tfUsuarioNome.getText();
        String email = tfUsuarioEmail.getText();
		int idade = Integer.valueOf(tfUsuarioIdade.getText());
		String qualificacao = tfUsuarioQualificacao.getText();
		String experiencia = tfUsuarioExperiencia.getText();
		String obs = tfUsuarioObs.getText();
		String senha = new String(pfUsuarioSenha.getPassword());
		String confirma = new String(pfUsuarioConfirmaSenha.getPassword());
		
		if(confirma.equals(senha)){
			Usuario u = new Usuario(nome,email,senha,acesso,qualificacao,idade,experiencia, uso, obs);
			return u;
		}else{
			JOptionPane.showMessageDialog(null, "Campo de senha e confirmação devem ser iguais.");
			return null;
		}
	}

	public void alterarFormulario(Usuario u) {
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String sdata = format.format(u.getUltimoAcesso());  
			tfUsuarioAcesso.setText(sdata);
			sdata = format.format(u.getTempoDeUso());  
			tfUsuarioUso.setText(sdata);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		tfUsuarioNome.setText(u.getNome());
		tfUsuarioEmail.setText(String.valueOf(u.getEmail()));
		tfUsuarioIdade.setText(String.valueOf(u.getIdade()));
		tfUsuarioQualificacao.setText(u.getQualificacao());
		tfUsuarioExperiencia.setText(u.getExperiencia());
		tfUsuarioObs.setText(u.getObs());
		pfUsuarioSenha.setText(u.getSenha());
		pfUsuarioConfirmaSenha.setText(u.getSenha());
	}

}
