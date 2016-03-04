public class ContaBancaria2{
    
	int agencia;
	int contaCorrente;
	double saldo;
	double limiteExtra;
	String titularConta;
	
	public void imprimirSaldo(){
		System.out.println("O saldo da conta é: " + saldo);
	}
	public void imprimirSaldoTotal(){	
	}
	public void imprimirAgencia(){
		System.out.println("A agencia é: " + agencia);
	}
    public void imprimirContaCorrente(){
		System.out.println("A conta-corrente é: " + contaCorrente);	
	}
	public void imprimirTitular(){
		System.out.println("O titular da conta é: " + titularConta);	
	}	

	public static void main(String [] args){
		ContaBancaria2 obj1 = new ContaBancaria2();
		ContaBancaria2 obj2 = new ContaBancaria2();

		obj1.agencia = 3610;
		obj1.contaCorrente = 15766;
		obj1.saldo = 35.34;
		obj1.limiteExtra = 50.00;
		obj1.titularConta = "Frisk";
		
		obj2.agencia = 810;
		obj2.contaCorrente = 6132;
		obj2.saldo = 42.31;
		obj2.limiteExtra = 75;
		obj2.titularConta = "DETERMINATION";
		
		double s1,s2;
		saldo1 = obj1.saldo + obj1.limiteExtra;
		saldo2 = obj2.saldo + obj2.limiteExtra;
		System.out.println(" ");
		System.out.println(obj1.titularConta + " " + obj1.agencia + " " + obj1.contaCorrente + " " + obj1.saldo + " " + saldo1);
		System.out.println(" ");

		
		System.out.println(" ");
		System.out.println(obj2.titularConta + " " + obj2.agencia + " " + obj2.contaCorrente + " " + obj2.saldo + " " + saldo2);
		System.out.println(" ");
	}
}
