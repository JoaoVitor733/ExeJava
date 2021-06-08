package Aula2;

public class Caneta {
//  ATRIBUTOS
   public String Modelo; // o atributo modelo e publico pode ser usado em qualquer lugar
   public String Cor;
   private float Ponta; // so a classe caneta pode usar porque esse atributo e privado
   protected int Carga;  // atributo protegido só os filhos dessa classe podem usar
   protected boolean Tampada;
//   METODOS   
    public void Status(){
    	System.out.println("Modelo da caneta: " + this.Modelo);
    	System.out.println("Uma caneta " + this.Cor);
    	System.out.println("Tamanho da ponta: " + this.Ponta);
    	System.out.println("Carga da caneta: " + this.Carga);
    	System.out.println("Estar tampada? " + this.Tampada);
    }
    
   public void Rabiscar() {
    	if(this.Tampada == true) {
    		System.out.println("ERRO, nao posso rabiscar!");
    	}else {
    		System.out.println("Estou rabiscando!");
    	}
    }
    
   protected void Tampar() {
    	this.Tampada = true;
    }
    
   protected  void Destampar() {
    	this.Tampada = false;
    }
    
}
