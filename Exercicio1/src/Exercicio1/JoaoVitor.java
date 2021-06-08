package Exercicio1;

public class JoaoVitor {
     float Altura;
     int Idade;
     String Cor;
     float MediaEscolar;
     boolean Ferias;
     
     void Ferias() {
    	 if(this.MediaEscolar >= 7) {
    		 this.Ferias = true;
    	 }else {
    		 this.Ferias = false;
    	 }
     }
     
     void Status() {
    	 System.out.println("Altura: " + this.Altura);
    	 System.out.println("Idade: " + this.Idade);
    	 System.out.println("Cor: " + this.Cor);
    	 System.out.println("Estar de ferias: " + this.Ferias);
     }
     
}
