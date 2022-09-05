package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hotel {


private int Id_Hotel;
private double Valor_Hotel;
private LocalDate Data_checkin;
private String Destino_Hotel;

public Hotel(){
	
}
public Hotel(int id_Hotel, double valor_Hotel, LocalDate data_checkin, String destino_Hotel) {
	super();
	Id_Hotel = id_Hotel;
	Valor_Hotel = valor_Hotel;
	Data_checkin = data_checkin;
	Destino_Hotel = destino_Hotel;
}
public int getId_Hotel() {
	return Id_Hotel;
}
public void setId_Hotel(int id_Hotel) {
	Id_Hotel = id_Hotel;
}
public double getValor_Hotel() {
	return Valor_Hotel;
}
public void setValor_Hotel(double valor_Hotel) {
	Valor_Hotel = valor_Hotel;
}
public LocalDate getData_checkin() {
	return Data_checkin;
}
public void setData_checkin(LocalDate data_checkin) {
	Data_checkin = data_checkin;
}
public String getDestino_Hotel() {
	return Destino_Hotel;
}
public void setDestino_Hotel(String destino_Hotel) {
	Destino_Hotel = destino_Hotel;
}
DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

}

