public class Exercicio1_3{
	public int Somar (int a, int b, int c){
		int soma = a+b+c;
		return soma;
	}
	
	public int Multi (int a, int b, int c){
		int mult = a*b*c;
		return mult;
	}
	
	public int Divis (int a, int b, int c){
		int div = a/b/c;
		return div;
	}
	
	public int Subta (int a, int b, int c){
		int subt = a-b-c;
		return subt;
	}
	
	public static void main(String [] args){
		int a=45;
		int b=20;
		int c=3;
		int soma=0, mult=0, div=0, subt=0;
		Exercicio1_3 obj = new Exercicio1_3();
		soma = obj.Somar(a, b, c);
		mult = obj.Multi(a, b, c);
		div = obj.Divis(a, b, c);
		subt = obj.Subta(a, b, c);
		System.out.println("O valor da soma é: " + soma);
		System.out.println("O valor da multipicação é: " + mult);
		System.out.println("O valor da divisão é: " + div);
		System.out.println("O valor da subtração é: " + subt);
	}
}
