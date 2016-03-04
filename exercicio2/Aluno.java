public class Aluno{

    String nome;
	int idade;
	String numeroMatricula;

	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + nome + " - Idade: " + idade + " - Numero Matricula: " + numeroMatricula);
	}

	public static void main(String [] args){
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();

		a1.nome = "Frisk";
		a1.idade = 10;
		a1.numeroMatricula = "111";
		a2.nome = "Flowey";
		a2.idade = 99999;
		a2.numeroMatricula = "222";
		a3.nome = "Chara";
		a3.idade = 99999;
		a3.numeroMatricula = "333";
		a4.nome = "DETERMINATION";
		a4.idade = 9001;
		a4.numeroMatricula = "444";
		
		System.out.println(" ");
		a1.imprimirDadosCadastrais();
		System.out.println(" ");
		a2.imprimirDadosCadastrais();
		System.out.println(" ");
		a3.imprimirDadosCadastrais();
		System.out.println(" ");
		a4.imprimirDadosCadastrais();
	}
}
