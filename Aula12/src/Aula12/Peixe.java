package Aula12;

public class Peixe extends Animal{
	//ATRIBUTOS
	 private String corEscama;
	 
	 //METODOS
	 public void soltarBolha() {
		 System.out.println("soltou bolhas");
	 }
	 
	 //METODOS ESPECIAIS
	 public String getCorEscama() {
		 return corEscama;
	 }
	 
	 public void setCorEscama(String c) {
		 this.corEscama = c;
	 }
	 
	 //METODOS SOBREPOSTOS
	 @Override
	 public void locomover() {
		 System.out.println("Nadando");
	 }
	 
	 @Override
	 public void alimentar() {
		 System.out.println("Comendo susbtâncias");
	 }
	 
	 @Override
	 public void emitirSom() {
		 System.out.println("Peixe não faz som");
	 }

}
