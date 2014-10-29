package br.ifce.crato.view;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.ifce.crato.actions.TratorAction;
import br.ifce.crato.beans.TratoresImplementos;

public class TelaTratoresImplementos extends JPanel {
	private static final long serialVersionUID = 1784502629524039164L;
	private JTextField tfTratorApelido;
	private JTextField tfTratorMarca;
	private JTextField tfTratorModelo;
	private JTextField tfTratorTracao;
	private JTextField tfTratorMotor;
	private JTextField tfTratorCilindros;
	private JTextField tfTratorAspiracao;
	private JTextField tfTratorPotencia;
	private JTextField tfTratorAno;
	private JTextField tfTratorCor;
	private JTextField tfTratorNovo;
	private JTextField tfTratorSucata;
	private JTextField tfTratorUso;
	private JTextField tfTratorVidaUtil;
	private JTextField tfTratorHoras;
	private JTextField tfTratorHidraulico;
	private JTextField tfTratorTdp;
	private JRadioButton rbTrator;
	private JRadioButton rbImplemento; 
	private JList<TratoresImplementos> jlTratores;
	private JButton jbTratorEditar;
	private JButton jbTratorCadastrar;
	private JButton jbTratorSalvar;
	private JButton jbTratorLimpar;
	private JButton jbTratorApagar;
	
	private TratorAction tratorAction;
	private TratoresImplementos antigo;
	private TelaInicial telaInicial;

	public TelaTratoresImplementos(TelaInicial t) {
		this();
		this.telaInicial = t;
	}
		
	public TelaTratoresImplementos() {
		setLayout(null);
		
		tratorAction = new TratorAction();
		
		JLabel label = new JLabel();
		label.setText("Apelido:");
		label.setBounds(new Rectangle(10, 39, 61, 16));
		label.setBounds(6, 38, 61, 16);
		add(label);
		
		tfTratorApelido = new JTextField();
		tfTratorApelido.setBounds(new Rectangle(10, 61, 92, 25));
		tfTratorApelido.setBounds(6, 60, 92, 25);
		add(tfTratorApelido);
		
		JLabel label_1 = new JLabel();
		label_1.setText("Marca:");
		label_1.setBounds(new Rectangle(112, 39, 45, 16));
		label_1.setBounds(108, 38, 45, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setText("Modelo:");
		label_2.setBounds(new Rectangle(210, 39, 60, 16));
		label_2.setBounds(206, 38, 60, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Tra\u00E7\u00E3o:");
		label_3.setBounds(new Rectangle(10, 98, 45, 16));
		label_3.setBounds(6, 97, 45, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setText("Ano:");
		label_4.setBounds(new Rectangle(210, 159, 45, 16));
		label_4.setBounds(206, 158, 45, 16);
		add(label_4);
		
		tfTratorMarca = new JTextField();
		tfTratorMarca.setBounds(new Rectangle(112, 62, 88, 25));
		tfTratorMarca.setBounds(108, 61, 88, 25);
		add(tfTratorMarca);
		
		tfTratorModelo = new JTextField();
		tfTratorModelo.setBounds(new Rectangle(210, 61, 95, 25));
		tfTratorModelo.setBounds(206, 60, 95, 25);
		add(tfTratorModelo);
		
		JLabel label_5 = new JLabel();
		label_5.setText("Motor:");
		label_5.setBounds(new Rectangle(112, 99, 43, 16));
		label_5.setBounds(108, 98, 43, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setText("Cilindros:");
		label_6.setBounds(new Rectangle(210, 99, 92, 16));
		label_6.setBounds(206, 98, 92, 16);
		add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setText("Aspira\u00E7\u00E3o:");
		label_7.setBounds(new Rectangle(10, 158, 76, 16));
		label_7.setBounds(6, 157, 76, 16);
		add(label_7);
		
		JLabel label_8 = new JLabel();
		label_8.setText("Pot\u00EAncia:");
		label_8.setBounds(new Rectangle(112, 159, 61, 16));
		label_8.setBounds(108, 158, 61, 16);
		add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setText("Cor:");
		label_9.setBounds(new Rectangle(10, 218, 25, 16));
		label_9.setBounds(6, 217, 25, 16);
		add(label_9);
		
		tfTratorTracao = new JTextField();
		tfTratorTracao.setBounds(new Rectangle(10, 118, 92, 25));
		tfTratorTracao.setBounds(6, 117, 92, 25);
		add(tfTratorTracao);
		
		tfTratorMotor = new JTextField();
		tfTratorMotor.setBounds(new Rectangle(112, 120, 88, 25));
		tfTratorMotor.setBounds(108, 119, 88, 25);
		add(tfTratorMotor);
		
		tfTratorCilindros = new JTextField();
		tfTratorCilindros.setBounds(new Rectangle(210, 121, 95, 25));
		tfTratorCilindros.setBounds(206, 120, 95, 25);
		add(tfTratorCilindros);
		
		tfTratorAspiracao = new JTextField();
		tfTratorAspiracao.setBounds(new Rectangle(10, 182, 92, 25));
		tfTratorAspiracao.setBounds(6, 181, 92, 25);
		add(tfTratorAspiracao);
		
		tfTratorPotencia = new JTextField();
		tfTratorPotencia.setBounds(new Rectangle(112, 182, 88, 25));
		tfTratorPotencia.setBounds(108, 181, 88, 25);
		add(tfTratorPotencia);
		
		tfTratorAno = new JTextField();
		tfTratorAno.setBounds(new Rectangle(210, 182, 61, 25));
		tfTratorAno.setBounds(206, 181, 61, 25);
		add(tfTratorAno);
		
		JLabel label_10 = new JLabel();
		label_10.setText("(aaaa)");
		label_10.setBounds(new Rectangle(271, 186, 61, 16));
		label_10.setBounds(267, 185, 61, 16);
		add(label_10);
		
		tfTratorCor = new JTextField();
		tfTratorCor.setBounds(new Rectangle(10, 240, 76, 25));
		tfTratorCor.setBounds(6, 239, 76, 25);
		add(tfTratorCor);
		
		jbTratorCadastrar = new JButton();
		jbTratorCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TratoresImplementos novo = recuperarFormulario();
				tratorAction.inserir(novo);
				limparCampos();
				atualizarLista();
				telaInicial.getJpCMecanizados().limparCampos();
			}
		});
		jbTratorCadastrar.setText("Cadastrar");
		jbTratorCadastrar.setBounds(new Rectangle(100, 233, 91, 31));
		jbTratorCadastrar.setBounds(96, 232, 91, 31);
		add(jbTratorCadastrar);
		
		JButton jbTratorPesquisar = new JButton();
		jbTratorPesquisar.setText("Pesquisar");
		jbTratorPesquisar.setBounds(new Rectangle(205, 233, 106, 31));
		jbTratorPesquisar.setBounds(201, 232, 106, 31);
		add(jbTratorPesquisar);
		
		jbTratorSalvar = new JButton();
		jbTratorSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TratoresImplementos novo = recuperarFormulario();
				tratorAction.alterar(antigo, novo);
				limparCampos();
				jbTratorSalvar.setEnabled(false);
				atualizarLista();
				telaInicial.getJpCMecanizados().limparCampos();
			}
		});
		jbTratorSalvar.setText("Salvar");
		jbTratorSalvar.setEnabled(false);
		jbTratorSalvar.setBounds(new Rectangle(325, 233, 91, 31));
		jbTratorSalvar.setBounds(321, 232, 91, 31);
		add(jbTratorSalvar);
		
		jbTratorEditar = new JButton();
		jbTratorEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jlTratores.getSelectedIndex() != -1){
					Vector<TratoresImplementos> lista = tratorAction.pesquisar();
					TratoresImplementos t = lista.get(jlTratores.getSelectedIndex());
					alterarFormulario(t);
					antigo = t;
					jbTratorSalvar.setEnabled(true);
				}
			}
		});
		jbTratorEditar.setText("Editar");
		jbTratorEditar.setBounds(new Rectangle(325, 398, 91, 31));
		jbTratorEditar.setBounds(321, 397, 91, 31);
		add(jbTratorEditar);

		jbTratorApagar = new JButton();
		jbTratorApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jlTratores.getSelectedIndex() != -1){
					Vector<TratoresImplementos> lista = tratorAction.pesquisar();
					TratoresImplementos t = lista.get(jlTratores.getSelectedIndex());
					int opcao = JOptionPane.showConfirmDialog(null, "Confirma exclusão?");
					if(opcao == JOptionPane.YES_OPTION){
						tratorAction.deletar(t);
						atualizarLista();
						limparCampos();
						jbTratorSalvar.setEnabled(false);
						telaInicial.getJpCMecanizados().limparCampos();
					}
				}
			}
		});
		jbTratorApagar.setText("Apagar");
		jbTratorApagar.setBounds(new Rectangle(325, 443, 91, 31));
		jbTratorApagar.setBounds(321, 442, 91, 31);
		add(jbTratorApagar);
		
		jbTratorLimpar = new JButton();
		jbTratorLimpar.setText("Limpar");
		jbTratorLimpar.setBounds(new Rectangle(325, 278, 91, 31));
		jbTratorLimpar.setBounds(321, 277, 91, 31);
		add(jbTratorLimpar);
		
		JLabel label_11 = new JLabel();
		label_11.setText("Novo:");
		label_11.setBounds(new Rectangle(117, 16, 45, 16));
		label_11.setBounds(311, 38, 45, 16);
		add(label_11);
		
		tfTratorNovo = new JTextField();
		tfTratorNovo.setBounds(new Rectangle(117, 39, 88, 25));
		tfTratorNovo.setBounds(311, 61, 45, 25);
		add(tfTratorNovo);
		
		JLabel label_12 = new JLabel();
		label_12.setText("Sucata:");
		label_12.setBounds(new Rectangle(117, 76, 43, 16));
		label_12.setBounds(311, 98, 53, 16);
		add(label_12);
		
		tfTratorSucata = new JTextField();
		tfTratorSucata.setBounds(new Rectangle(117, 97, 88, 25));
		tfTratorSucata.setBounds(311, 119, 45, 25);
		add(tfTratorSucata);
		
		tfTratorUso = new JTextField();
		tfTratorUso.setBounds(new Rectangle(117, 159, 88, 25));
		tfTratorUso.setBounds(311, 181, 45, 25);
		add(tfTratorUso);
		
		tfTratorVidaUtil = new JTextField();
		tfTratorVidaUtil.setBounds(new Rectangle(117, 39, 88, 25));
		tfTratorVidaUtil.setBounds(366, 61, 45, 25);
		add(tfTratorVidaUtil);
		
		JLabel label_13 = new JLabel();
		label_13.setText("Hrs estima/ano:");
		label_13.setBounds(new Rectangle(110, 76, 43, 16));
		label_13.setBounds(376, 97, 119, 16);
		add(label_13);
		
		tfTratorHoras = new JTextField();
		tfTratorHoras.setBounds(new Rectangle(117, 97, 88, 25));
		tfTratorHoras.setBounds(376, 118, 87, 25);
		add(tfTratorHoras);
		
		JLabel label_14 = new JLabel();
		label_14.setText("Hidraulico Diant:");
		label_14.setBounds(new Rectangle(117, 136, 61, 16));
		label_14.setBounds(376, 158, 119, 16);
		add(label_14);
		
		tfTratorHidraulico = new JTextField();
		tfTratorHidraulico.setBounds(new Rectangle(117, 159, 88, 25));
		tfTratorHidraulico.setBounds(376, 181, 89, 25);
		add(tfTratorHidraulico);
		
		JLabel label_15 = new JLabel();
		label_15.setText("TDP:");
		label_15.setBounds(new Rectangle(117, 16, 45, 16));
		label_15.setBounds(431, 38, 45, 16);
		add(label_15);
		
		tfTratorTdp = new JTextField();
		tfTratorTdp.setBounds(new Rectangle(117, 39, 88, 25));
		tfTratorTdp.setBounds(431, 61, 45, 25);
		add(tfTratorTdp);
		
		JLabel label_16 = new JLabel();
		label_16.setText("Uso anual:");
		label_16.setBounds(new Rectangle(117, 16, 45, 16));
		label_16.setBounds(311, 159, 61, 16);
		add(label_16);
		
		JLabel label_17 = new JLabel();
		label_17.setText("Vida \u00FAtil:");
		label_17.setBounds(new Rectangle(117, 136, 61, 16));
		label_17.setBounds(366, 39, 61, 16);
		add(label_17);
		
		JLabel label_18 = new JLabel();
		label_18.setText("(h)");
		label_18.setBounds(new Rectangle(276, 163, 61, 16));
		label_18.setBounds(413, 65, 61, 16);
		add(label_18);
		
		JLabel label_19 = new JLabel();
		label_19.setText("(h)");
		label_19.setBounds(new Rectangle(276, 163, 61, 16));
		label_19.setBounds(358, 186, 61, 16);
		add(label_19);
		
		ButtonGroup bg = new ButtonGroup();
		
		rbTrator = new JRadioButton("Trator");
		rbTrator.setSelected(true);
		rbTrator.setBounds(6, 6, 81, 23);
		add(rbTrator);
		
		rbImplemento = new JRadioButton("Implemento");
		rbImplemento.setBounds(104, 6, 109, 23);
		add(rbImplemento);
		
		bg.add(rbTrator);
		bg.add(rbImplemento);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 276, 301, 193);
		add(scrollPane);
		
		jlTratores = new JList<TratoresImplementos>();
		scrollPane.setViewportView(jlTratores);

		atualizarLista();
	}

	public void atualizarLista() {
		jlTratores.setListData(tratorAction.pesquisar());
	}
	
	public void limparCampos(){
        tfTratorAno.setText("");
        tfTratorApelido.setText("");
        tfTratorAspiracao.setText("");
        tfTratorCilindros.setText("");
        tfTratorCor.setText("");
        tfTratorHidraulico.setText("");
        tfTratorHoras.setText("");
        tfTratorMarca.setText("");
        tfTratorModelo.setText("");
        tfTratorMotor.setText("");
        tfTratorNovo.setText("");
        tfTratorPotencia.setText("");
        tfTratorSucata.setText("");
        tfTratorTdp.setText("");
        tfTratorTracao.setText("");
        tfTratorUso.setText("");
        tfTratorVidaUtil.setText("");
        rbTrator.setSelected(true);
        rbImplemento.setSelected(false);
	}
	
	public TratoresImplementos recuperarFormulario() {
		
        String ano = tfTratorAno.getText();
        String apelido = tfTratorApelido.getText();
        String aspiracao = tfTratorAspiracao.getText();
        String cilindros = tfTratorCilindros.getText();
        String cor = tfTratorCor.getText();
        String hidraulico = tfTratorHidraulico.getText();
        String horasEstimadas = tfTratorHoras.getText();
        String marca = tfTratorMarca.getText();
        String modelo = tfTratorModelo.getText();
        String motor = tfTratorMotor.getText();
        String novo = tfTratorNovo.getText();
        String potencia = tfTratorPotencia.getText();
        String sucata = tfTratorSucata.getText();
        String tdp = tfTratorTdp.getText();
        String tracao = tfTratorTracao.getText();
        String usoAnual = tfTratorUso.getText();
        String vidaUtil = tfTratorVidaUtil.getText();
        boolean eTrator = rbTrator.isSelected();

		TratoresImplementos t = new TratoresImplementos(eTrator,  apelido,
				 marca,  modelo,  novo,  vidaUtil,
				 tdp,  tracao,  motor,  cilindros,
				 sucata,  horasEstimadas,  aspiracao,
				 potencia,  ano,  usoAnual,  hidraulico, cor);
		return t;
	}

	public void alterarFormulario(TratoresImplementos t) {
        tfTratorAno.setText(t.getAno());
        tfTratorApelido.setText(t.getApelido());
        tfTratorAspiracao.setText(t.getAspiracao());
        tfTratorCilindros.setText(t.getCilindros());
        tfTratorCor.setText(t.getCor());
        tfTratorHidraulico.setText(t.getHidraulico());
        tfTratorHoras.setText(t.getHorasEstimadas());
        tfTratorMarca.setText(t.getMarca());
        tfTratorModelo.setText(t.getModelo());
        tfTratorMotor.setText(t.getMotor());
        tfTratorNovo.setText(t.getNovo());
        tfTratorPotencia.setText(t.getPotencia());
        tfTratorSucata.setText(t.getSucata());
        tfTratorTdp.setText(t.getTdp());
        tfTratorTracao.setText(t.getTracao());
        tfTratorUso.setText(t.getUsoAnual());
        tfTratorVidaUtil.setText(t.getVidaUtil());
        rbTrator.setSelected(t.iseTrator());
        rbImplemento.setSelected(!t.iseTrator());

	}
	
}
