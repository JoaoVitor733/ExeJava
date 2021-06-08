package Teste;

public class Lampada {
	 //ATRIBUTOS
	 private boolean ligada;
	 private int potencia;
	 
	 //METODOS
	 public void ligar() {
		 ligada = true;
	 }
	 
	 public void desligar() {
		 ligada = false;
	 }
	 
	 public boolean estarLigada() {
		  return ligada;
		  
	 }
	 
	 public int verificarPotencia() {
		 return potencia;
	 }
	 
	 public void alterarPotencia(int novaPotencia) {
		  potencia = novaPotencia;
		  System.out.println("A potência da lâmpada");
	 }

}
