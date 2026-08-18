

public class ExemploString{
	
	public static void main (String[] args) {
		String str1, str2, str3;
		str1= "			 Um texto qualquer .xxxxxxx....    		 ";
		System.out.println("[" + str1 + "]");
		str1 = str1.trim();
		System.out.println("Apos [" + str1 + "]");
		System.out.println("Tamanho do stre1 = " + str1.length());
		
		// substituir um substring dentro de um String
		str2 = str1.replace("texto", "teste");
		System.out.println("str2[" + str2 + "]");
		str2 = str2.replace(".", "$");
		System.out.println("str2[" + str2 + "]");
		
		// extrair um substring
		str2 = str1.substring(3,8);
		System.out.println("str2[" + str2 + "]");
		
		//procurar substring
		str2 = "joao.silva@gmail.com";
		int posicao = str2.indexOf("@");
		System.out.println(" - @ está na posicao :" + posicao);
		System.out.println("Usuario: " + str2.substring(0, str2.indexOf("@")));
		
		System.out.println("Dominio: " + str2.substring(str2.indexOf("@") + 1).toUpperCase());
		
		
		/*
		toUpperCase() - transformar para maiusculas
		toLowerCase() - transformar para minusculas
		
		*/
		
		// converter de outros tipos para String
		int valor = 5;
		str3 = String.valueOf(valor);
		
		//quebrar um String em vetor
		String valores = "4/6/2/55/22/9";
		String[] arrayValores = valores.split("/");
		System.out.println("arrayValores[3] = " + arrayValores[3]);
		
		//percorra o arrayValores mostrando todos os valores na tela
		
		for(int i  = 0; i < arrayValores.length; i++){
			System.out.println("Valores:" + "["+ (i+1) + "]" + arrayValores[i]);
		
	}
		
	}
}

