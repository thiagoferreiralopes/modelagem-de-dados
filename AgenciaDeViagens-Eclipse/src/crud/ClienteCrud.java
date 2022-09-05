package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.ClienteDAO;
import modelo.Cliente;

public class ClienteCrud {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	ClienteDAO clienteDAO = new ClienteDAO();
	
	Scanner input = new Scanner(System.in);
	
	int opcao =0;
	int posicao =0;
	
	int id =0;
	String Nome ="";
	
	List<Cliente>cliente = new ArrayList<Cliente>();
	
//MENU
	
	System.out.println("--- CRUD CLIENTE ---");
	System.out.println("1 - Cadastro de Cliente");
	System.out.println("2 - Consulta de Cliente");
	System.out.println("3 - Delete de Cliente");
	System.out.println("4 - Atualizar Cliente");
	System.out.println("0 - SAIR -");
	
	opcao = input.nextInt();
	
	//NAVEGAÇÃO DO CRUD
	
	switch (opcao) {
	
	case 1:
		System.out.println("++ Cadastrar Cliente ++");
		System.out.println("Digite o Nome: ");
		Nome = input.nextLine();
		Nome = input.nextLine();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome(Nome);
		clienteDAO.save(cliente1);
		
		System.out.println("\n +++ Cadastrado +++\n");
		break;
		
	case 2:
		//READ
			for (Cliente a : clienteDAO.getCliente()) {
				System.out.println("Id: " + a.getId_Cliente() + "Nome: " + a.getNome());
			}
		System.out.println("*Consulta Finalizada*");
		break;
		
	case 3:
		//DELETE
		System.out.println("Informe o ID para exclusão: ");
		posicao = input.nextInt();
		
		clienteDAO.deleteById(posicao);
		System.out.println("Cliente excluido com sucesso");
		break;
		
	case 4:
		//UPDATE
		System.out.println("Digite o ID do Cliente: ");
		id= input.nextInt();
		System.out.println("Digite o novo nome do Cliente: ");
		Nome = input.nextLine();
		Nome = input.nextLine();
		
		Cliente cliente2 = new Cliente(id, id, Nome, Nome);
		clienteDAO.update(cliente2);
		break;
		
		
		default:
			System.out.println(opcao != 0 ? "\n Opção Invalida\n" : "");
		break;
		
	
	}

	
	while (opcao != 0);
	input.close();
	System.out.println("Finalizado");

}
}