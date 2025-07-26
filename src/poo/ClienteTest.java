package poo;

public class ClienteTest {
 public static void main(String[] args) {
	  Cliente cliente = new Cliente();
	  
      cliente.cliente = "Tklao";
	  cliente.saldo = 100.000;
	  cliente.exibeSaldo();
	  
	  
	  Cliente destino = new Cliente();
	  
	  destino.cliente = "Dudu";
	  destino.saldo = 500.000;
	  destino.exibeSaldo();

	  
	  cliente.transfere(destino, 50.00);
	  destino.exibeSaldo();
	  cliente.exibeSaldo();



 }
}
