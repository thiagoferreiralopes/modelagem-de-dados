package modelo;

import java.util.ArrayList;
import java.util.List;

public class TipoCompra {

private int Quantidade;

private Pacotes pacotes;
private Viagem viagem;
private Hotel hotel;

private List<TipoCompra> itens = new ArrayList <TipoCompra>();


public TipoCompra() {
	
}
public TipoCompra(int quantidade) {
	super();
	Quantidade = quantidade;
}
public int getQuantidade() {
	return Quantidade;
}
public void setQuantidade(int quantidade) {
	Quantidade = quantidade;
}

}