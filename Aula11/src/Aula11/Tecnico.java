package Aula11;

public class Tecnico extends Aluno{
	  //ATRIBUTOS
      private boolean registro;
      //METODOS
      public void praticar() {
    	  System.out.println("Praticando");
      }
      //METODOS ESPECIAIS
      public boolean getRegistro() {
    	  return registro;
      }
      
      public void setRegistrarPro(boolean r) {
    	  this. registro=  r;
      }
}
