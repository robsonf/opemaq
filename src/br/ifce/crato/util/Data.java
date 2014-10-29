package br.ifce.crato.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Data {

	/**
	 * @param date at format yyyy-MM-dd
	 * @return string at format yyyy-MM-dd 
	 */
	public static String data2String(Date d){
		String retorno = null;
		if (d != null){
	        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	        retorno = sdf2.format(d);
		}
        return retorno;
	}
	

	/**
	 * @param date at format yyyy-MM-dd
	 * @return string at format dd/MM/yyyy
	 */
	public static String data2View(Date d){
		String retorno = "";
		if (d != null){
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        String r1 = sdf.format(d);
	        String [] c = r1.split("-");
	        String f = "";
	        f += c[2] + "/"+c[1]+"/"+c[0];
	        retorno = f;
		}
		return retorno;
	}


	/**
	 * @param string at format dd/MM/yyyy
	 * @return date at format yyyy-MM-dd
	 */
	public static Date view2Data(String s){
		Date retorno = new Date();
		if (s != null){
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        String [] c = s.split("/");
	        String f = "";
	        f += c[2] + "-"+c[1]+"-"+c[0];
	        try {
	            retorno = sdf.parse(f);
	        } catch (ParseException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(null, "A data deve estar no formato dd/mm/yyyy.");
	        }
		}
		return retorno;
	}


	/**
	 * @param string at format yyyy-MM-dd
	 * @return date at format yyyy-MM-dd
	 */
	public static Date string2Data(String s){
		Date retorno = new Date();
		if (s != null){
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            retorno = sdf.parse(s);
	        } catch (ParseException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(null, "A data deve estar no formato dd/mm/yyyy.");
	        }
		}
		return retorno;
	}
}
