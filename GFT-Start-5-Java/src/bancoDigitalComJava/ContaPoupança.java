package bancoDigitalComJava;

public class ContaPoupança extends Conta{

	public void imprimirExtrato() {
		System.out.println("---- Conta Poupança ----");
		System.out.println("Agencia: "+ super.getAgencia());
		System.out.println("Numero: "+ super.getNumero());
		System.out.println("Nome cliente: "+ super.getCliente().getNome());
		System.out.println("Saldo: "+ super.getSaldo());
	}
	
	
	
}
