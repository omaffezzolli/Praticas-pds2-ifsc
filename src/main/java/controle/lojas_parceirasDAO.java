package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.lojas_parceiras;

public class lojas_parceirasDAO {
	
	public ArrayList<lojas_parceiras> listar() {
		Conexao c = Conexao.getInstancia();
		
		Connection con = c.conectar();
		
		ArrayList<lojas_parceiras> lojas = new ArrayList();
		String query = "";
		 return null;
	}
	
	
	public boolean inserir(lojas_parceiras lp) {
		
		Conexao c = Conexao.getInstancia();
		
		Connection con = c.conectar();
		
		String query = "INSERT INTO lojas_parceiras (id_cnpj, nome_loja) VALUES  (?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1,lp.getId_cnpj());
			ps.setString(1, lp.getNome_loja());
			
			ps.executeUpdate();
			c.fecharConexao();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
;		
		return false;
	}

}
