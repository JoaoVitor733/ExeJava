package Aula13;

public class Mamifero extends Animal{
	   //ATRIBUTOS
       private String CorPelo;
       
       //M�TODOS ESPECIAIS
       public String getCorPelo() {
    	   return  CorPelo;
       }
       
       public void setCorPelo(String c) {
    	   this.CorPelo = c;
       }
       //SOBREPOSI��O DE M�TODOS
       @Override
       public void emitirSom() {
    	   System.out.println("Som do mamifero");
       }
}
