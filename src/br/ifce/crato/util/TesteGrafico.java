package br.ifce.crato.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import br.ifce.crato.actions.PropriedadeAction;
import br.ifce.crato.beans.Propriedade;

public class TesteGrafico {
	public static void main(String[] args) throws IOException {
		teste2();
	}

	public static void teste1(){
		// cria o conjunto de dados
		DefaultCategoryDataset ds = new DefaultCategoryDataset();
		ds.addValue(40.5, "maximo", "dia 1");
		ds.addValue(38.2, "maximo", "dia 2");
		ds.addValue(37.3, "maximo", "dia 3");
		ds.addValue(31.5, "maximo", "dia 4");
		ds.addValue(35.7, "maximo", "dia 5");
		ds.addValue(42.5, "maximo", "dia 6");

		// cria o gráfico
		JFreeChart grafico = ChartFactory.createLineChart(null, null,
				null, ds, PlotOrientation.VERTICAL, false, true, false);
		
		JFrame frame = new JFrame("Minha janela");
		frame.add(new ChartPanel(grafico, 200, 100, 800, 600, 800, 600, false, false, false, false, true, false));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}
	public static void teste2(){
		// cria o conjunto de dados
		DefaultCategoryDataset ds = new DefaultCategoryDataset();
				
		PropriedadeAction propriedadeAction = new PropriedadeAction();
		Vector<Propriedade> lista = propriedadeAction.pesquisar();
		for (Propriedade p : lista) {
			System.out.println(p);
			String sdata = "";
			java.sql.Date data = null;
			try{
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				sdata = format.format(p.getData());  
				ds.addValue(p.getValor(), "", sdata);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		// cria o gráfico
		JFreeChart grafico = ChartFactory.createLineChart(null, null,
				null, ds, PlotOrientation.VERTICAL, false, true, false);

		JFrame frame = new JFrame("Minha janela");
		frame.add(new ChartPanel(grafico, 800, 600, 800, 600, 800, 600, false, false, false, false, true, false));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}
}