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

public class TelaCustoFixo extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_7;
	private JTextField textField_3;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public TelaCustoFixo() {
		setSize(800,600);
		setLayout(null);
		
		JLabel lblTaxaDeJuros = new JLabel();
		lblTaxaDeJuros.setText("Taxa de juros aplicado ao capital (J):");
		lblTaxaDeJuros.setBounds(new Rectangle(16, 15, 45, 16));
		lblTaxaDeJuros.setBounds(11, 56, 297, 16);
		add(lblTaxaDeJuros);
		
		textField = new JTextField();
		textField.setBounds(new Rectangle(15, 35, 406, 25));
		textField.setBounds(10, 76, 91, 25);
		add(textField);
		
		JLabel lblEstimativaDoRitmo = new JLabel();
		lblEstimativaDoRitmo.setText("Custo do alojamento e Seguro (AS):");
		lblEstimativaDoRitmo.setBounds(new Rectangle(15, 75, 106, 16));
		lblEstimativaDoRitmo.setBounds(10, 116, 316, 16);
		add(lblEstimativaDoRitmo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(new Rectangle(15, 97, 91, 24));
		textField_1.setBounds(10, 138, 91, 24);
		add(textField_1);
		
		JLabel lblhah = new JLabel();
		lblhah.setText("AS = 0,02 P/t");
		lblhah.setBounds(new Rectangle(116, 90, 95, 31));
		lblhah.setBounds(111, 131, 95, 31);
		add(lblhah);
		
		JLabel lblNmeroDeConjuntos = new JLabel();
		lblNmeroDeConjuntos.setText("Deprecia\u00E7\u00E3o (D):");
		lblNmeroDeConjuntos.setBounds(new Rectangle(15, 135, 91, 16));
		lblNmeroDeConjuntos.setBounds(10, 176, 316, 16);
		add(lblNmeroDeConjuntos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(new Rectangle(15, 157, 91, 24));
		textField_2.setBounds(10, 198, 91, 24);
		add(textField_2);
		
		JLabel lblCapacidadeDeCampo = new JLabel();
		lblCapacidadeDeCampo.setText("Vida \u00FAtil:");
		lblCapacidadeDeCampo.setBounds(new Rectangle(15, 195, 88, 17));
		lblCapacidadeDeCampo.setBounds(10, 236, 316, 17);
		add(lblCapacidadeDeCampo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(new Rectangle(15, 217, 92, 24));
		textField_4.setBounds(10, 258, 92, 24);
		add(textField_4);
		
		JLabel lblCapacidadeDe = new JLabel();
		lblCapacidadeDe.setText("Impostos (I):");
		lblCapacidadeDe.setBounds(new Rectangle(15, 256, 76, 16));
		lblCapacidadeDe.setBounds(10, 297, 229, 16);
		add(lblCapacidadeDe);
		
		textField_7 = new JTextField();
		textField_7.setBounds(new Rectangle(15, 279, 91, 24));
		textField_7.setBounds(10, 320, 91, 24);
		add(textField_7);
		
		JLabel lblTd = new JLabel();
		lblTd.setText("J = {[(P + 0,1P)/2]i}/t");
		lblTd.setBounds(new Rectangle(116, 90, 95, 31));
		lblTd.setBounds(111, 76, 305, 31);
		add(lblTd);
		
		JLabel lblNcNoct = new JLabel();
		lblNcNoct.setText("D = P - S/V");
		lblNcNoct.setBounds(new Rectangle(116, 90, 95, 31));
		lblNcNoct.setBounds(111, 191, 95, 31);
		add(lblNcNoct);
		
		JLabel lblCcthah = new JLabel();
		lblCcthah.setText("(horas)");
		lblCcthah.setBounds(new Rectangle(116, 90, 95, 31));
		lblCcthah.setBounds(111, 251, 305, 31);
		add(lblCcthah);
		
		JLabel lblCcehah = new JLabel();
		lblCcehah.setText("(%)");
		lblCcehah.setBounds(new Rectangle(116, 90, 95, 31));
		lblCcehah.setBounds(111, 320, 305, 31);
		add(lblCcehah);
		
		JLabel lblTempoDeMquina = new JLabel();
		lblTempoDeMquina.setText("Custo Fixo Total (CFTa):");
		lblTempoDeMquina.setBounds(new Rectangle(15, 256, 76, 16));
		lblTempoDeMquina.setBounds(11, 355, 315, 16);
		add(lblTempoDeMquina);
		
		textField_3 = new JTextField();
		textField_3.setBounds(new Rectangle(15, 279, 91, 24));
		textField_3.setBounds(11, 378, 91, 24);
		add(textField_3);
		
		JLabel lblTmTp = new JLabel();
		lblTmTp.setText("CFa = VI x {[(1-Vf)/Vu] + [((1+Vf)/2)xi] + Ast}");
		lblTmTp.setBounds(new Rectangle(116, 90, 95, 31));
		lblTmTp.setBounds(112, 378, 305, 31);
		add(lblTmTp);
		
		JLabel lblCapacidadeDeCampo_1 = new JLabel();
		lblCapacidadeDeCampo_1.setText("Custo Fixo Total (CFTb):");
		lblCapacidadeDeCampo_1.setBounds(new Rectangle(15, 256, 76, 16));
		lblCapacidadeDeCampo_1.setBounds(11, 413, 229, 16);
		add(lblCapacidadeDeCampo_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(new Rectangle(15, 279, 91, 24));
		textField_5.setBounds(11, 436, 91, 24);
		add(textField_5);
		
		JButton button = new JButton();
		button.setText("Cadastrar");
		button.setBounds(new Rectangle(15, 315, 91, 31));
		button.setBounds(362, 56, 91, 31);
		add(button);
		
		JButton button_1 = new JButton();
		button_1.setText("Salvar");
		button_1.setEnabled(false);
		button_1.setBounds(new Rectangle(240, 316, 91, 30));
		button_1.setBounds(500, 56, 91, 30);
		add(button_1);
		
		JList list = new JList();
		list.setBounds(363, 102, 227, 104);
		add(list);
		
		JButton button_2 = new JButton();
		button_2.setText("Editar");
		button_2.setBounds(new Rectangle(345, 390, 76, 31));
		button_2.setBounds(362, 218, 76, 31);
		add(button_2);
		
		JButton button_3 = new JButton();
		button_3.setText("Apagar");
		button_3.setBounds(new Rectangle(345, 435, 76, 31));
		button_3.setBounds(515, 218, 76, 31);
		add(button_3);
		
		JLabel lblTratorimplemento = new JLabel("Trator/Implemento:");
		lblTratorimplemento.setBounds(11, 11, 138, 14);
		add(lblTratorimplemento);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(11, 25, 210, 25);
		add(comboBox);

	}
}
