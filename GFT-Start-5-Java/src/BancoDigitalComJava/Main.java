package BancoDigitalComJava;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setCliente(new Cliente("Joao"));
		c1.setAgencia(1);
		c1.setNumero(123);
		c1.setSaldo(100);
		
		ContaPoupança c2 = new ContaPoupança();
		c2.setCliente(new Cliente("Maria"));
		c2.setAgencia(2);
		c2.setNumero(132);
		c2.setSaldo(200);
		
		c1.sacar(20);
		c2.transferir(50, c1);
		
		
		c1.imprimirExtrato();
		c2.imprimirExtrato();
		
	}

}
