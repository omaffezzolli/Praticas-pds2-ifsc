package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.lojas_parceiras;

public class lojas_parceirasDAO {
	
	public boolean inserir(lojas_parceiras lp) {
		
		Conexao c = Conexao.getInstancia();
		
		Connection con = c.conectar();
		
		String query = "INSERT INTO";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
;		
		return true;
	}

}
