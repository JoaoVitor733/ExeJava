package Aula13;

public class Mamifero extends Animal{
	   //ATRIBUTOS
       private String CorPelo;
       
       //MÉTODOS ESPECIAIS
       public String getCorPelo() {
    	   return  CorPelo;
       }
       
       public void setCorPelo(String c) {
    	   this.CorPelo = c;
       }
       //SOBREPOSIÇÃO DE MÉTODOS
       @Override
       public void emitirSom() {
    	   System.out.println("Som do mamifero");
       }
}
