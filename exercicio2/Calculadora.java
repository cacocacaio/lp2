public class Calculadora{
    
	int v1, v2;

	public void soma(){
		int s;
		s = v1 + v2;
		System.out.println("A soma dos dois números são: " + s);
	}
	public void subtracao(){
		int sub;
		sub = v1 - v2;
		System.out.println("A subtração dos dois números são: " + sub);
	}
	public void multiplicacao(){
		int m;
		m = v1 * v2;
		System.out.println("A multiplicação dos dois números são: " + m);
	}
	public void divisao(){
		int d;
		d = v1 / v2;
		System.out.println("A divisão dos dois números são: " + d);
	}
	
	public static void main(String [] args){
		Calculadora obj1 = new Calculadora();
		Calculadora obj2 = new Calculadora();
		Calculadora obj3 = new Calculadora();

		obj1.v1 = 30;
		obj1.v2 = 2;
		
		obj2.v1 = 15;
		obj2.v2 = 5;

		obj3.v1 = 998;
		obj3.v2 = 2;

		System.out.println(" ");
		obj1.soma();
		obj1.subtracao();
		obj1.multiplicacao();
		obj1.divisao();
		
		System.out.println(" ");
		obj2.soma();
		obj2.subtracao();
		obj2.multiplicacao();
		obj2.divisao();
		
		System.out.println(" ");
		obj3.soma();
		obj3.subtracao();
		obj3.multiplicacao();
		obj3.divisao();
	}
}
