public class Palindrome{
	
	public String invertePal(String arg){
		//Esse método reverte um argumento
		StringBuffer inverso = new StringBuffer(arg);
		inverso.reverse();
		arg = inverso.toString();
		return arg;
	}

	public String findPalin(String pal){
		String inverso = new String(invertePal(pal));
		//Primeira comparação, antes de começar a fazer uma varredura no argumento
		if ( pal.equals(inverso) == true && pal.length()>=5){
			return pal + "\nPosição: 0 - "  + pal.length();
		}else{
			//Varredura agora. stringCortada é a uma substring do argumento de entrada, que será usada para fazer a varredura do argumento
			String stringCortada = new String(pal);
			for (int i=pal.length(); i>=5; i--){
				for (int j=0; (j+i) < pal.length(); j++){
					stringCortada = pal.substring(j, j+i);
					inverso = invertePal(stringCortada);
					if ( stringCortada.equals(inverso) == true ){
						return stringCortada + "\nPosição: " + j + " - " + (j+i);
					}else{
					}
				}
			}
		}
		return ("Não há palíndromes no argumento inserido");
	}

	public static void main (String [] args){
		Palindrome obj = new Palindrome();
		String palin = obj.findPalin(args[0]);
		System.out.println("Palíndrome: " + palin);
	}
}
