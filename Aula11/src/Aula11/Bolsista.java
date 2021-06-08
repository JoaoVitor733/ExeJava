package Aula11;

public class Bolsista extends Aluno {
	//ATRIBUTOS
	 private float bolsa;
	 
	 //METODOS
	 public void renovarBolsa() {
		 System.out.println("Bolsa renovada" + this.nome);
	 }
	 
	 @Override
	 public void pagarMensa() {
     	System.out.println("Pagando mensalidade de aluno");
     }
	 
	 //METODOS ESPECIAIS
	 public float getBolsa() {
		 return bolsa;
	 }
	 
	 public void setBolsa(float b) {
		 this.bolsa = b;
	 }

}
