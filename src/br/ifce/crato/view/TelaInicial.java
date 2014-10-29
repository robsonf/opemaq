package br.ifce.crato.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

public class TelaInicial extends JPanel {
	private static final long serialVersionUID = 219740622729194178L;
	JTabbedPane tpGeral;
	TelaPropriedade jpPropriedade;
	TelaUsuario jpUsuario;
	TelaFuncionarios jpFuncionarios;
	TelaTratoresImplementos jpTratoresImplementos;
	TelaCMecanizados jpCMecanizados;
	TelaAnaliseOperacional jpAnaliseOperacional;
	TelaPlanejamento jpPlanejamento;
	TelaCustoFixo jpCustoFixo;
	TelaCustoVariavel jpCustoVariavel;
	TelaIndicador jpIndicador;
	
	public TelaInicial() {
		setLayout(null);
		
		tpGeral = new JTabbedPane(JTabbedPane.TOP);
		tpGeral.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 12));
		tpGeral.setBounds(0, 0, 800, 600);
		add(tpGeral);
		
//		JPanel jpInicial = new JPanel();
//		tpGeral.addTab("Inicio", null, jpInicial, null);
//		jpInicial.setLayout(null);
		
		JPanel jpConfiguracoes = new JPanel();
		tpGeral.addTab("Configura\u00E7\u00F5es", null, jpConfiguracoes, null);
		jpConfiguracoes.setLayout(null);
		
		JTabbedPane tpConfiguracoes = new JTabbedPane(JTabbedPane.LEFT);
		tpConfiguracoes.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 12));
		tpConfiguracoes.setBounds(0, 0, 795, 572);
		jpConfiguracoes.add(tpConfiguracoes);
		
		jpPropriedade = new TelaPropriedade(this);
		tpConfiguracoes.addTab("Propriedade", null, jpPropriedade, null);
		
		jpUsuario = new TelaUsuario();
		tpConfiguracoes.addTab("Usu\u00E1rio", null, jpUsuario, null);
		
		jpFuncionarios = new TelaFuncionarios(this);
		tpConfiguracoes.addTab("Funcion\u00E1rios", null, jpFuncionarios, null);
		
		jpTratoresImplementos = new TelaTratoresImplementos(this);
		tpConfiguracoes.addTab("Tratores/Implementos", null, jpTratoresImplementos, null);
		
		jpCMecanizados = new TelaCMecanizados();
		tpConfiguracoes.addTab("Conj. Mecanizados", null, jpCMecanizados, null);
		
		JPanel jpDesempenho = new JPanel();
		tpGeral.addTab("Desempenho", null, jpDesempenho, null);
		jpDesempenho.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 12));
		tabbedPane.setBounds(0, 0, 800, 570);
		jpDesempenho.add(tabbedPane);
		
		jpAnaliseOperacional = new TelaAnaliseOperacional();
		tabbedPane.addTab("An\u00E1lise Operacional", null, jpAnaliseOperacional, null);
		jpAnaliseOperacional.setLayout(null);
		
		jpPlanejamento = new TelaPlanejamento();
		tabbedPane.addTab("Planejamento", null, jpPlanejamento, null);
		jpPlanejamento.setLayout(null);
		
		jpCustoFixo = new TelaCustoFixo();
		tabbedPane.addTab("Desempenho - Fixo", null, jpCustoFixo, null);
		jpCustoFixo.setLayout(null);
		
		jpCustoVariavel = new TelaCustoVariavel();
		tabbedPane.addTab("Desempenho - Vari\u00E1vel", null, jpCustoVariavel, null);
		
		jpIndicador = new TelaIndicador();
		tpGeral.addTab("Indicador Econ\u00F4mico", null, jpIndicador, null);
		jpIndicador.setLayout(null);
		
		JPanel jpAjuda = new JPanel();
		tpGeral.addTab("Ajuda", null, jpAjuda, null);
		jpAjuda.setLayout(null);
		
		JTextPane txtpnComoInserir = new JTextPane();
		txtpnComoInserir.setBackground(Color.LIGHT_GRAY);
		txtpnComoInserir.setText("1. Como Inserir os Dados\r\n\r\n2. Perguntas mais Frequentes\r\n\r\n3. Capacidade Operacional de M\u00E1quinas Agr\u00EDcolas\r\n\r\n4. Custo Operacional de M\u00E1quinas Agr\u00EDcolas\r\n\r\n5. An\u00E1lise e Desempenho Operacional\r\n\r\n6. Documentos Diversos\r\n\r\n7. Contato");
		txtpnComoInserir.setBounds(20, 33, 404, 300);
		jpAjuda.add(txtpnComoInserir);

	}

	public JTabbedPane getTpGeral() {
		return tpGeral;
	}

	public void setTpGeral(JTabbedPane tpGeral) {
		this.tpGeral = tpGeral;
	}

	public TelaPropriedade getJpPropriedade() {
		return jpPropriedade;
	}

	public void setJpPropriedade(TelaPropriedade jpPropriedade) {
		this.jpPropriedade = jpPropriedade;
	}

	public TelaUsuario getJpUsuario() {
		return jpUsuario;
	}

	public void setJpUsuario(TelaUsuario jpUsuario) {
		this.jpUsuario = jpUsuario;
	}

	public TelaFuncionarios getJpFuncionarios() {
		return jpFuncionarios;
	}

	public void setJpFuncionarios(TelaFuncionarios jpFuncionarios) {
		this.jpFuncionarios = jpFuncionarios;
	}

	public TelaTratoresImplementos getJpTratoresImplementos() {
		return jpTratoresImplementos;
	}

	public void setJpTratoresImplementos(
			TelaTratoresImplementos jpTratoresImplementos) {
		this.jpTratoresImplementos = jpTratoresImplementos;
	}

	public TelaCMecanizados getJpCMecanizados() {
		return jpCMecanizados;
	}

	public void setJpCMecanizados(TelaCMecanizados jpCMecanizados) {
		this.jpCMecanizados = jpCMecanizados;
	}

	public TelaAnaliseOperacional getJpAnaliseOperacional() {
		return jpAnaliseOperacional;
	}

	public void setJpAnaliseOperacional(TelaAnaliseOperacional jpAnaliseOperacional) {
		this.jpAnaliseOperacional = jpAnaliseOperacional;
	}

	public TelaPlanejamento getJpPlanejamento() {
		return jpPlanejamento;
	}

	public void setJpPlanejamento(TelaPlanejamento jpPlanejamento) {
		this.jpPlanejamento = jpPlanejamento;
	}

	public TelaCustoFixo getJpCustoFixo() {
		return jpCustoFixo;
	}

	public void setJpCustoFixo(TelaCustoFixo jpCustoFixo) {
		this.jpCustoFixo = jpCustoFixo;
	}

	public TelaCustoVariavel getJpCustoVariavel() {
		return jpCustoVariavel;
	}

	public void setJpCustoVariavel(TelaCustoVariavel jpCustoVariavel) {
		this.jpCustoVariavel = jpCustoVariavel;
	}

	public TelaIndicador getJpIndicador() {
		return jpIndicador;
	}

	public void setJpIndicador(TelaIndicador jpIndicador) {
		this.jpIndicador = jpIndicador;
	}
	
	
}
