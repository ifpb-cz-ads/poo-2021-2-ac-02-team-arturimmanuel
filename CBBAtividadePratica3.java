// import java.util.Scanner;

public class CBBAtividadePratica3 {

	public static void main(String[] args) {
		
		int largura = 5;
		int comprimento = 7;
		
		//caso queira ler um valor proprio é só desativar esse comentario de bloco e o import
		
		/* 
		Scanner in = new Scanner(System.in);
		
		int larguraIn = in.nextInt();
		int comprimentoIn = in.nextInt();
		
		int areaUser = larguraIn*comprimentoIn;
		
		if(areaUser < 0) {
			areaUser = areaUser * (-1);
			System.out.println("A área do retangulo é: " + areaUser + " e não coloque negativo novamente");
		}else {
			System.out.println("A área do retangulo é: " + areaUser);
		}
		*/
		
		int areaRect = largura*comprimento;
		
		System.out.println("A área do retangulo é: " + areaRect);

		
		

	}

}
