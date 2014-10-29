package br.ifce.crato.util;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private static Connection conexao = null;
	
	public static Connection getConexao() {
		if(conexao == null)
			new Conexao();
		return conexao;
	}

	private Conexao() {
		try {
			File f = new File("data"+File.separator+"opemaqbd");
			conexao = DriverManager.getConnection(
					"jdbc:hsqldb:file:"+f.getAbsolutePath(), "SA", "");
		} catch (Exception e) {
			System.out.println("Erro ao carregar o driver JDBC. "
					+ e.getMessage());
		}
	}

	public static void close(){
		try {
			if(conexao != null)
				conexao.close();
		} catch (Exception e) {
			System.out.println("Erro ao carregar o driver JDBC. "
					+ e.getMessage());
		}
	}
}
