package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.connectionMySQL;
import modelo.Cliente;

public class ClienteDAO {

	//CREATE
	public void save(Cliente cliente) {
		String sql= "INSERT INTO Cliente (Nome, Senha_Cliente, Email) VALUES (?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn= connectionMySQL.createConnectionMySQL();
			pstm= conn.prepareStatement(sql);
			pstm.setString(1, cliente.getNome());
			pstm.execute();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	//READ
	public List<Cliente> getCliente(){
		
		String sql = "SELECT * FROM Cliente";
		
		List<Cliente> cliente = new ArrayList<Cliente>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
		conn = connectionMySQL.createConnectionMySQL();
			
		pstm = conn.prepareStatement(sql);
		
		rset = pstm.executeQuery();
		
		while(rset.next()) {
			Cliente cliente1 = new Cliente();
			cliente1.setId_Cliente(rset.getInt("Id_Cliente"));
			cliente1.setNome(rset.getString("Nome"));
			cliente1.setEmail(rset.getString("Email"));
			cliente1.setSenha_Cliente(rset.getInt("Senha_Cliente"));
			
			Cliente.add(cliente1);
		}
		
		}catch (Exception e){
			e.printStackTrace();
	}finally{
		try {
			if (rset != null) {
				rset.close();
			}
			if(pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cliente;
	
	}
		
	
	//UPDATE
	public void update(Cliente cliente) {
		String sql="UPDATE Cliente SET Nome = ? WHERE Id_Cliente = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = connectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1,  cliente.getNome());
			pstm.setInt(2, cliente.getId_Cliente());
			
			}catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					if(pstm != null) {
						pstm.close();
					}
					if (conn != null) {
						conn.close();
					}
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
	}
	
	//DELETE
	public void deleteById(int id) {
		String sql= "DELETE FROM Cliente WHERE Id_Cliente=?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = connectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
	}
	
	
