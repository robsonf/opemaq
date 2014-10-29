package br.ifce.crato.util;



import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import br.ifce.crato.actions.OperacaoAction;
import br.ifce.crato.beans.Operacao;

public class Teste extends ApplicationFrame {

    public Teste(final String title) {

        super(title);
        OperacaoAction operacaoAction = new OperacaoAction();
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
            );    ;

        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);

    }

    public static void main(final String[] args) {

        final Teste demo = new Teste("Gantt Chart Demo 1");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
}

