public class Exercicio1_4{
	public float Somar (float a, float b, float c){
		float soma = a+b+c;
		return soma;
	}
	
	public float Multi (float a, float b, float c){
		float mult = a*b*c;
		return mult;
	}
	
	public float Divis (float a, float b, float c){
		float div = a/b/c;
		return div;
	}
	
	public float Subta (float a, float b, float c){
		float subt = a-b-c;
		return subt;
	}
	
	public static void main(String [] args){
		float a=45;
		float b=20;
		float c=3;
		float soma=0, mult=0, div=0, subt=0;
		Exercicio1_4 obj = new Exercicio1_4();
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
