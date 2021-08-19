
public class Teste {

	public static void main(String[] args) {
		 
		
	ContaCorrente fer = new ContaCorrente(1, 5);
		fer.setSaldo(100);
		
		CalculadorDeimposto calc = new CalculadorDeimposto();
		calc.registra(fer);
		System.out.println(calc.getTotalImposto());
	}

}
