package modelo;

public class Pacotes {

private int Id_Pacote;
private double Valor_Pacote;
private int Quant_Dias_Viagem;
private String Destino_Pacote;

public Pacotes() {
	
}
public Pacotes(int id_Pacote, double valor_Pacote, int quant_Dias_Viagem, String destino_Pacote) {
	super();
	Id_Pacote = id_Pacote;
	Valor_Pacote = valor_Pacote;
	Quant_Dias_Viagem = quant_Dias_Viagem;
	Destino_Pacote = destino_Pacote;
}
public int getId_Pacote() {
	return Id_Pacote;
}
public void setId_Pacote(int id_Pacote) {
	Id_Pacote = id_Pacote;
}
public double getValor_Pacote() {
	return Valor_Pacote;
}
public void setValor_Pacote(double valor_Pacote) {
	Valor_Pacote = valor_Pacote;
}
public int getQuant_Dias_Viagem() {
	return Quant_Dias_Viagem;
}
public void setQuant_Dias_Viagem(int quant_Dias_Viagem) {
	Quant_Dias_Viagem = quant_Dias_Viagem;
}
public String getDestino_Pacote() {
	return Destino_Pacote;
}
public void setDestino_Pacote(String destino_Pacote) {
	Destino_Pacote = destino_Pacote;
}


}

