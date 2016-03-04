public class Exercicio1_5{
	public double Somar (double a, double b, double c){
		double soma = a+b+c;
		return soma;
	}
	
	public double Multi (double a, double b, double c){
		double mult = a*b*c;
		return mult;
	}
	
	public double Divis (double a, double b, double c){
		double div = a/b/c;
		return div;
	}
	
	public double Subta (double a, double b, double c){
		double subt = a-b-c;
		return subt;
	}
	
	public static void main(String [] args){
		double a=45;
		double b=20;
		double c=3;
		double soma=0, mult=0, div=0, subt=0;
		Exercicio1_5 obj = new Exercicio1_5();
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
