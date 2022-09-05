package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.format.DateTimeFormatter;

public class Viagem {

	private int Id_Viagem;
	private String Destino_Viagem;
	private LocalDate Data_Viagem;
	private double Valor_viagem;
	
	public Viagem() {
		
	}
	public Viagem(int id_Viagem, String destino_Viagem, LocalDate data_Viagem, double valor_viagem) {
		super();
		Id_Viagem = id_Viagem;
		Destino_Viagem = destino_Viagem;
		Data_Viagem = data_Viagem;
		Valor_viagem = valor_viagem;
	}
	public int getId_Viagem() {
		return Id_Viagem;
	}
	public void setId_Viagem(int id_Viagem) {
		Id_Viagem = id_Viagem;
	}
	public String getDestino_Viagem() {
		return Destino_Viagem;
	}
	public void setDestino_Viagem(String destino_Viagem) {
		Destino_Viagem = destino_Viagem;
	}
	public LocalDate getData_Viagem() {
		return Data_Viagem;
	}
	public void setData_Viagem(LocalDate data_Viagem) {
		Data_Viagem = data_Viagem;
	}
	public double getValor_viagem() {
		return Valor_viagem;
	}
	public void setValor_viagem(double valor_viagem) {
		Valor_viagem = valor_viagem;
	}

	DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");	
}
