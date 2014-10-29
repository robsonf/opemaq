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

public class TelaIndicador extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public TelaIndicador() {
		setSize(800,600);
		setLayout(null);
		
		JLabel lblTaxaDeJuros = new JLabel();
		lblTaxaDeJuros.setText("Produtividade (kg/ha) = X kg/ha");
		lblTaxaDeJuros.setBounds(new Rectangle(16, 15, 45, 16));
		lblTaxaDeJuros.setBounds(11, 11, 297, 16);
		add(lblTaxaDeJuros);
		
		textField = new JTextField();
		textField.setBounds(new Rectangle(15, 35, 406, 25));
		textField.setBounds(10, 31, 91, 25);
		add(textField);
		
		JLabel lblEstimativaDoRitmo = new JLabel();
		lblEstimativaDoRitmo.setText("Custo total (R$/ha) =  Fixos + Vari\u00E1veis:");
		lblEstimativaDoRitmo.setBounds(new Rectangle(15, 75, 106, 16));
		lblEstimativaDoRitmo.setBounds(10, 71, 316, 16);
		add(lblEstimativaDoRitmo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(new Rectangle(15, 97, 91, 24));
		textField_1.setBounds(10, 93, 91, 24);
		add(textField_1);
		
		JLabel lblNmeroDeConjuntos = new JLabel();
		lblNmeroDeConjuntos.setText("Custo/hora = Todas as vari\u00E1veis ficas e vari\u00E1veis expressas em horas:");
		lblNmeroDeConjuntos.setBounds(new Rectangle(15, 135, 91, 16));
		lblNmeroDeConjuntos.setBounds(10, 131, 419, 16);
		add(lblNmeroDeConjuntos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(new Rectangle(15, 157, 91, 24));
		textField_2.setBounds(10, 153, 91, 24);
		add(textField_2);
		
		JLabel lblCapacidadeDeCampo = new JLabel();
		lblCapacidadeDeCampo.setText("Receita bruta (R$/ha) = produ\u00E7\u00E3o sc/ha x R$ sc:");
		lblCapacidadeDeCampo.setBounds(new Rectangle(15, 195, 88, 17));
		lblCapacidadeDeCampo.setBounds(10, 191, 316, 17);
		add(lblCapacidadeDeCampo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(new Rectangle(15, 217, 92, 24));
		textField_4.setBounds(10, 213, 92, 24);
		add(textField_4);
		
		JLabel lblCapacidadeDe = new JLabel();
		lblCapacidadeDe.setText("Receita liquida (R$/ha) = Receita bruta \u2013 Custo Total:");
		lblCapacidadeDe.setBounds(new Rectangle(15, 256, 76, 16));
		lblCapacidadeDe.setBounds(10, 252, 335, 16);
		add(lblCapacidadeDe);
		
		textField_7 = new JTextField();
		textField_7.setBounds(new Rectangle(15, 279, 91, 24));
		textField_7.setBounds(10, 275, 91, 24);
		add(textField_7);
		
		JButton button_1 = new JButton();
		button_1.setText("Cadastrar");
		button_1.setBounds(new Rectangle(15, 315, 91, 31));
		button_1.setBounds(11, 310, 91, 31);
		add(button_1);
		
		JButton button_2 = new JButton();
		button_2.setText("Pesquisar");
		button_2.setBounds(new Rectangle(120, 315, 106, 31));
		button_2.setBounds(116, 310, 106, 31);
		add(button_2);
		
		JButton button_3 = new JButton();
		button_3.setText("Salvar");
		button_3.setEnabled(false);
		button_3.setBounds(new Rectangle(240, 316, 91, 30));
		button_3.setBounds(236, 311, 91, 30);
		add(button_3);
		
		JButton button_4 = new JButton();
		button_4.setText("Editar");
		button_4.setBounds(new Rectangle(345, 390, 76, 31));
		button_4.setBounds(341, 385, 76, 31);
		add(button_4);
		
		JButton btnApagar = new JButton();
		btnApagar.setText("Apagar");
		btnApagar.setBounds(new Rectangle(345, 435, 76, 31));
		btnApagar.setBounds(341, 430, 76, 31);
		add(btnApagar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(15, 360, 316, 106));
		scrollPane.setBounds(11, 355, 316, 106);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton button_6 = new JButton();
		button_6.setText("Limpar");
		button_6.setBounds(new Rectangle(345, 315, 76, 31));
		button_6.setBounds(341, 310, 76, 31);
		add(button_6);

	}
}
