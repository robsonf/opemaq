package br.ifce.crato.view;

import java.awt.Rectangle;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import br.ifce.crato.actions.OperacaoAction;
import br.ifce.crato.beans.CMecanizado;
import br.ifce.crato.beans.Operacao;
import br.ifce.crato.beans.Planejamento;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPlanejamento extends JPanel {
	private static final long serialVersionUID = -79826681267536660L;
	private JTextField td;
	private JTextField ro;
	private JTextField cct;
	private JTextField cce;
	private JTextField tm;
	private JTextField cco;
	private JTextField nc;
	private JTextField ec;
	private JTextField nt;
	private JTextField ndf;
	private JTextField nimp;
	private JTextField jt;
	private JTextField eg;
	private JTextField at;
	private JTextField td2;
	private JTextField lcct;
	private JTextField vcct;
	private JTextField nopcct;
	private JTextField lcce;
	private JTextField vcce;
	private JTextField nopcce;
	private JTextField eccce;
	private JTextField tp;
	private JTextField ti;
	private JTextField tpr;
	private JTextField atcco;
	private JTextField tm2;
	private JTextField ro2;
	private JTextField cco2;
	private JTextField cce2;
	private JTextField cct2;
	private JComboBox<Operacao> cbOperacao;
	JList<CMecanizado> jlCMecanizados;
	
	public TelaPlanejamento() {
		setSize(800,600);
		setLayout(null);
		
		JLabel lblTaxaDeJuros = new JLabel();
		lblTaxaDeJuros.setText("Estimativa do Tempo Dispon\u00EDvel - TD (horas):");
		lblTaxaDeJuros.setBounds(new Rectangle(16, 15, 45, 16));
		lblTaxaDeJuros.setBounds(9, 53, 297, 16);
		add(lblTaxaDeJuros);
		
		td = new JTextField();
		td.setEnabled(false);
		td.setEditable(false);
		td.setBounds(new Rectangle(15, 35, 406, 25));
		td.setBounds(8, 73, 60, 25);
		add(td);
		
		JLabel lblEstimativaDoRitmo = new JLabel();
		lblEstimativaDoRitmo.setText("Estimativa do Ritmo Operacional - RO (ha/h):");
		lblEstimativaDoRitmo.setBounds(new Rectangle(15, 75, 106, 16));
		lblEstimativaDoRitmo.setBounds(8, 124, 316, 16);
		add(lblEstimativaDoRitmo);
		
		ro = new JTextField();
		ro.setEnabled(false);
		ro.setEditable(false);
		ro.setBounds(new Rectangle(15, 97, 91, 24));
		ro.setBounds(8, 146, 91, 24);
		add(ro);
		
		JLabel lblhah = new JLabel();
		lblhah.setText("RO      =     (At     /    TD)");
		lblhah.setBounds(new Rectangle(116, 90, 95, 31));
		lblhah.setBounds(79, 167, 157, 31);
		add(lblhah);
		
		JLabel lblCapacidadeDeCampo = new JLabel();
		lblCapacidadeDeCampo.setText("Capacidade de Campo Te\u00F3rica - CcT (ha/h):");
		lblCapacidadeDeCampo.setBounds(new Rectangle(15, 195, 88, 17));
		lblCapacidadeDeCampo.setBounds(7, 193, 316, 17);
		add(lblCapacidadeDeCampo);
		
		cct = new JTextField();
		cct.setEnabled(false);
		cct.setEditable(false);
		cct.setBounds(new Rectangle(15, 217, 92, 24));
		cct.setBounds(7, 215, 92, 24);
		add(cct);
		
		JLabel lblCapacidadeDe = new JLabel();
		lblCapacidadeDe.setText("Capacidade de Campo Efetiva - CcE (ha/h):");
		lblCapacidadeDe.setBounds(new Rectangle(15, 256, 76, 16));
		lblCapacidadeDe.setBounds(7, 264, 317, 16);
		add(lblCapacidadeDe);
		
		cce = new JTextField();
		cce.setEnabled(false);
		cce.setEditable(false);
		cce.setBounds(new Rectangle(15, 279, 91, 24));
		cce.setBounds(7, 287, 91, 24);
		add(cce);
		
		JButton button_1 = new JButton();
		button_1.setText("Cadastrar");
		button_1.setBounds(new Rectangle(15, 315, 91, 31));
		button_1.setBounds(385, 378, 91, 31);
		add(button_1);
		
		JButton button_3 = new JButton();
		button_3.setText("Salvar");
		button_3.setEnabled(false);
		button_3.setBounds(new Rectangle(240, 316, 91, 30));
		button_3.setBounds(523, 378, 91, 30);
		add(button_3);
		
		JButton button_4 = new JButton();
		button_4.setText("Editar");
		button_4.setBounds(new Rectangle(345, 390, 76, 31));
		button_4.setBounds(385, 506, 76, 31);
		add(button_4);
		
		JButton btnApagar = new JButton();
		btnApagar.setText("Apagar");
		btnApagar.setBounds(new Rectangle(345, 435, 76, 31));
		btnApagar.setBounds(538, 506, 76, 31);
		add(btnApagar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(15, 360, 316, 106));
		scrollPane.setBounds(385, 420, 229, 75);
		add(scrollPane);
		
		JList<Planejamento> jlPlanejamentos = new JList<Planejamento> ();
		scrollPane.setViewportView(jlPlanejamentos);
		
		JLabel lblTd = new JLabel();
		lblTd.setText("TD     =     {[Nt    -    (Ndf    +    Nimp)]   x    (Jt    x    Eg)}");
		lblTd.setBounds(new Rectangle(116, 90, 95, 31));
		lblTd.setBounds(50, 92, 323, 31);
		add(lblTd);
		
		JLabel lblCcthah = new JLabel();
		lblCcthah.setText("CcT     =      [L(m)   x   V(km/h)] / 10 x No P");
		lblCcthah.setBounds(new Rectangle(116, 90, 95, 31));
		lblCcthah.setBounds(79, 234, 297, 31);
		add(lblCcthah);
		
		JLabel lblCcehah = new JLabel();
		lblCcehah.setText("CcE    =      {[L(m)   x   V(km/h)]  / 10xNoP}  x  Ec");
		lblCcehah.setBounds(new Rectangle(116, 90, 95, 31));
		lblCcehah.setBounds(79, 309, 305, 31);
		add(lblCcehah);
		
		JLabel lblTempoDeMquina = new JLabel();
		lblTempoDeMquina.setText("Tempo de M\u00E1quina ou Tempo total de campo:");
		lblTempoDeMquina.setBounds(new Rectangle(15, 256, 76, 16));
		lblTempoDeMquina.setBounds(9, 333, 315, 16);
		add(lblTempoDeMquina);
		
		tm = new JTextField();
		tm.setEnabled(false);
		tm.setEditable(false);
		tm.setBounds(new Rectangle(15, 279, 91, 24));
		tm.setBounds(9, 356, 91, 24);
		add(tm);
		
		JLabel lblTmTp = new JLabel();
		lblTmTp.setText("TM      =       TP      +      TI       +    Tpr");
		lblTmTp.setBounds(new Rectangle(116, 90, 95, 31));
		lblTmTp.setBounds(81, 376, 305, 31);
		add(lblTmTp);
		
		JLabel lblCapacidadeDeCampo_1 = new JLabel();
		lblCapacidadeDeCampo_1.setText("Capacidade de Campo Operacional:");
		lblCapacidadeDeCampo_1.setBounds(new Rectangle(15, 256, 76, 16));
		lblCapacidadeDeCampo_1.setBounds(9, 404, 229, 16);
		add(lblCapacidadeDeCampo_1);
		
		cco = new JTextField();
		cco.setEnabled(false);
		cco.setEditable(false);
		cco.setBounds(new Rectangle(15, 279, 91, 24));
		cco.setBounds(9, 427, 91, 24);
		add(cco);
		
		JLabel lblCcoAt = new JLabel();
		lblCcoAt.setText("CcO     =        At      /     TM");
		lblCcoAt.setBounds(new Rectangle(116, 90, 95, 31));
		lblCcoAt.setBounds(77, 446, 305, 31);
		add(lblCcoAt);
		
		JLabel lblNmeroDeConjuntos_1 = new JLabel();
		lblNmeroDeConjuntos_1.setText("N\u00FAmero de Conjuntos:");
		lblNmeroDeConjuntos_1.setBounds(new Rectangle(15, 256, 76, 16));
		lblNmeroDeConjuntos_1.setBounds(385, 53, 229, 16);
		add(lblNmeroDeConjuntos_1);
		
		nc = new JTextField();
		nc.setEnabled(false);
		nc.setEditable(false);
		nc.setBounds(new Rectangle(15, 279, 91, 24));
		nc.setBounds(385, 76, 91, 24);
		add(nc);
		
		JLabel lblNcRo = new JLabel();
		lblNcRo.setText("NC       =      RO      /      CcO");
		lblNcRo.setBounds(new Rectangle(116, 90, 95, 31));
		lblNcRo.setBounds(453, 91, 305, 31);
		add(lblNcRo);
		
		JLabel lblEficinciaDeCampo = new JLabel();
		lblEficinciaDeCampo.setText("Efici\u00EAncia de campo:");
		lblEficinciaDeCampo.setBounds(new Rectangle(15, 256, 76, 16));
		lblEficinciaDeCampo.setBounds(9, 468, 229, 16);
		add(lblEficinciaDeCampo);
		
		ec = new JTextField();
		ec.setEnabled(false);
		ec.setEditable(false);
		ec.setBounds(new Rectangle(15, 279, 91, 24));
		ec.setBounds(9, 491, 91, 24);
		add(ec);
		
		JLabel lblEccce = new JLabel();
		lblEccce.setText("Ec        =      (CcE     /     CcT) x 100 ");
		lblEccce.setBounds(new Rectangle(116, 90, 95, 31));
		lblEccce.setBounds(78, 508, 305, 31);
		add(lblEccce);
		
		JButton jbCadastrarCMecanizado = new JButton();
		jbCadastrarCMecanizado.setText("Cadastrar");
		jbCadastrarCMecanizado.setBounds(new Rectangle(15, 315, 91, 31));
		jbCadastrarCMecanizado.setBounds(385, 195, 91, 31);
		add(jbCadastrarCMecanizado);
		
		JButton jbApagarCMecanizado = new JButton();
		jbApagarCMecanizado.setText("Apagar");
		jbApagarCMecanizado.setBounds(new Rectangle(345, 435, 76, 31));
		jbApagarCMecanizado.setBounds(538, 195, 76, 31);
		add(jbApagarCMecanizado);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(new Rectangle(15, 360, 316, 106));
		scrollPane_1.setBounds(385, 240, 229, 69);
		add(scrollPane_1);
		
		jlCMecanizados = new JList<CMecanizado> ();
		scrollPane_1.setViewportView(jlCMecanizados);
		
		JComboBox<CMecanizado> cbCMecanizado = new JComboBox<CMecanizado>();
		cbCMecanizado.setBounds(385, 159, 229, 25);

		CMecanizadoAction cMecanizadoAction= new CMecanizadoAction();
		Vector<CMecanizado> aux1 = cMecanizadoAction.pesquisar();
		for (CMecanizado cMecanizado: aux1) {
			cbCMecanizado.addItem(cMecanizado);	
		}

		
		add(cbCMecanizado);
		
		JLabel lblConjutosMecanizadosCadastrados = new JLabel("Conjutos Mecanizados Cadastrados:");
		lblConjutosMecanizadosCadastrados.setBounds(385, 134, 297, 14);
		add(lblConjutosMecanizadosCadastrados);
		
		JLabel lblPlanejamentosCadastrados = new JLabel("Planejamentos Cadastrados:");
		lblPlanejamentosCadastrados.setBounds(385, 353, 297, 14);
		add(lblPlanejamentosCadastrados);
		
		nt = new JTextField();
		nt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(!ndf.getText().equals("") && !nimp.getText().equals("") && !jt.getText().equals("") && !eg.getText().equals("")){
					try{
						double dnt = Double.parseDouble(nt.getText());
						double dndf = Double.parseDouble(ndf.getText());
						double dnimp = Double.parseDouble(nimp.getText());
						double djt = Double.parseDouble(jt.getText());
						double deg = Double.parseDouble(eg.getText());
						double dtd = (dnt - (dndf + dnimp )) * (djt * deg);
						td.setText(String.valueOf(dtd));
						td2.setText(String.valueOf(dtd));
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		nt.setBounds(new Rectangle(15, 35, 406, 25));
		nt.setBounds(97, 73, 40, 25);
		add(nt);
		
		ndf = new JTextField();
		ndf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!nt.getText().equals("") && !nimp.getText().equals("") && !jt.getText().equals("") && !eg.getText().equals("")){
					try{
						double dnt = Double.parseDouble(nt.getText());
						double dndf = Double.parseDouble(ndf.getText());
						double dnimp = Double.parseDouble(nimp.getText());
						double djt = Double.parseDouble(jt.getText());
						double deg = Double.parseDouble(eg.getText());
						double dtd = (dnt - (dndf + dnimp )) * (djt * deg);
						td.setText(String.valueOf(dtd));
						td2.setText(String.valueOf(dtd));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		ndf.setBounds(new Rectangle(15, 35, 406, 25));
		ndf.setBounds(147, 73, 40, 25);
		add(ndf);
		
		nimp = new JTextField();
		nimp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!nt.getText().equals("") && !ndf.getText().equals("") && !jt.getText().equals("") && !eg.getText().equals("")){
					try{
						double dnt = Double.parseDouble(nt.getText());
						double dndf = Double.parseDouble(ndf.getText());
						double dnimp = Double.parseDouble(nimp.getText());
						double djt = Double.parseDouble(jt.getText());
						double deg = Double.parseDouble(eg.getText());
						double dtd = (dnt - (dndf + dnimp )) * (djt * deg);
						td.setText(String.valueOf(dtd));
						td2.setText(String.valueOf(dtd));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		nimp.setBounds(new Rectangle(15, 35, 406, 25));
		nimp.setBounds(197, 73, 40, 25);
		add(nimp);
		
		jt = new JTextField();
		jt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!nt.getText().equals("") && !nimp.getText().equals("") && !ndf.getText().equals("") && !eg.getText().equals("")){
					try{
						double dnt = Double.parseDouble(nt.getText());
						double dndf = Double.parseDouble(ndf.getText());
						double dnimp = Double.parseDouble(nimp.getText());
						double djt = Double.parseDouble(jt.getText());
						double deg = Double.parseDouble(eg.getText());
						double dtd = (dnt - (dndf + dnimp )) * (djt * deg);
						td.setText(String.valueOf(dtd));
						td2.setText(String.valueOf(dtd));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		jt.setBounds(new Rectangle(15, 35, 406, 25));
		jt.setBounds(247, 73, 40, 25);
		add(jt);
		
		eg = new JTextField();
		eg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!nt.getText().equals("") && !nimp.getText().equals("") && !jt.getText().equals("") && !ndf.getText().equals("")){
					try{
						double dnt = Double.parseDouble(nt.getText());
						double dndf = Double.parseDouble(ndf.getText());
						double dnimp = Double.parseDouble(nimp.getText());
						double djt = Double.parseDouble(jt.getText());
						double deg = Double.parseDouble(eg.getText());
						double dtd = (dnt - (dndf + dnimp )) * (djt * deg);
						td.setText(String.valueOf(dtd));
						td2.setText(String.valueOf(dtd));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		eg.setBounds(new Rectangle(15, 35, 406, 25));
		eg.setBounds(297, 73, 40, 25);
		add(eg);
		
		JLabel label = new JLabel("  =");
		label.setBounds(74, 80, 46, 14);
		add(label);
		
		JLabel label_1 = new JLabel("  =");
		label_1.setBounds(109, 153, 46, 14);
		add(label_1);
		
		at = new JTextField();
		at.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!td2.getText().equals("")){
					try{
						double dtd2 = Double.parseDouble(td2.getText());
						double dat = Double.parseDouble(at.getText());
						double dro = dat / dtd2;
						ro.setText(String.valueOf(dro));
						ro2.setText(String.valueOf(dro));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		at.setBounds(new Rectangle(15, 35, 406, 25));
		at.setBounds(132, 146, 40, 25);
		add(at);
		
		td2 = new JTextField();
		td2.setEnabled(false);
		td2.setEditable(false);
		td2.setBounds(new Rectangle(15, 35, 406, 25));
		td2.setBounds(182, 146, 40, 25);
		add(td2);
		
		JLabel label_2 = new JLabel("  =");
		label_2.setBounds(109, 221, 46, 14);
		add(label_2);
		
		lcct = new JTextField();
		lcct.setEnabled(false);
		lcct.setEditable(false);
		lcct.setBounds(new Rectangle(15, 35, 406, 25));
		lcct.setBounds(132, 214, 40, 25);
		add(lcct);
		
		vcct = new JTextField();
		vcct.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!lcct.getText().equals("") && !nopcct.getText().equals("")){
					try{
						double dvcct = Double.parseDouble(vcct.getText());
						double dlcct = Double.parseDouble(lcct.getText());
						double dnopcct = Double.parseDouble(nopcct.getText());
						double dcct = (dlcct * dvcct) / (10*dnopcct);
						cct.setText(String.valueOf(dcct));
						cct2.setText(String.valueOf(dcct));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		vcct.setBounds(new Rectangle(15, 35, 406, 25));
		vcct.setBounds(182, 214, 40, 25);
		add(vcct);
		
		nopcct = new JTextField();
		nopcct.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!lcct.getText().equals("") && !vcct.getText().equals("")){
					try{
						double dvcct = Double.parseDouble(vcct.getText());
						double dlcct = Double.parseDouble(lcct.getText());
						double dnopcct = Double.parseDouble(nopcct.getText());
						double dcct = (dlcct * dvcct) / (10*dnopcct);
						cct.setText(String.valueOf(dcct));
						cct2.setText(String.valueOf(dcct));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		nopcct.setBounds(new Rectangle(15, 35, 406, 25));
		nopcct.setBounds(232, 214, 40, 25);
		add(nopcct);
		
		JLabel label_3 = new JLabel("  =");
		label_3.setBounds(108, 294, 46, 14);
		add(label_3);
		
		lcce = new JTextField();
		lcce.setEnabled(false);
		lcce.setEditable(false);
		lcce.setBounds(new Rectangle(15, 35, 406, 25));
		lcce.setBounds(131, 287, 40, 25);
		add(lcce);
		
		vcce = new JTextField();
		vcce.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!lcce.getText().equals("") && !nopcce.getText().equals("") && !eccce.getText().equals("") ){
					try{
						double dvcce = Double.parseDouble(vcce.getText());
						double dlcce = Double.parseDouble(lcce.getText());
						double dnopcce = Double.parseDouble(nopcce.getText());
						double deccce = Double.parseDouble(eccce.getText());
						double dcce = ((dlcce * dvcce) / (10*dnopcce))*deccce;
						cce.setText(String.valueOf(dcce));
						cce2.setText(String.valueOf(dcce));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		vcce.setBounds(new Rectangle(15, 35, 406, 25));
		vcce.setBounds(181, 287, 40, 25);
		add(vcce);
		
		nopcce = new JTextField();
		nopcce.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!lcce.getText().equals("") && !vcce.getText().equals("") && !eccce.getText().equals("") ){
					try{
						double dvcce = Double.parseDouble(vcce.getText());
						double dlcce = Double.parseDouble(lcce.getText());
						double dnopcce = Double.parseDouble(nopcce.getText());
						double deccce = Double.parseDouble(eccce.getText());
						double dcce = ((dlcce * dvcce) / (10*dnopcce))*deccce;
						cce.setText(String.valueOf(dcce));
						cce2.setText(String.valueOf(dcce));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		nopcce.setBounds(new Rectangle(15, 35, 406, 25));
		nopcce.setBounds(231, 287, 40, 25);
		add(nopcce);
		
		eccce = new JTextField();
		eccce.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!lcce.getText().equals("") && !vcce.getText().equals("") && !nopcce.getText().equals("") ){
					try{
						double dvcce = Double.parseDouble(vcce.getText());
						double dlcce = Double.parseDouble(lcce.getText());
						double dnopcce = Double.parseDouble(nopcce.getText());
						double deccce = Double.parseDouble(eccce.getText());
						double dcce = ((dlcce * dvcce) / (10*dnopcce))*deccce;
						cce.setText(String.valueOf(dcce));
						cce2.setText(String.valueOf(dcce));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		eccce.setBounds(new Rectangle(15, 35, 406, 25));
		eccce.setBounds(281, 287, 40, 25);
		add(eccce);
		
		JLabel label_4 = new JLabel("  =");
		label_4.setBounds(109, 362, 46, 14);
		add(label_4);
		
		tp = new JTextField();
		tp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!ti.getText().equals("") && !tpr.getText().equals("") ){
					try{
						double dtp = Double.parseDouble(tp.getText());
						double dti = Double.parseDouble(ti.getText());
						double dtpr = Double.parseDouble(tpr.getText());
						double dtm = dtp + dti + dtpr;
						tm.setText(String.valueOf(dtm));
						tm2.setText(String.valueOf(dtm));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		tp.setBounds(new Rectangle(15, 35, 406, 25));
		tp.setBounds(132, 355, 40, 25);
		add(tp);
		
		ti = new JTextField();
		ti.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!tp.getText().equals("") && !tpr.getText().equals("") ){
					try{
						double dtp = Double.parseDouble(tp.getText());
						double dti = Double.parseDouble(ti.getText());
						double dtpr = Double.parseDouble(tpr.getText());
						double dtm = dtp + dti + dtpr;
						tm.setText(String.valueOf(dtm));
						tm2.setText(String.valueOf(dtm));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		ti.setBounds(new Rectangle(15, 35, 406, 25));
		ti.setBounds(182, 355, 40, 25);
		add(ti);
		
		tpr = new JTextField();
		tpr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!tp.getText().equals("") && !ti.getText().equals("") ){
					try{
						double dtp = Double.parseDouble(tp.getText());
						double dti = Double.parseDouble(ti.getText());
						double dtpr = Double.parseDouble(tpr.getText());
						double dtm = dtp + dti + dtpr;
						tm.setText(String.valueOf(dtm));
						tm2.setText(String.valueOf(dtm));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		tpr.setBounds(new Rectangle(15, 35, 406, 25));
		tpr.setBounds(232, 355, 40, 25);
		add(tpr);
		
		JLabel label_5 = new JLabel("  =");
		label_5.setBounds(110, 433, 46, 14);
		add(label_5);
		
		atcco = new JTextField();
		atcco.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(!tm2.getText().equals("") ){
					try{
						double datcco = Double.parseDouble(atcco.getText());
						double dtm2 = Double.parseDouble(tm2.getText());
						double dcoo = datcco / dtm2;
						cco.setText(String.valueOf(dcoo));
						cco2.setText(String.valueOf(dcoo));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		atcco.setBounds(new Rectangle(15, 35, 406, 25));
		atcco.setBounds(133, 426, 40, 25);
		add(atcco);
		
		tm2 = new JTextField();
		tm2.setEnabled(false);
		tm2.setEditable(false);
		tm2.setBounds(new Rectangle(15, 35, 406, 25));
		tm2.setBounds(183, 426, 40, 25);
		add(tm2);
		
		JLabel label_6 = new JLabel("  =");
		label_6.setBounds(486, 82, 46, 14);
		add(label_6);
		
		ro2 = new JTextField();
		ro2.setEnabled(false);
		ro2.setEditable(false);
		ro2.setBounds(new Rectangle(15, 35, 406, 25));
		ro2.setBounds(509, 75, 40, 25);
		add(ro2);
		
		cco2 = new JTextField();
		cco2.setEnabled(false);
		cco2.setEditable(false);
		cco2.setBounds(new Rectangle(15, 35, 406, 25));
		cco2.setBounds(559, 75, 40, 25);
		add(cco2);
		
		JLabel label_7 = new JLabel("  =");
		label_7.setBounds(109, 497, 46, 14);
		add(label_7);
		
		cce2 = new JTextField();
		cce2.setEnabled(false);
		cce2.setEditable(false);
		cce2.setBounds(new Rectangle(15, 35, 406, 25));
		cce2.setBounds(132, 490, 40, 25);
		add(cce2);
		
		cct2 = new JTextField();
		cct2.setEnabled(false);
		cct2.setEditable(false);
		cct2.setBounds(new Rectangle(15, 35, 406, 25));
		cct2.setBounds(182, 490, 40, 25);
		add(cct2);
		
		cbOperacao = new JComboBox<Operacao> ();
		cbOperacao.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				lcct.setText(((Operacao) cbOperacao.getSelectedItem()).getPropriedade().getTamanho());
				lcce.setText(lcct.getText());
				if(!lcct.getText().equals("") && !vcct.getText().equals("") && !nopcct.getText().equals("") ){
					try{
						double dvcct = Double.parseDouble(vcct.getText());
						double dlcct = Double.parseDouble(lcct.getText());
						double dnopcct = Double.parseDouble(nopcct.getText());
						double dcct = (dlcct * dvcct) / (10*dnopcct);
						cct.setText(String.valueOf(dcct));
						cct2.setText(String.valueOf(dcct));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
				
				if(!lcce.getText().equals("") && !vcce.getText().equals("") && !nopcce.getText().equals("") &&!eccce.getText().equals("") ){
					try{
						double dvcce = Double.parseDouble(vcce.getText());
						double dlcce = Double.parseDouble(lcce.getText());
						double dnopcce = Double.parseDouble(nopcce.getText());
						double deccce = Double.parseDouble(eccce.getText());
						double dcce = ((dlcce * dvcce) / (10*dnopcce))*deccce;
						cce.setText(String.valueOf(dcce));
						cce2.setText(String.valueOf(dcce));
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}

			}
		});
		OperacaoAction operacaoAction= new OperacaoAction();
		Vector<Operacao> aux = operacaoAction.pesquisar();
		for (Operacao operacao : aux) {
			cbOperacao.addItem(operacao);	
		}

		cbOperacao.setBounds(97, 12, 240, 25);
		add(cbOperacao);
		
		JLabel lblOperao = new JLabel();
		lblOperao.setText("Opera\u00E7\u00E3o:");
		lblOperao.setBounds(new Rectangle(16, 15, 45, 16));
		lblOperao.setBounds(9, 12, 297, 16);
		add(lblOperao);
		
		JButton jbCalcularEc = new JButton("Calcular");
		jbCalcularEc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!cce2.getText().equals("") && !cct2.getText().equals("")){
					try {
						double dcce = Double.parseDouble(cce2.getText());
						double dcct = Double.parseDouble(cct2.getText());
						double dec = dcce / dcct;
						ec.setText(String.valueOf(dec));
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null,"Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		jbCalcularEc.setBounds(235, 488, 89, 27);
		add(jbCalcularEc);
		
		JButton jbCalcularNc = new JButton("Calcular");
		jbCalcularNc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!ro2.getText().equals("") && !cco2.getText().equals("")){
					try {
						double dro = Double.parseDouble(ro2.getText());
						double dcco = Double.parseDouble(cco2.getText());
						double dnc = dro / dcco;
						nc.setText(String.valueOf(dnc));
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null,"Favor verifique se os campos possuem valores númericos.\nNúmeros decimais devem ser separados por '.' (ponto).");
					}
				}
			}
		});
		jbCalcularNc.setBounds(510, 44, 89, 25);
		add(jbCalcularNc);
	}
}
