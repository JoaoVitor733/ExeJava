package Aula12;

public class Cachorro extends Mamifero{
     //METODOS
	 public void enterrarOsso() {
		 System.out.println("enterrando o osso");
	 }
	 
	 public void abanarRabo() {
		 System.out.println("Abanando o rabo");
	 }
	 
	 //SOBREPOÇÃO DE MÉTODOS
	 @Override
	 public void emitirSom() {
		 System.out.println("Latindo");
	 }
}
