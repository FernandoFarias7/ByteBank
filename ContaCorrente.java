
public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	
	
	@Override
	
	public boolean saque(double valor) {
		double valorASacar = valor + 0.2;
		return super.saque(valorASacar);
		
	}
	
	@Override
	public void deposita(double valor) { 
	 setSaldo(getSaldo() + valor);
		
	}


	@Override
	public double getValorImposto() {
		return getSaldo() * 0.01;
	}

}
