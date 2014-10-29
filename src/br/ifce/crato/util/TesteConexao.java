package br.ifce.crato.util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TesteConexao {
	public static void main(String[] args) {
		Connection con = null;	
		try {
			con = Conexao.getConexao();
			con.setAutoCommit(true);
			Statement stm = con.createStatement();

			ResultSet rs = stm
					.executeQuery("SELECT * FROM PROPRIEDADE");

			while (rs.next()) {
				String nome = rs.getString("nome");
				System.out.println("Nome:" + nome);
			}

			con.commit();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
