package br.ifce.crato.view;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;

public class TelaCustoVariavel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Create the panel.
	 */
	public TelaCustoVariavel() {
		setSize(800,600);
		setLayout(null);
		
		JLabel lblTaxaDeJuros = new JLabel();
		lblTaxaDeJuros.setText("Combust\u00EDvel (C):");
		lblTaxaDeJuros.setBounds(new Rectangle(16, 15, 45, 16));
		lblTaxaDeJuros.setBounds(11, 67, 297, 16);
		add(lblTaxaDeJuros);
		
		textField = new JTextField();
		textField.setBounds(new Rectangle(15, 35, 406, 25));
		textField.setBounds(10, 87, 91, 25);
		add(textField);
		
		JLabel lblEstimativaDoRitmo = new JLabel();
		lblEstimativaDoRitmo.setText("M\u00E3o de obra (MO):");
		lblEstimativaDoRitmo.setBounds(new Rectangle(15, 75, 106, 16));
		lblEstimativaDoRitmo.setBounds(10, 127, 316, 16);
		add(lblEstimativaDoRitmo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(new Rectangle(15, 97, 91, 24));
		textField_1.setBounds(10, 149, 91, 24);
		add(textField_1);
		
		JLabel lblNmeroDeConjuntos = new JLabel();
		lblNmeroDeConjuntos.setText("Reparo e Manuten\u00E7\u00E3o (RM):");
		lblNmeroDeConjuntos.setBounds(new Rectangle(15, 135, 91, 16));
		lblNmeroDeConjuntos.setBounds(414, 74, 316, 16);
		add(lblNmeroDeConjuntos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(new Rectangle(15, 157, 91, 24));
		textField_2.setBounds(414, 96, 91, 24);
		add(textField_2);
		
		JLabel lblCapacidadeDeCampo = new JLabel();
		lblCapacidadeDeCampo.setText("\u00D3leos lubrificantes (OL):");
		lblCapacidadeDeCampo.setBounds(new Rectangle(15, 195, 88, 17));
		lblCapacidadeDeCampo.setBounds(10, 191, 316, 17);
		add(lblCapacidadeDeCampo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(new Rectangle(15, 217, 92, 24));
		textField_4.setBounds(11, 240, 92, 24);
		add(textField_4);
		
		JLabel lblCapacidadeDe = new JLabel();
		lblCapacidadeDe.setText("Filtros (F):");
		lblCapacidadeDe.setBounds(new Rectangle(15, 256, 76, 16));
		lblCapacidadeDe.setBounds(11, 275, 229, 16);
		add(lblCapacidadeDe);
		
		textField_7 = new JTextField();
		textField_7.setBounds(new Rectangle(15, 279, 91, 24));
		textField_7.setBounds(12, 309, 91, 24);
		add(textField_7);
		
		JLabel lblTd = new JLabel();
		lblTd.setText("C1 (R$/h) = 0,25 x PotBT x Pre\u00E7o do combust\u00EDvel (R$)");
		lblTd.setBounds(new Rectangle(116, 90, 95, 31));
		lblTd.setBounds(111, 67, 305, 31);
		add(lblTd);
		
		JLabel lblNcNoct = new JLabel();
		lblNcNoct.setText("Crm = (VI x Fr)/Vuh");
		lblNcNoct.setBounds(new Rectangle(116, 90, 95, 31));
		lblNcNoct.setBounds(515, 89, 128, 31);
		add(lblNcNoct);
		
		JLabel lblTempoDeMquina = new JLabel();
		lblTempoDeMquina.setText("Consumo de graxa (CG):");
		lblTempoDeMquina.setBounds(new Rectangle(15, 256, 76, 16));
		lblTempoDeMquina.setBounds(12, 344, 315, 16);
		add(lblTempoDeMquina);
		
		textField_3 = new JTextField();
		textField_3.setBounds(new Rectangle(15, 279, 91, 24));
		textField_3.setBounds(13, 391, 91, 24);
		add(textField_3);
		
		JLabel lblCapacidadeDeCampo_1 = new JLabel();
		lblCapacidadeDeCampo_1.setText("Outros:");
		lblCapacidadeDeCampo_1.setBounds(new Rectangle(15, 256, 76, 16));
		lblCapacidadeDeCampo_1.setBounds(13, 426, 229, 16);
		add(lblCapacidadeDeCampo_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(new Rectangle(15, 279, 91, 24));
		textField_5.setBounds(13, 449, 91, 24);
		add(textField_5);
		
		JLabel lblCustosVariveisTotais = new JLabel();
		lblCustosVariveisTotais.setText("Custos Vari\u00E1veis Totais (CVT):");
		lblCustosVariveisTotais.setBounds(new Rectangle(15, 256, 76, 16));
		lblCustosVariveisTotais.setBounds(12, 484, 315, 16);
		add(lblCustosVariveisTotais);
		
		textField_6 = new JTextField();
		textField_6.setBounds(new Rectangle(15, 279, 91, 24));
		textField_6.setBounds(12, 507, 91, 24);
		add(textField_6);
		
		JLabel lblCrh = new JLabel();
		lblCrh.setText("C2 (R$/h) = consumo/hora x Pre\u00E7o litro");
		lblCrh.setBounds(new Rectangle(116, 90, 95, 31));
		lblCrh.setBounds(111, 89, 305, 31);
		add(lblCrh);
		
		JLabel lblStrh = new JLabel();
		lblStrh.setText("ST (R$/h) = (sal\u00E1rio mensal x 13)/horas de uso por ano");
		lblStrh.setBounds(new Rectangle(116, 90, 95, 31));
		lblStrh.setBounds(111, 149, 305, 31);
		add(lblStrh);
		
		JLabel lblSalrioMensal = new JLabel();
		lblSalrioMensal.setText("Sal\u00E1rio mensal = 1,5 x sal\u00E1rio m\u00EDnimo + 20% de encargos sociais");
		lblSalrioMensal.setBounds(new Rectangle(116, 90, 95, 31));
		lblSalrioMensal.setBounds(111, 127, 374, 31);
		add(lblSalrioMensal);
		
		textField_12 = new JTextField();
		textField_12.setBounds(new Rectangle(15, 279, 91, 24));
		textField_12.setBounds(131, 240, 91, 24);
		add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(new Rectangle(15, 279, 91, 24));
		textField_13.setBounds(250, 239, 91, 24);
		add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBounds(new Rectangle(15, 279, 91, 24));
		textField_14.setBounds(370, 239, 91, 24);
		add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(new Rectangle(15, 279, 91, 24));
		textField_15.setBounds(494, 239, 91, 24);
		add(textField_15);
		
		textField_8 = new JTextField();
		textField_8.setBounds(new Rectangle(15, 279, 91, 24));
		textField_8.setBounds(161, 309, 91, 24);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(new Rectangle(15, 279, 91, 24));
		textField_9.setBounds(309, 309, 91, 24);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(new Rectangle(15, 279, 91, 24));
		textField_10.setBounds(457, 309, 91, 24);
		add(textField_10);
		
		JLabel lblMotor = new JLabel();
		lblMotor.setText("Motor:");
		lblMotor.setBounds(new Rectangle(15, 195, 88, 17));
		lblMotor.setBounds(11, 219, 153, 17);
		add(lblMotor);
		
		JLabel lblCaixaDeCmbio = new JLabel();
		lblCaixaDeCmbio.setText("Caixa de c\u00E2mbio:");
		lblCaixaDeCmbio.setBounds(new Rectangle(15, 195, 88, 17));
		lblCaixaDeCmbio.setBounds(131, 220, 169, 17);
		add(lblCaixaDeCmbio);
		
		JLabel lblReduoFinal = new JLabel();
		lblReduoFinal.setText("Redu\u00E7\u00E3o final:");
		lblReduoFinal.setBounds(new Rectangle(15, 195, 88, 17));
		lblReduoFinal.setBounds(250, 219, 153, 17);
		add(lblReduoFinal);
		
		JLabel lblHidrulico = new JLabel();
		lblHidrulico.setText("Hidr\u00E1ulico:");
		lblHidrulico.setBounds(new Rectangle(15, 195, 88, 17));
		lblHidrulico.setBounds(370, 219, 153, 17);
		add(lblHidrulico);
		
		JLabel lblCaixaDeDireo = new JLabel();
		lblCaixaDeDireo.setText("Caixa de dire\u00E7\u00E3o:");
		lblCaixaDeDireo.setBounds(new Rectangle(15, 195, 88, 17));
		lblCaixaDeDireo.setBounds(494, 219, 153, 17);
		add(lblCaixaDeDireo);
		
		JLabel lblAr = new JLabel();
		lblAr.setText("Ar:");
		lblAr.setBounds(new Rectangle(15, 195, 88, 17));
		lblAr.setBounds(11, 290, 153, 17);
		add(lblAr);
		
		JLabel lblCrter = new JLabel();
		lblCrter.setText("C\u00E1rter:");
		lblCrter.setBounds(new Rectangle(15, 195, 88, 17));
		lblCrter.setBounds(161, 290, 153, 17);
		add(lblCrter);
		
		JLabel lblleo = new JLabel();
		lblleo.setText("\u00D3leo:");
		lblleo.setBounds(new Rectangle(15, 195, 88, 17));
		lblleo.setBounds(309, 290, 153, 17);
		add(lblleo);
		
		JLabel lblDireoEReduo = new JLabel();
		lblDireoEReduo.setText("Dire\u00E7\u00E3o e redu\u00E7\u00E3o final:");
		lblDireoEReduo.setBounds(new Rectangle(15, 195, 88, 17));
		lblDireoEReduo.setBounds(457, 290, 153, 17);
		add(lblDireoEReduo);
		
		JLabel lblTratores = new JLabel();
		lblTratores.setText("Tratores:");
		lblTratores.setBounds(new Rectangle(15, 195, 88, 17));
		lblTratores.setBounds(12, 371, 153, 17);
		add(lblTratores);
		
		textField_11 = new JTextField();
		textField_11.setBounds(new Rectangle(15, 279, 91, 24));
		textField_11.setBounds(161, 390, 91, 24);
		add(textField_11);
		
		JLabel lblImplementos = new JLabel();
		lblImplementos.setText("Implementos:");
		lblImplementos.setBounds(new Rectangle(15, 195, 88, 17));
		lblImplementos.setBounds(161, 371, 153, 17);
		add(lblImplementos);
		
		JButton button = new JButton();
		button.setText("Cadastrar");
		button.setBounds(new Rectangle(15, 315, 91, 31));
		button.setBounds(356, 344, 91, 31);
		add(button);
		
		JButton button_1 = new JButton();
		button_1.setText("Salvar");
		button_1.setEnabled(false);
		button_1.setBounds(new Rectangle(240, 316, 91, 30));
		button_1.setBounds(494, 344, 91, 30);
		add(button_1);
		
		JList list = new JList();
		list.setBounds(357, 390, 227, 104);
		add(list);
		
		JButton button_2 = new JButton();
		button_2.setText("Editar");
		button_2.setBounds(new Rectangle(345, 390, 76, 31));
		button_2.setBounds(356, 506, 76, 31);
		add(button_2);
		
		JButton button_3 = new JButton();
		button_3.setText("Apagar");
		button_3.setBounds(new Rectangle(345, 435, 76, 31));
		button_3.setBounds(509, 506, 76, 31);
		add(button_3);
		
		JLabel label = new JLabel("Trator/Implemento:");
		label.setBounds(11, 11, 138, 14);
		add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(11, 25, 210, 25);
		add(comboBox);

	}
}
