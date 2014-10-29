package br.ifce.crato.view;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import br.ifce.crato.actions.PropriedadeAction;
import br.ifce.crato.beans.Propriedade;

public class TelaPropriedade extends JPanel {
	private static final long serialVersionUID = -5947511963920191762L;
	private JTextField tfPropriedadeData;
	private JTextField tfPropriedadeValor;
	private JTextField tfPropriedadeTamanho;
	private JTextField tfPropriedadeSolo;
	private JTextField tfPropriedadeRelevo;
	private JTextField tfPropriedadeDeclividade;
	private JTextField tfPropriedadeFertilidade;
	private JTextField tfPropriedadeNome;
	private JList<Propriedade> jlPropriedades;
	private JComboBox<String> cbPropriedadePercurso;
	private JButton jbPropriedadeSalvar;
	private JButton jbPropriedadeEditar;
	private JButton jbPropriedadeCadastrar;
	private JButton jbPropriedadeApagar;
	private JPanel jpPropriedadeGrafico;
	
	private Propriedade antigo;
	private PropriedadeAction propriedadeAction;
	
	private TelaInicial telaInicial;
	
	public TelaPropriedade(TelaInicial telaInicial) {
		this();
		this.telaInicial = telaInicial; 
	}	

	public TelaPropriedade() {
		setLayout(null);
		
		antigo = null;
		propriedadeAction = new PropriedadeAction();
		
		JLabel label = new JLabel("Pre\u00E7os nominais da cultura:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(24, 45, 157, 14);
		add(label);
		
		JLabel label_1 = new JLabel("Data:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(102, 70, 79, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("Valor (em reais):");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(71, 101, 110, 14);
		add(label_2);
		
		tfPropriedadeData = new JTextField();
		tfPropriedadeData.setColumns(10);
		tfPropriedadeData.setBounds(191, 64, 78, 25);
		add(tfPropriedadeData);
		
		tfPropriedadeValor = new JTextField();
		tfPropriedadeValor.setColumns(10);
		tfPropriedadeValor.setBounds(191, 96, 78, 25);
		add(tfPropriedadeValor);
		
		JLabel label_3 = new JLabel("Tamanho da propriedade:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(24, 157, 157, 14);
		add(label_3);
		
		tfPropriedadeTamanho = new JTextField();
		tfPropriedadeTamanho.setColumns(10);
		tfPropriedadeTamanho.setBounds(191, 154, 78, 25);
		add(tfPropriedadeTamanho);
		
		JLabel label_4 = new JLabel("(hectares)");
		label_4.setBounds(281, 163, 73, 14);
		add(label_4);
		
		JLabel label_5 = new JLabel("Tipo de percurso e manobra:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(10, 191, 171, 14);
		add(label_5);
		
		JLabel label_6 = new JLabel("(Varia\u00E7\u00E3o de 1 a 4)");
		label_6.setBounds(281, 191, 136, 14);
		add(label_6);
		
		cbPropriedadePercurso = new JComboBox<String>();
		cbPropriedadePercurso.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4"}));
		cbPropriedadePercurso.setBounds(191, 188, 78, 25);
		add(cbPropriedadePercurso);
		
		JLabel label_7 = new JLabel("Caracter\u00EDsticas da \u00E1rea:");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(24, 225, 157, 14);
		add(label_7);
		
		tfPropriedadeSolo = new JTextField();
		tfPropriedadeSolo.setColumns(10);
		tfPropriedadeSolo.setBounds(191, 220, 78, 25);
		add(tfPropriedadeSolo);
		
		tfPropriedadeRelevo = new JTextField();
		tfPropriedadeRelevo.setColumns(10);
		tfPropriedadeRelevo.setBounds(191, 250, 78, 25);
		add(tfPropriedadeRelevo);
		
		tfPropriedadeDeclividade = new JTextField();
		tfPropriedadeDeclividade.setColumns(10);
		tfPropriedadeDeclividade.setBounds(191, 280, 78, 25);
		add(tfPropriedadeDeclividade);
		
		tfPropriedadeFertilidade = new JTextField();
		tfPropriedadeFertilidade.setColumns(10);
		tfPropriedadeFertilidade.setBounds(191, 310, 78, 25);
		add(tfPropriedadeFertilidade);
		
		JLabel label_8 = new JLabel(new ImageIcon("figuras"+File.separator+"help_icone.png"));
		label_8.setBounds(280, 222, 20, 20);
		add(label_8);
		
		JLabel label_8_1 = new JLabel("<html><font color='blue'>(<u>Tipo do solo</u>)</font></html>");
		label_8_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_8_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
			    File pdf = new File("docs"+File.separator+"TiposDeSolo.pdf");  
			    try {  
			      Desktop.getDesktop().open(pdf);  
			    } catch(Exception ex) {  
			      ex.printStackTrace();  
			      JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo: " + ex);  
			    }  
			}
		});
		label_8_1.setBounds(301, 222, 122, 16);
		add(label_8_1);
		
		JLabel label_9 = new JLabel("(Relevo)");
		label_9.setBounds(281, 261, 102, 14);
		add(label_9);
		
		JLabel label_10 = new JLabel("(Declividade)");
		label_10.setBounds(281, 291, 102, 14);
		add(label_10);
		
		JLabel label_11 = new JLabel("(Fertilidade)");
		label_11.setBounds(281, 321, 102, 14);
		add(label_11);
		
		JLabel label_12 = new JLabel("Hist\u00F3rico e Registros da \u00E1rea:");
		label_12.setBounds(24, 346, 171, 14);
		add(label_12);
		
		JLabel label_13 = new JLabel();
		label_13.setText("Nome da propriedade:");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(new Rectangle(15, 251, 136, 16));
		label_13.setBounds(45, 16, 136, 16);
		add(label_13);
		
		tfPropriedadeNome = new JTextField();
		tfPropriedadeNome.setText((String) null);
		tfPropriedadeNome.setBounds(new Rectangle(15, 270, 195, 25));
		tfPropriedadeNome.setBounds(191, 11, 401, 25);
		add(tfPropriedadeNome);
		
		jbPropriedadeCadastrar = new JButton();
		jbPropriedadeCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Propriedade p = recuperarFormulario();
				propriedadeAction.inserir(p);
				atualizarLista();
				limparCampos();
				jbPropriedadeSalvar.setEnabled(false);
				atualizaGrafico();
				telaInicial.jpAnaliseOperacional.atualizarPropriedade();
			}
		});

		jbPropriedadeCadastrar.setText("Cadastrar");
		jbPropriedadeCadastrar.setBounds(new Rectangle(15, 315, 91, 25));
		jbPropriedadeCadastrar.setBounds(24, 496, 91, 31);
		add(jbPropriedadeCadastrar);
		
		jpPropriedadeGrafico = new JPanel();
		jpPropriedadeGrafico.setLayout(new FlowLayout());
		jpPropriedadeGrafico.setBounds(281, 45, 310, 110);
		add(jpPropriedadeGrafico);
		atualizaGrafico();

		
		jbPropriedadeApagar = new JButton();
		jbPropriedadeApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jlPropriedades.getSelectedIndex() != -1){
					Propriedade p = jlPropriedades.getSelectedValue();
					int opcao = JOptionPane.showConfirmDialog(null, "Confirma exclusão?");
					if(opcao == JOptionPane.YES_OPTION){
						propriedadeAction.deletar(p);
						atualizarLista();
						limparCampos();
						jbPropriedadeSalvar.setEnabled(false);
						atualizaGrafico();
						telaInicial.jpAnaliseOperacional.atualizarPropriedade();
					}
				}
			}
		});
		jbPropriedadeApagar.setText("Apagar");
		jbPropriedadeApagar.setBounds(new Rectangle(15, 315, 91, 25));
		jbPropriedadeApagar.setBounds(501, 496, 91, 31);
		add(jbPropriedadeApagar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 372, 567, 112);
		add(scrollPane);
		
		jlPropriedades = new JList<Propriedade>();
		atualizarLista();
		scrollPane.setViewportView(jlPropriedades);
		
		jbPropriedadeSalvar = new JButton();
		jbPropriedadeSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Propriedade novo = recuperarFormulario();
				propriedadeAction.alterar(antigo, novo);
				limparCampos();
				jbPropriedadeSalvar.setEnabled(false);
				atualizarLista();
				atualizaGrafico();
				telaInicial.jpAnaliseOperacional.atualizarPropriedade();
			}
		});
		jbPropriedadeSalvar.setEnabled(false);
		jbPropriedadeSalvar.setText("Salvar");
		jbPropriedadeSalvar.setBounds(new Rectangle(15, 315, 91, 25));
		jbPropriedadeSalvar.setBounds(127, 497, 91, 31);
		add(jbPropriedadeSalvar);
		
		jbPropriedadeEditar = new JButton();
		jbPropriedadeEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jlPropriedades.getSelectedIndex() != -1){
					Propriedade p = jlPropriedades.getSelectedValue();
					alterarFormulario(p);
					antigo = p;
					jbPropriedadeSalvar.setEnabled(true);
					atualizaGrafico();
				}
			}

		});
		jbPropriedadeEditar.setText("Editar");
		jbPropriedadeEditar.setBounds(new Rectangle(15, 315, 91, 25));
		jbPropriedadeEditar.setBounds(398, 497, 91, 31);
		add(jbPropriedadeEditar);

	}

	public void atualizarLista() {
		jlPropriedades.setListData(propriedadeAction.pesquisar());
	}
	
	public void limparCampos(){
        tfPropriedadeData.setText("");
		tfPropriedadeNome.setText("");
        tfPropriedadeValor.setText("");
        cbPropriedadePercurso.setSelectedIndex(0);
        tfPropriedadeSolo.setText("");
		tfPropriedadeRelevo.setText("");
		tfPropriedadeFertilidade.setText("");
		tfPropriedadeTamanho.setText("");
		tfPropriedadeDeclividade.setText("");
	}
	
	public Propriedade recuperarFormulario() {
		java.sql.Date data = null;
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        java.util.Date parsed = format.parse(tfPropriedadeData.getText());
	        data  = new java.sql.Date(parsed.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
		
        String nome = tfPropriedadeNome.getText();
        double valor = Double.valueOf(tfPropriedadeValor.getText());
        int tipo = -1;
        if(cbPropriedadePercurso.getSelectedIndex() != -1)
        	tipo= cbPropriedadePercurso.getSelectedIndex();
        String solo = tfPropriedadeSolo.getText();
		String relevo = tfPropriedadeRelevo.getText();
		String fertilidade = tfPropriedadeFertilidade.getText();
		String tamanho = tfPropriedadeTamanho.getText();
		String declividade = tfPropriedadeDeclividade.getText();

		Propriedade p = new Propriedade(nome,data,valor,tipo,solo,relevo,fertilidade, tamanho, declividade);
		return p;
	}

	public void alterarFormulario(Propriedade p) {
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String sdata = format.format(p.getData());  
			tfPropriedadeData.setText(sdata);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		tfPropriedadeNome.setText(p.getNome());
		tfPropriedadeValor.setText(String.valueOf(p.getValor()));
		cbPropriedadePercurso.setSelectedIndex(p.getTipo());
		tfPropriedadeSolo.setText(p.getSolo());
		tfPropriedadeRelevo.setText(p.getRelevo());
		tfPropriedadeFertilidade.setText(p.getFertilidade());
		tfPropriedadeTamanho.setText(p.getTamanho());
		tfPropriedadeDeclividade.setText(p.getDeclividade());

	}
	
	public void atualizaGrafico(){
		jpPropriedadeGrafico.removeAll();
		// cria o conjunto de dados
		DefaultCategoryDataset ds = new DefaultCategoryDataset();
				
		Vector<Propriedade> lista = propriedadeAction.pesquisar();
		for (Propriedade p : lista) {
			if(p != null){
				String sdata = "";
				try{
					SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
					sdata = format.format(p.getData());  
					ds.addValue(p.getValor(), "", sdata);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		// cria o gráfico
		JFreeChart grafico = ChartFactory.createLineChart(null, null,
				null, ds, PlotOrientation.VERTICAL, false, true, false);
		jpPropriedadeGrafico.add(new ChartPanel(grafico, 310, 100, 400, 200, 400, 200, false, false, false, false, true, false));
		jpPropriedadeGrafico.updateUI();

	}
}
