package br.ifce.crato.view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.ifce.crato.actions.FuncaoAction;
import br.ifce.crato.actions.FuncionarioAction;
import br.ifce.crato.beans.Funcao;
import br.ifce.crato.beans.Funcionario;

public class TelaFuncionarios extends JPanel {
	private static final long serialVersionUID = 6544842812408569697L;
	private JTextField tfFuncionarioNome;
	private JTextField tfFuncionarioAdmissao;
	private JTextField tfFuncionarioInsalubridade;
	private JTextField tfFuncionarioPericulosidade;
	private JTextField tfFuncionarioAgua;
	private JTextField tfFuncionarioLuz;
	private JTextField tfFuncionarioAluguel;
	private JTextField tfFuncionarioEncargos;
	private JTextField tfFuncionarioInss;
	private JTextField tfFuncionarioFgts;
	private JTextField tfFuncionarioIdade;
	private JList<Funcionario> jlFuncionario;
	private JComboBox<Funcao> cbFuncionarioFuncao;
	private JTextArea tfFuncionarioExperiencia;
	private JButton jbFuncionarioSalvar;

	private TelaFuncao telaFuncao;
	private FuncionarioAction funcionarioAction;
	private FuncaoAction funcaoAction;
	private Funcionario antigo;
	private TelaInicial telaInicial;
	
	public TelaFuncionarios(TelaInicial t) {
		this();
		this.telaInicial = t;
	}
	public TelaFuncionarios() {
		setSize(800,600);
		setLayout(null);
		
		funcionarioAction = new FuncionarioAction();
		funcaoAction = new FuncaoAction();
		telaFuncao = new TelaFuncao(this);
		telaFuncao.setVisible(false);
		
		JLabel label = new JLabel();
		label.setText("Nome:");
		label.setBounds(new Rectangle(16, 15, 45, 16));
		label.setBounds(11, 11, 45, 16);
		add(label);
		
		tfFuncionarioNome = new JTextField();
		tfFuncionarioNome.setBounds(new Rectangle(15, 35, 406, 25));
		tfFuncionarioNome.setBounds(10, 31, 406, 25);
		add(tfFuncionarioNome);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Data Admiss\u00E3o:");
		label_1.setBounds(new Rectangle(15, 75, 106, 16));
		label_1.setBounds(10, 71, 106, 16);
		add(label_1);
		
		tfFuncionarioAdmissao = new JTextField();
		tfFuncionarioAdmissao.setBounds(new Rectangle(15, 97, 91, 24));
		tfFuncionarioAdmissao.setBounds(10, 93, 91, 24);
		add(tfFuncionarioAdmissao);
		
		JLabel label_2 = new JLabel();
		label_2.setText("dd/mm/aaaa");
		label_2.setBounds(new Rectangle(116, 90, 95, 31));
		label_2.setBounds(111, 86, 95, 31);
		add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Insalubridade:");
		label_3.setBounds(new Rectangle(15, 135, 91, 16));
		label_3.setBounds(10, 131, 91, 16);
		add(label_3);
		
		tfFuncionarioInsalubridade = new JTextField();
		tfFuncionarioInsalubridade.setBounds(new Rectangle(15, 157, 91, 24));
		tfFuncionarioInsalubridade.setBounds(10, 153, 91, 24);
		add(tfFuncionarioInsalubridade);
		
		JLabel label_4 = new JLabel();
		label_4.setText("Periculosidade:");
		label_4.setBounds(new Rectangle(120, 135, 90, 16));
		label_4.setBounds(115, 131, 90, 16);
		add(label_4);
		
		tfFuncionarioPericulosidade = new JTextField();
		tfFuncionarioPericulosidade.setBounds(new Rectangle(120, 158, 91, 24));
		tfFuncionarioPericulosidade.setBounds(115, 154, 91, 24);
		add(tfFuncionarioPericulosidade);
		
		JLabel label_5 = new JLabel();
		label_5.setText("Agua:");
		label_5.setBounds(new Rectangle(15, 195, 88, 17));
		label_5.setBounds(10, 191, 88, 17);
		add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setText("Luz:");
		label_6.setBounds(new Rectangle(120, 195, 88, 16));
		label_6.setBounds(115, 191, 88, 16);
		add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setText("Aluguel:");
		label_7.setBounds(new Rectangle(225, 195, 88, 16));
		label_7.setBounds(220, 191, 88, 16);
		add(label_7);
		
		tfFuncionarioAgua = new JTextField();
		tfFuncionarioAgua.setBounds(new Rectangle(15, 217, 92, 24));
		tfFuncionarioAgua.setBounds(10, 213, 92, 24);
		add(tfFuncionarioAgua);
		
		tfFuncionarioLuz = new JTextField();
		tfFuncionarioLuz.setBounds(new Rectangle(120, 217, 92, 24));
		tfFuncionarioLuz.setBounds(115, 213, 92, 24);
		add(tfFuncionarioLuz);
		
		tfFuncionarioAluguel = new JTextField();
		tfFuncionarioAluguel.setBounds(new Rectangle(225, 217, 91, 24));
		tfFuncionarioAluguel.setBounds(220, 213, 91, 24);
		add(tfFuncionarioAluguel);
		
		JLabel label_8 = new JLabel();
		label_8.setText("Encargos:");
		label_8.setBounds(new Rectangle(15, 256, 76, 16));
		label_8.setBounds(10, 252, 76, 16);
		add(label_8);
		
		tfFuncionarioEncargos = new JTextField();
		tfFuncionarioEncargos.setBounds(new Rectangle(15, 279, 91, 24));
		tfFuncionarioEncargos.setBounds(10, 275, 91, 24);
		add(tfFuncionarioEncargos);
		
		JLabel label_9 = new JLabel();
		label_9.setText("Fun\u00E7\u00E3o:");
		label_9.setBounds(new Rectangle(120, 255, 57, 16));
		label_9.setBounds(115, 251, 57, 16);
		add(label_9);
		
		JButton jbFuncionarioEditarFuncao = new JButton();
		jbFuncionarioEditarFuncao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaFuncao.setVisible(true);
			}
		});
		jbFuncionarioEditarFuncao.setText("Editar Fun\u00E7\u00E3o");
		jbFuncionarioEditarFuncao.setBounds(new Rectangle(315, 270, 106, 31));
		jbFuncionarioEditarFuncao.setBounds(321, 272, 106, 31);
		add(jbFuncionarioEditarFuncao);
		
		tfFuncionarioInss = new JTextField();
		tfFuncionarioInss.setBounds(new Rectangle(225, 157, 91, 24));
		tfFuncionarioInss.setBounds(220, 153, 91, 24);
		add(tfFuncionarioInss);
		
		tfFuncionarioFgts = new JTextField();
		tfFuncionarioFgts.setBounds(new Rectangle(326, 96, 95, 24));
		tfFuncionarioFgts.setBounds(321, 92, 95, 24);
		add(tfFuncionarioFgts);
		
		JLabel label_10 = new JLabel();
		label_10.setText("INSS:");
		label_10.setBounds(new Rectangle(225, 135, 45, 16));
		label_10.setBounds(220, 131, 45, 16);
		add(label_10);
		
		JLabel label_11 = new JLabel();
		label_11.setText("FGTS:");
		label_11.setBounds(new Rectangle(326, 75, 45, 16));
		label_11.setBounds(321, 71, 45, 16);
		add(label_11);
		
		JButton jbFuncionarioCadastrar = new JButton();
		jbFuncionarioCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcionario f = recuperarFormulario();
				funcionarioAction.inserir(f);
				atualizarLista();
				limparCampos();
				telaInicial.getJpCMecanizados().limparCampos();
			}
		});
		jbFuncionarioCadastrar.setText("Cadastrar");
		jbFuncionarioCadastrar.setBounds(new Rectangle(15, 315, 91, 31));
		jbFuncionarioCadastrar.setBounds(10, 311, 91, 31);
		add(jbFuncionarioCadastrar);
		
		JButton jbFuncionarioPesquisar = new JButton();
		jbFuncionarioPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbFuncionarioPesquisar.setText("Pesquisar");
		jbFuncionarioPesquisar.setBounds(new Rectangle(120, 315, 106, 31));
		jbFuncionarioPesquisar.setBounds(115, 311, 106, 31);
		add(jbFuncionarioPesquisar);
		
		jbFuncionarioSalvar = new JButton();
		jbFuncionarioSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario novo = recuperarFormulario();
				funcionarioAction.alterar(antigo, novo);
				limparCampos();
				jbFuncionarioSalvar.setEnabled(false);
				atualizarLista();
				telaInicial.getJpCMecanizados().limparCampos();
			}
		});
		jbFuncionarioSalvar.setText("Salvar");
		jbFuncionarioSalvar.setEnabled(false);
		jbFuncionarioSalvar.setBounds(new Rectangle(240, 316, 91, 30));
		jbFuncionarioSalvar.setBounds(235, 312, 91, 30);
		add(jbFuncionarioSalvar);
		
		JButton jbFuncionarioEditar = new JButton();
		jbFuncionarioEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jlFuncionario.getSelectedIndex() != -1){
					Funcionario f = (Funcionario)jlFuncionario.getSelectedValue();
					alterarFormulario(f);
					antigo = f;
					jbFuncionarioSalvar.setEnabled(true);
				}

			}
		});
		jbFuncionarioEditar.setText("Editar");
		jbFuncionarioEditar.setBounds(new Rectangle(345, 390, 76, 31));
		jbFuncionarioEditar.setBounds(340, 386, 76, 31);
		add(jbFuncionarioEditar);
		
		JButton jbFuncionarioApagar = new JButton();
		jbFuncionarioApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jlFuncionario.getSelectedIndex() != -1){
					Vector<Funcionario> lista = funcionarioAction.pesquisar();
					Funcionario f = lista.get(jlFuncionario.getSelectedIndex());
					int opcao = JOptionPane.showConfirmDialog(null, "Confirma exclusão?");
					if(opcao == JOptionPane.YES_OPTION){
						funcionarioAction.deletar(f);
						atualizarLista();
						limparCampos();
						jbFuncionarioSalvar.setEnabled(false);
						telaInicial.getJpCMecanizados().limparCampos();
					}
				}
			}
		});
		jbFuncionarioApagar.setText("Apagar");
		jbFuncionarioApagar.setBounds(new Rectangle(345, 435, 76, 31));
		jbFuncionarioApagar.setBounds(340, 431, 76, 31);
		add(jbFuncionarioApagar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(15, 360, 316, 106));
		scrollPane.setBounds(10, 356, 316, 106);
		add(scrollPane);
		
		jlFuncionario = new JList<Funcionario>();
		scrollPane.setViewportView(jlFuncionario);
		
		JButton jbFuncionarioLimpar = new JButton();
		jbFuncionarioLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbFuncionarioLimpar.setText("Limpar");
		jbFuncionarioLimpar.setBounds(new Rectangle(345, 315, 76, 31));
		jbFuncionarioLimpar.setBounds(340, 311, 76, 31);
		add(jbFuncionarioLimpar);
		
		JLabel label_12 = new JLabel();
		label_12.setText("Idade:");
		label_12.setBounds(new Rectangle(15, 75, 106, 16));
		label_12.setBounds(220, 71, 106, 16);
		add(label_12);
		
		tfFuncionarioIdade = new JTextField();
		tfFuncionarioIdade.setBounds(new Rectangle(15, 97, 106, 24));
		tfFuncionarioIdade.setBounds(220, 93, 91, 24);
		add(tfFuncionarioIdade);
		
		JLabel label_13 = new JLabel();
		label_13.setText("Experi\u00EAncia:");
		label_13.setBounds(new Rectangle(15, 130, 61, 16));
		label_13.setBounds(321, 131, 128, 16);
		add(label_13);
		
		tfFuncionarioExperiencia = new JTextArea();
		tfFuncionarioExperiencia.setBounds(321, 151, 95, 86);
		add(tfFuncionarioExperiencia);
		
		cbFuncionarioFuncao = new JComboBox<Funcao>();
		cbFuncionarioFuncao.setBounds(111, 274, 197, 26);
		add(cbFuncionarioFuncao);
		atualizarCombobox();
		atualizarLista();
	}
	
	public void atualizarLista() {
		jlFuncionario.setListData(funcionarioAction.pesquisar());
	}
	
	public void limparCampos(){
        tfFuncionarioAdmissao.setText("");
        cbFuncionarioFuncao.setSelectedIndex(0);
        tfFuncionarioAgua.setText("");
		tfFuncionarioAluguel.setText("");
		tfFuncionarioEncargos.setText("");
		tfFuncionarioExperiencia.setText("");
		tfFuncionarioFgts.setText("");
		tfFuncionarioIdade.setText("");
		tfFuncionarioInsalubridade.setText("");
		tfFuncionarioInss.setText("");
		tfFuncionarioLuz.setText("");
		tfFuncionarioNome.setText("");
		tfFuncionarioPericulosidade.setText("");

	}

	public Funcionario recuperarFormulario() {
		java.sql.Date data = null;
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        java.util.Date parsed = format.parse(tfFuncionarioAdmissao.getText());
	        data  = new java.sql.Date(parsed.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
		
        String nome = tfFuncionarioNome.getText();
        double agua = Double.valueOf(tfFuncionarioAgua.getText());
        int indice = -1;
        Funcao funcao = null;
    	indice = cbFuncionarioFuncao.getSelectedIndex();
    	funcao = (Funcao) cbFuncionarioFuncao.getItemAt(indice);
        double aluguel = Double.valueOf(tfFuncionarioAluguel.getText());
        double encargos = Double.valueOf(tfFuncionarioEncargos.getText());
        double fgts = Double.valueOf(tfFuncionarioFgts.getText());
        int idade = Integer.valueOf(tfFuncionarioIdade.getText());
        double insalubridade = Double.valueOf(tfFuncionarioInsalubridade.getText());
        double inss = Double.valueOf(tfFuncionarioInss.getText());
        double luz = Double.valueOf(tfFuncionarioLuz.getText());
        double periculosidade = Double.valueOf(tfFuncionarioPericulosidade.getText());
        String experiencia = tfFuncionarioExperiencia.getText();
        
		Funcionario f = new Funcionario(nome,data,idade,fgts,insalubridade,periculosidade,inss, experiencia, agua, luz, aluguel, encargos, funcao);
		return f;
	}

	public void alterarFormulario(Funcionario f) {
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String sdata = format.format(f.getDataAdmissao());  
			tfFuncionarioAdmissao.setText(sdata);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		tfFuncionarioNome.setText(f.getNome());
		tfFuncionarioAgua.setText(String.valueOf(f.getAgua()));
        Funcao funcao = null;
        for (int i = 0; i < cbFuncionarioFuncao.getItemCount(); i++) {
        	funcao = (Funcao) cbFuncionarioFuncao.getItemAt(i);
        	if(funcao.getId() == f.getFuncao().getId())
        		cbFuncionarioFuncao.setSelectedIndex(i);
		}
        tfFuncionarioAluguel.setText(String.valueOf(f.getAluguel()));
        tfFuncionarioEncargos.setText(String.valueOf(f.getEncargos()));
        tfFuncionarioFgts.setText(String.valueOf(f.getFgts()));
        tfFuncionarioIdade.setText(String.valueOf(f.getIdade()));
        tfFuncionarioInsalubridade.setText(String.valueOf(f.getInsalubridade()));
        tfFuncionarioInss.setText(String.valueOf(f.getInss()));
        tfFuncionarioLuz.setText(String.valueOf(f.getLuz()));
        tfFuncionarioPericulosidade.setText(String.valueOf(f.getPericulosidade()));
        tfFuncionarioExperiencia.setText(f.getExperiencia());
	}

	public void atualizarCombobox(){
		Vector<Funcao> lista = funcaoAction.pesquisar();
		cbFuncionarioFuncao.removeAllItems();  
		for (Funcao funcao : lista) {
			cbFuncionarioFuncao.addItem(funcao);	
		}
	}
}
