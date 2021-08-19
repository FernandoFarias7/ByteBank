public class ContaTeste {
	public static void main(String[] args) {
		
		ContaCorrente cc =  new ContaCorrente(10, 99999);
		cc.setSaldo(100);
		System.out.println(cc.getSaldo());
		
		ContaPoupaca cp = new ContaPoupaca(10, 11111);
		cp.setSaldo(200);
		System.out.println("cp"+cp.getSaldo());
		
		cp.transfere(100, cc);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		cc.saque(10);
		System.out.println(cc.getSaldo());
		
	}
}
