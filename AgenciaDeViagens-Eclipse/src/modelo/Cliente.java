package modelo;

public class Cliente {
	
private int Id_Cliente;
private int Senha_Cliente;
private String Nome;
private String Email;

private Permissoes permissoes;

public Cliente() {
	
}
public Cliente(int id_Cliente, int senha_Cliente, String nome, String email) {
	super();
	Id_Cliente = id_Cliente;
	Senha_Cliente = senha_Cliente;
	Nome = nome;
	Email = email;
}
public int getId_Cliente() {
	return Id_Cliente;
}
public void setId_Cliente(int id_Cliente) {
	Id_Cliente = id_Cliente;
}
public int getSenha_Cliente() {
	return Senha_Cliente;
}
public void setSenha_Cliente(int senha_Cliente) {
	Senha_Cliente = senha_Cliente;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public static void add(Cliente cliente) {
	// TODO Auto-generated method stub
	
}


}

