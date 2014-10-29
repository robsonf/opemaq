package br.ifce.crato.view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.ifce.crato.actions.CMecanizadoAction;
import br.ifce.crato.actions.FuncionarioAction;
import br.ifce.crato.actions.TratorAction;
import br.ifce.crato.beans.CMecanizado;
import br.ifce.crato.beans.Funcionario;
import br.ifce.crato.beans.TratoresImplementos;

public class TelaCMecanizados extends JPanel {
	private static final long serialVersionUID = 5555519453325274900L;
	private JTextField tfApelido;
	private JButton jbSalvar;
	private JButton jbEditar;
	private JButton jbCadastrar;
	private JButton jbApagar;
	private JButton jbRemoverFuncionarios;
	private JList<Funcionario> jlFuncionarios;
	private JList<CMecanizado> jlCMecanizados;
	private JComboBox<TratoresImplementos> cbTratores;
	private JComboBox<TratoresImplementos> cbImplementos;
	private JComboBox<Funcionario> jcbFuncionarios;
	private JButton jbCadastrarFuncionario; 
	
	private CMecanizadoAction cMecanizadoAction;
	private FuncionarioAction funcionarioAction;
	private TratorAction tratorAction;
	private CMecanizado antigo;
	private Vector<Funcionario> funcionariosCMecanizado = null;



	/**
	 * Create the panel.
	 */
	public TelaCMecanizados() {
		setSize(800,600);
		setLayout(null);
		
		cMecanizadoAction = new CMecanizadoAction();
		funcionarioAction = new FuncionarioAction();
		funcionariosCMecanizado = new Vector<Funcionario>();
		tratorAction = new TratorAction();
		
		JLabel label = new JLabel();
		label.setText("Apelido:");
		label.setBounds(new Rectangle(15, 15, 91, 16));
		label.setBounds(10, 11, 91, 16);
		add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Funcion\u00E1rios:");
		label_1.setBounds(new Rectangle(15, 75, 106, 16));
		label_1.setBounds(10, 91, 106, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Trator:");
		label_2.setBounds(new Rectangle(15, 181, 77, 16));
		label_2.setBounds(10, 237, 77, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Implemento:");
		label_3.setBounds(new Rectangle(225, 180, 76, 16));
		label_3.setBounds(220, 236, 76, 16);
		add(label_3);
		
		jbCadastrar = new JButton();
		jbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CMecanizado c = recuperarFormulario();
				cMecanizadoAction.inserir(c);
				limparCampos();
				jbSalvar.setEnabled(false);
			}
		});
		jbCadastrar.setText("Cadastrar");
		jbCadastrar.setBounds(new Rectangle(15, 240, 91, 31));
		jbCadastrar.setBounds(10, 296, 91, 31);
		add(jbCadastrar);
		
		jbSalvar = new JButton();
		jbSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CMecanizado c = recuperarFormulario();
				cMecanizadoAction.alterar(antigo, c);
				limparCampos();
				jbSalvar.setEnabled(false);
			}
		});
		jbSalvar.setText("Salvar");
		jbSalvar.setEnabled(false);
		jbSalvar.setBounds(new Rectangle(120, 240, 91, 31));
		jbSalvar.setBounds(115, 296, 91, 31);
		add(jbSalvar);
		
		JButton jbPesquisar = new JButton();
		jbPesquisar.setText("Pesquisar");
		jbPesquisar.setBounds(new Rectangle(225, 240, 106, 31));
		jbPesquisar.setBounds(220, 296, 106, 31);
		add(jbPesquisar);
		
		jbEditar = new JButton();
		jbEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jlCMecanizados.getSelectedIndex() != -1){
					antigo = jlCMecanizados.getSelectedValue();
					jbSalvar.setEnabled(true);
					atualizarListaFuncionariosCMecanizado(antigo.getFuncionarios());
					alterarFormulario(antigo);
				}
			}
		});
		jbEditar.setText("Editar");
		jbEditar.setBounds(new Rectangle(345, 390, 76, 31));
		jbEditar.setBounds(340, 446, 91, 31);
		add(jbEditar);
		
		jbApagar = new JButton();
		jbApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = jlCMecanizados.getSelectedIndex();
				if(index != -1){
					CMecanizado c  = (CMecanizado) jlCMecanizados.getSelectedValue();
					int confirmacao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do Funcionário: " + c.getApelido()+" ?") ; 
					if(confirmacao == JOptionPane.YES_OPTION){
						cMecanizadoAction.deletar(c);
						limparCampos();
					}
				}
			}
		});
		jbApagar.setText("Apagar");
		jbApagar.setBounds(new Rectangle(345, 435, 76, 31));
		jbApagar.setBounds(340, 491, 91, 31);
		add(jbApagar);
		
		jbRemoverFuncionarios = new JButton();
		jbRemoverFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jlFuncionarios.getSelectedIndex() != -1 ){
					funcionariosCMecanizado.remove(jlFuncionarios.getSelectedValue());
				}
				atualizarListaFuncionariosCMecanizado(funcionariosCMecanizado);
			}
		});
		jbRemoverFuncionarios.setText("Apagar");
		jbRemoverFuncionarios.setBounds(new Rectangle(345, 135, 76, 31));
		jbRemoverFuncionarios.setBounds(340, 191, 91, 31);
		add(jbRemoverFuncionarios);
		
		tfApelido = new JTextField();
		tfApelido.setBounds(new Rectangle(15, 38, 316, 25));
		tfApelido.setBounds(10, 34, 316, 25);
		add(tfApelido);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(15, 90, 316, 76));
		scrollPane.setBounds(10, 146, 316, 76);
		add(scrollPane);
		
		jlFuncionarios = new JList<Funcionario>();
		scrollPane.setViewportView(jlFuncionarios);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(new Rectangle(15, 285, 316, 181));
		scrollPane_1.setBounds(10, 341, 316, 181);
		add(scrollPane_1);
		
		jlCMecanizados = new JList<CMecanizado>();
		scrollPane_1.setViewportView(jlCMecanizados);
		
		cbTratores = new JComboBox<TratoresImplementos>();
		cbTratores.setBounds(10, 260, 196, 25);
		add(cbTratores);
		
		cbImplementos = new JComboBox<TratoresImplementos>();
		cbImplementos.setBounds(220, 260, 211, 23);
		add(cbImplementos);
		
		jcbFuncionarios = new JComboBox<Funcionario>();
		jcbFuncionarios.setBounds(10, 110, 316, 25);
		add(jcbFuncionarios);
		
		jbCadastrarFuncionario = new JButton();
		jbCadastrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Funcionario f = (Funcionario)jcbFuncionarios.getSelectedItem();
					funcionariosCMecanizado.add(f);
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Não foi possível adicionar Funcionario ao Conj. Mecanizado." );
				}
				atualizarListaFuncionariosCMecanizado(funcionariosCMecanizado);
			}
		});
		jbCadastrarFuncionario.setText("Cadastrar");
		jbCadastrarFuncionario.setBounds(new Rectangle(345, 135, 76, 31));
		jbCadastrarFuncionario.setBounds(340, 107, 91, 31);
		add(jbCadastrarFuncionario);
		
		limparCampos();
	}


	public void limparCampos() {
		jlCMecanizados.setListData(cMecanizadoAction.pesquisar());
		Vector<TratoresImplementos> tratoresImplementos = tratorAction.pesquisar();
		cbTratores.removeAllItems();
		cbImplementos.removeAllItems();
		for (TratoresImplementos aux : tratoresImplementos) {
			if(aux.iseTrator())
				cbTratores.addItem(aux);
			else
				cbImplementos.addItem(aux);
		}
		
		funcionarioAction = new FuncionarioAction();
		
		Vector<Funcionario> listaFuncionarios = funcionarioAction.pesquisar();
		jcbFuncionarios.removeAllItems();

		for (Funcionario aux : listaFuncionarios) {
			jcbFuncionarios.addItem(aux);
		}
		funcionariosCMecanizado = new Vector<Funcionario>();

        tfApelido.setText("");
        cbImplementos.setSelectedIndex(0);
        cbTratores.setSelectedIndex(0);
        jlFuncionarios.setListData(funcionariosCMecanizado);
	}
	
	public CMecanizado recuperarFormulario() {
        String apelido = tfApelido.getText();
        TratoresImplementos implemento = null, trator = null;
        implemento = (TratoresImplementos) cbImplementos.getSelectedItem();
        trator = (TratoresImplementos) cbTratores.getSelectedItem();
        
        CMecanizado c = new CMecanizado(apelido, funcionariosCMecanizado, trator, implemento);
		return c;
	}

	public void alterarFormulario(CMecanizado c) {
		tfApelido.setText(c.getApelido());
        TratoresImplementos trator = null;
        for (int i = 0; i < cbTratores.getItemCount(); i++) {
        	trator = (TratoresImplementos) cbTratores.getItemAt(i);
        	if(trator.getId() == c.getTrator().getId())
        		cbTratores.setSelectedIndex(i);
		}
        TratoresImplementos implemento = null;
        for (int i = 0; i < cbImplementos.getItemCount(); i++) {
        	implemento = (TratoresImplementos) cbImplementos.getItemAt(i);
        	if(implemento.getId() == c.getImplemento().getId())
        		cbImplementos.setSelectedIndex(i);
		}
   		atualizarListaFuncionariosCMecanizado(c.getFuncionarios());
	}
	
	public void atualizarListaFuncionariosCMecanizado(Vector<Funcionario> funcionariosCMecanizado){
		this.funcionariosCMecanizado = funcionariosCMecanizado;
		jlFuncionarios.setListData(funcionariosCMecanizado);
	}
}
