
public class ContaPoupaca extends Conta {
	
	public ContaPoupaca(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public void deposita(double valor) { 
	 setSaldo(getSaldo() + valor);
		
	}


}
