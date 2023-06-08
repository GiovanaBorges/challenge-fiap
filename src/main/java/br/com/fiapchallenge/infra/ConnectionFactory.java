package br.com.fiapchallenge.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private static final String USERNAME = "RM96547";
	private static final String PASSWORD = "210603";

	public static void main(String[] args) {
		try {
			conectarBancoDados();
			System.out.println("Conexão estabelecida com sucesso!");
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar ao banco de dados.");
			exibirMensagemErro(e);
		}
	}

	private static Connection conectarBancoDados() throws SQLException {
		Connection conexao = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return conexao;
	}

	private static void exibirMensagemErro(SQLException e) {
		System.err.println("Mensagem de erro: " + e.getMessage());
	}

	public static Connection getConnection() throws SQLException {
		try {
			return conectarBancoDados();

		} catch (SQLException e) {
			System.err.println("Não foi possível conectar ao banco de dados.");
			exibirMensagemErro(e);
		}

		return conectarBancoDados();
	}

	
}
