package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compra {

	private int Id_Compra;
	private LocalDate Data_Compra;
	private double Valor_compra;
	
	private Cliente cliente;
	private TipoCompra tipocompra;
	
	public Compra() {
		
	}
	public Compra(int id_Compra, LocalDate data_Compra, double valor_compra) {
		super();
		Id_Compra = id_Compra;
		Data_Compra = data_Compra;
		Valor_compra = valor_compra;
	}
	public int getId_Compra() {
		return Id_Compra;
	}
	public void setId_Compra(int id_Compra) {
		Id_Compra = id_Compra;
	}
	public LocalDate getData_Compra() {
		return Data_Compra;
	}
	public void setData_Compra(LocalDate data_Compra) {
		Data_Compra = data_Compra;
	}
	public double getValor_compra() {
		return Valor_compra;
	}
	public void setValor_compra(double valor_compra) {
		Valor_compra = valor_compra;
	}
DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
}
