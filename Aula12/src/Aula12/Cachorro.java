package Aula12;

public class Cachorro extends Mamifero{
     //METODOS
	 public void enterrarOsso() {
		 System.out.println("enterrando o osso");
	 }
	 
	 public void abanarRabo() {
		 System.out.println("Abanando o rabo");
	 }
	 
	 //SOBREPO��O DE M�TODOS
	 @Override
	 public void emitirSom() {
		 System.out.println("Latindo");
	 }
}
