package Teste;

import java.util.Scanner; //Biblioteca pra fazer leitura do teclado

public class Principal {

	public static void main(String[] args) {
		  //leitura do teclado
		  Scanner input = new Scanner(System.in);
		  
		  //Instanciamento
		  Lampada l1;
		  
		  l1 = new Lampada();
		  
		  int op;
		  
		  do {
			System.out.println(" "); 
			System.out.println("\tMENU LAMPADA");
			System.out.println("\t1 - LIGAR");
			System.out.println("\t2 - DESLIGAR");
			System.out.println("\t3 - ESTAR LIGADA?");
			System.out.println("\t4 - VERIFICAR POT�NCIA");
			System.out.println("\t5 - ALTERAR POT�NCIA");
			System.out.println("\t6 - SAIR");
			
			System.out.print("\tDigite a ope��o desejada: \n\t");
			op = input.nextInt();
			
			
			switch(op) {
			case 1:
				l1.ligar();
			break;
			case 2:
				l1.desligar();
		    break;
			case 3:		
				if(l1.estarLigada()) {
					 System.out.println("A l�mpada estar ligada");
				}else {
					 System.out.println("A l�mpada estar desligada");
				}
			break;
			case 4:
				System.out.println("A pot�ncia da l�mpada: " + l1.verificarPotencia());
			break;
			case 5:
				System.out.println("\nDigite uma pot�ncia: ");
				l1.alterarPotencia(input.nextInt());
			break;
			case 6:
				System.out.println("Saindo...");
			break;
			default:
				System.out.println("ERRO");	
			}
		  }while(op != 6);

	}

}
