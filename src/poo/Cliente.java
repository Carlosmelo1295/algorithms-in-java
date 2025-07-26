package poo;

public class Cliente {
 String cliente;
 double saldo;
 
 void exibeSaldo() {
	 System.out.println("Cliente " + cliente +" Seu saldo é: " + saldo);
 }
 
 void saca(double valor) {
	 saldo = saldo - valor;
 }
 
 void deposita(double valor) {
	 saldo = saldo + valor;
 }
 
 void transfere(Cliente destino, double valor) {
	 this.saca(valor);
	 destino.deposita(valor);
 }
 
}
