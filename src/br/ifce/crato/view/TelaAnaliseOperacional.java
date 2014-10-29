package br.ifce.crato.view;

import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;

import br.ifce.crato.actions.OperacaoAction;
import br.ifce.crato.actions.PropriedadeAction;
import br.ifce.crato.beans.Operacao;
import br.ifce.crato.beans.Propriedade;

public class TelaAnaliseOperacional extends JPanel {
	private static final long serialVersionUID = -498633220199200280L;
	private JTextField tfOperacaoNome;
	private JTextField tfOperacaoInicio;
	private JTextField tfOperacaoFim;
	private JButton jbOperacaoCadastrar;
	private JButton jbOperacaoSalvar;
	private JButton jbOperacaoEditar;
	private JButton jbOperacaoApagar;
	private JButton jbOperacaoLimpar;
	private JPanel jpGrafico;
	private JComboBox<Propriedade> jcbPropriedade;
	
	private JList<Operacao> jlOperacoes;
	private OperacaoAction operacaoAction;
	private Operacao antigo;
	private JLabel lblTam;
	private JTextField jtfTamanho;
	private PropriedadeAction propriedadeAction;
	private TelaInicial telaInicial;
	
	public TelaAnaliseOperacional(TelaInicial telaInicial) {
		this();
		this.telaInicial = telaInicial; 
	}	
	public TelaAnaliseOperacional() {
		setSize(800,600);
		setLayout(null);
		propriedadeAction = new PropriedadeAction();

		operacaoAction = new OperacaoAction();
		JLabel lblTaxaDeJuros = new JLabel();
		lblTaxaDeJuros.setText("Opera\u00E7\u00E3o Agr\u00EDcola:");
		lblTaxaDeJuros.setBounds(new Rectangle(16, 15, 45, 16));
		lblTaxaDeJuros.setBounds(11, 62, 131, 16);
		add(lblTaxaDeJuros);
		
		tfOperacaoNome = new JTextField();
		tfOperacaoNome.setBounds(new Rectangle(15, 35, 406, 25));
		tfOperacaoNome.setBounds(122, 58, 295, 25);
		add(tfOperacaoNome);
		
		JLabel lblIncio = new JLabel();
		lblIncio.setText("Per\u00EDdo de In\u00EDcio:");
		lblIncio.setBounds(new Rectangle(15, 75, 106, 16));
		lblIncio.setBounds(11, 94, 106, 16);
		add(lblIncio);
		
		tfOperacaoInicio = new JTextField();
		tfOperacaoInicio.setBounds(new Rectangle(15, 97, 91, 24));
		tfOperacaoInicio.setBounds(11, 116, 91, 24);
		add(tfOperacaoInicio);
		
		JLabel lblDdmm = new JLabel();
		lblDdmm.setText("dd/mm/aaaa");
		lblDdmm.setBounds(new Rectangle(116, 90, 95, 31));
		lblDdmm.setBounds(112, 109, 95, 31);
		add(lblDdmm);
		
		jbOperacaoCadastrar = new JButton();
		jbOperacaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Operacao p = recuperarFormulario();
				operacaoAction.inserir(p);
				atualizarLista();
				limparCampos();
				jbOperacaoSalvar.setEnabled(false);
				atualizaGrafico();
			}
		});
		jbOperacaoCadastrar.setText("Cadastrar");
		jbOperacaoCadastrar.setBounds(new Rectangle(15, 315, 91, 31));
		jbOperacaoCadastrar.setBounds(11, 151, 91, 31);
		add(jbOperacaoCadastrar);
		
		JButton button_2 = new JButton();
		button_2.setText("Pesquisar");
		button_2.setBounds(new Rectangle(120, 315, 106, 31));
		button_2.setBounds(116, 151, 106, 31);
		add(button_2);
		
		jbOperacaoSalvar = new JButton();
		jbOperacaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Operacao novo = recuperarFormulario();
				operacaoAction.alterar(antigo, novo);
				jbOperacaoSalvar.setEnabled(false);
				atualizarLista();
				atualizaGrafico();
				limparCampos();
			}
		});
		jbOperacaoSalvar.setText("Salvar");
		jbOperacaoSalvar.setEnabled(false);
		jbOperacaoSalvar.setBounds(new Rectangle(240, 316, 91, 30));
		jbOperacaoSalvar.setBounds(236, 152, 91, 30);
		add(jbOperacaoSalvar);
		
		jbOperacaoEditar = new JButton();
		jbOperacaoEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jlOperacoes.getSelectedIndex() != -1){
					Operacao p = jlOperacoes.getSelectedValue();
					alterarFormulario(p);
					antigo = p;
					jbOperacaoSalvar.setEnabled(true);
				}
			}
		});
		jbOperacaoEditar.setText("Editar");
		jbOperacaoEditar.setBounds(new Rectangle(345, 390, 76, 31));
		jbOperacaoEditar.setBounds(341, 223, 76, 31);
		add(jbOperacaoEditar);
		
		jbOperacaoApagar = new JButton();
		jbOperacaoApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jlOperacoes.getSelectedIndex() != -1){
					Vector<Operacao> lista = operacaoAction.pesquisar();
					Operacao p = lista.get(jlOperacoes.getSelectedIndex());
					int opcao = JOptionPane.showConfirmDialog(null, "Confirma exclusão?");
					if(opcao == JOptionPane.YES_OPTION){
						operacaoAction.deletar(p);
						atualizarLista();
						limparCampos();
						jbOperacaoSalvar.setEnabled(false);
						atualizaGrafico();
					}
				}
			}
		});
		jbOperacaoApagar.setText("Apagar");
		jbOperacaoApagar.setBounds(new Rectangle(345, 435, 76, 31));
		jbOperacaoApagar.setBounds(341, 268, 76, 31);
		add(jbOperacaoApagar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(15, 360, 316, 106));
		scrollPane.setBounds(11, 193, 316, 106);
		add(scrollPane);
		
		jlOperacoes = new JList<Operacao>();
		scrollPane.setViewportView(jlOperacoes);
		
		jbOperacaoLimpar = new JButton();
		jbOperacaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limparCampos();
			}
		});
		jbOperacaoLimpar.setText("Limpar");
		jbOperacaoLimpar.setBounds(new Rectangle(345, 315, 76, 31));
		jbOperacaoLimpar.setBounds(341, 151, 76, 31);
		add(jbOperacaoLimpar);
		
		JLabel lblFim = new JLabel();
		lblFim.setText("Per\u00EDodo de T\u00E9rmino:");
		lblFim.setBounds(new Rectangle(15, 75, 106, 16));
		lblFim.setBounds(221, 94, 161, 16);
		add(lblFim);
		
		tfOperacaoFim = new JTextField();
		tfOperacaoFim.setBounds(new Rectangle(15, 97, 106, 24));
		tfOperacaoFim.setBounds(221, 116, 91, 24);
		add(tfOperacaoFim);
		
		JLabel lblDdmm_1 = new JLabel();
		lblDdmm_1.setText("dd/mm/aaaa");
		lblDdmm_1.setBounds(new Rectangle(116, 90, 95, 31));
		lblDdmm_1.setBounds(322, 109, 95, 31);
		add(lblDdmm_1);
		
		jpGrafico = new JPanel();
		jpGrafico.setLayout(new FlowLayout());
		jpGrafico.setBounds(11, 310, 406, 208);
		add(jpGrafico);
		
		JLabel lblPropriedade = new JLabel();
		lblPropriedade.setText("Propriedade:");
		lblPropriedade.setBounds(new Rectangle(16, 15, 45, 16));
		lblPropriedade.setBounds(11, 21, 131, 16);
		add(lblPropriedade);
		
		jcbPropriedade = new JComboBox<Propriedade>();
		jcbPropriedade.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				Propriedade p = (Propriedade)jcbPropriedade.getSelectedItem();
				if(p != null)
					jtfTamanho.setText(p.getTamanho());
			}
		});
		jcbPropriedade.setBounds(122, 19, 175, 25);
		add(jcbPropriedade);
		
		lblTam = new JLabel();
		lblTam.setText("Tam:");
		lblTam.setBounds(new Rectangle(16, 15, 45, 16));
		lblTam.setBounds(307, 22, 91, 16);
		add(lblTam);
		
		jtfTamanho = new JTextField();
		jtfTamanho.setEditable(false);
		jtfTamanho.setBounds(341, 19, 76, 25);
		add(jtfTamanho);
		jtfTamanho.setColumns(30);

		atualizaGrafico();
		atualizarLista();
		atualizarPropriedade();

	}
	public void atualizarLista() {
		jlOperacoes.setListData(operacaoAction.pesquisar());
	}

	public void atualizarPropriedade(){
		jcbPropriedade.removeAllItems();
		for (Propriedade aux : propriedadeAction.pesquisar()) 
			jcbPropriedade.addItem(aux);
		Propriedade p = (Propriedade)jcbPropriedade.getSelectedItem();
		if(p != null)
			jtfTamanho.setText(p.getTamanho());

	}
	public void limparCampos(){
        tfOperacaoNome.setText("");
		tfOperacaoInicio.setText("");
        tfOperacaoFim.setText("");
        atualizarPropriedade();
	}
	
	public Operacao recuperarFormulario() {
		java.sql.Date dataInicio = null, dataFim = null;
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        java.util.Date parsed = format.parse(tfOperacaoInicio.getText());
	        dataInicio  = new java.sql.Date(parsed.getTime());

	        parsed = format.parse(tfOperacaoFim.getText());
	        dataFim = new java.sql.Date(parsed.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
        String nome = tfOperacaoNome.getText();
		Operacao o = new Operacao(nome, dataInicio, dataFim, (Propriedade)jcbPropriedade.getSelectedItem());
		return o;
	}

	public void alterarFormulario(Operacao o) {
		try{
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String sdata = format.format(o.getDataInicio());  
			tfOperacaoInicio.setText(sdata);
			sdata = format.format(o.getDataFim()); 
			tfOperacaoFim.setText(sdata);
	        Propriedade p = null;
	        for (int i = 0; i < jcbPropriedade.getItemCount(); i++) {
	        	p = (Propriedade) jcbPropriedade.getItemAt(i);
	        	if(p.getId() == o.getPropriedade().getId())
	        		jcbPropriedade.setSelectedIndex(i);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		tfOperacaoNome.setText(o.getNome());
	}
	
	public void atualizaGrafico(){
        Vector<Operacao> lista = operacaoAction.pesquisar();

        final TaskSeriesCollection collection = new TaskSeriesCollection();
        final TaskSeries s = new TaskSeries("Operações");
        for (Operacao operacao : lista) {
            final Task t = new Task(operacao.getNome(), new SimpleTimePeriod(new Date(operacao.getDataInicio().getTime()), new Date(operacao.getDataFim().getTime())));
            s.add(t);
		}
        collection.add(s);
        final JFreeChart chart = ChartFactory.createGanttChart(
                "",  // chart title
                "",              // domain axis label
                "",              // range axis label
                collection,             // data
                false,                // include legend
                true,                // tooltips
                false                // urls
            );

        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 200));
        jpGrafico.removeAll();
        jpGrafico.add(chartPanel);
        jpGrafico.updateUI();
	}
}
