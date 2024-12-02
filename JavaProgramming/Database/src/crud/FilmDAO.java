package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {
	public Connection con;
	private final MySQLConnection db;
	
	public FilmDAO(MySQLConnection db) {
		this.db = db;
	}
	
	public boolean create(FilmModel filme) throws SQLException {
		Connection con = db.con;
		
		if(con == null) {
			return false;
		}
		
		String cmdSQL = "INSERT INTO filmes(codigo,titulo,genero,produtora,dataCompra) VALUES(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(cmdSQL);
		ps.setString(1, filme.getCodigo());
		ps.setString(2, filme.getTitulo());
		ps.setString(3, filme.getGenero());
		ps.setString(4, filme.getProdutora());
		ps.setDate(5, filme.getDataCompra());
		
		int modifyLines = ps.executeUpdate();
		ps.close();
		//con.close(); Não podemos fechar aqui, porém deve ser fechado em algum momento!
		System.out.println("Filme criado com sucesso!");
		
		return modifyLines > 0;
	}
	
	public List<FilmModel> read() throws SQLException {
		List<FilmModel> filmes = new ArrayList<>();
		Connection con = db.con;
		
		if(con == null) {
			return filmes;
		}
		
		String cmdSQL = "SELECT * FROM filmes";
		PreparedStatement ps = con.prepareStatement(cmdSQL);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			FilmModel filme = new FilmModel(rs.getString("codigo"),
											rs.getString("titulo"),
											rs.getString("genero"),
											rs.getString("produtora"),
											rs.getDate("dataCompra")
											);
			filmes.add(filme);
		}
		rs.close();
		ps.close();
		//con.close(); Lembrete
		return filmes;
	}
	
	public boolean update(FilmModel filme) throws SQLException {
		Connection con = db.con;
		
		if(con == null) {
			return false;
		}
		
		String cmdSQL = "UPDATE filmes SET titulo = ?, genero = ?, produtora = ?, dataCompra = ? WHERE codigo = ?";
		PreparedStatement ps = con.prepareStatement(cmdSQL);
		ps.setString(1, filme.getTitulo());
		ps.setString(2, filme.getGenero());
		ps.setString(3, filme.getProdutora());
		ps.setDate(4, filme.getDataCompra());
		ps.setString(5, filme.getCodigo());
		
		int modifyLines = ps.executeUpdate();
		ps.close();
		//con.close(); Não podemos fechar aqui, porém deve ser fechado em algum momento!
		System.out.println("Filme atualizado com sucesso!");
		
		return modifyLines > 0;
	}
	
	public boolean delete(String codigo) throws SQLException {
		Connection con = db.con;
		
		if(con == null) {
			return false;
		}
		
		String cmdSQL = "DELETE FROM filmes WHERE codigo = ?";
		PreparedStatement ps = con.prepareStatement(cmdSQL);
		ps.setString(1, codigo);
		
		int modifyLines = ps.executeUpdate();
		ps.close();
		//con.close(); Lembrete
		return modifyLines > 0;
	}
}