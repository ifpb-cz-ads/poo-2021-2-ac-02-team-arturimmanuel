//import java.util.Scanner;

public class CBBAtividadePratica4 {

	public static void main(String[] args) {
		
		int larguraPiscina = 15;
		int alturaPiscina = 3;
		int comprimentoPiscina = 10;
		
		double custoPiscina = (larguraPiscina*alturaPiscina*comprimentoPiscina)*100.00;
		
		//caso queira ler um valor proprio é só desativar esse comentario de bloco e o import
		
		/*
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a largura: ");
		int larguraPiscIn = in.nextInt();
		System.out.println("Digite o comprimento: ");
		int comprimentoPiscIn = in.nextInt();
		System.out.println("Digite a altura: ");
		int alturaPiscIn = in.nextInt();
		
		double valorOrcUser = (larguraPiscIn*alturaPiscIn*comprimentoPiscIn)*100.00;
		
		if(valorOrcUser < 0) {
			valorOrcUser = valorOrcUser * (-1);
			System.out.println("O valor do orçamento é: R$" + valorOrcUser);
		}else {
			System.out.println("O valor do orçamento é: R$" + valorOrcUser);
		}
		*/
		
		System.out.println("O valor do orçamento dessa piscina é de: R$" + custoPiscina);
	}
	
}
