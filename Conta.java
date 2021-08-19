public abstract class Conta{
		
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
    private static int total = 0;
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("O total  de  contas e " + Conta.total );
    	this.agencia = agencia;
    	this.numero = numero;
    	//this.saldo = 100;
    	System.out.println("estou criando uma conta " + this.numero);
    	
    }
	
	 public Cliente getTitular() {
			return titular;
		}




		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
    
    
    
    
		public static int getTotal() {
		return total;
	}

		public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}



		public abstract void deposita(double valor);
		
		
		public boolean saque(double valor) {
			if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
			} else {
				return false;
			}
		}
			
		public boolean transfere(double valor, Conta destino) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
			}else {
				return false;
			}
			
			
			
		}
				
		
	}


