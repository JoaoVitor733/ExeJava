package Aula4;

public class Caneta {
   public String Modelo;
   private float Ponta;
   private String Cor;
   private boolean Tampada;
   
//   public Caneta() {
//	   this.Tampar();
//	   this.Cor = "Azul";
//   }
   
   public Caneta(String m, String c, float p) {
	   this.Modelo = m;
	   this.Cor = c;
	   this.Ponta = p;
	   this.Tampar();
  }
   
   public String getModelo() {
	   return this.Modelo;
   }
    
   public void setModelo(String m) {
	   this.Modelo = m;
   }
   
   public float getPonta() {
	   return this.Ponta;
   }
    
   public void setPonta(float n) {
	   this.Ponta = n;
   }
   
   public void Tampar() {
	   this.Tampada = true;
   }
   
   public void Destampar() {
	  this.Tampada = false;
   }
   
  public void Status() {
	   System.out.println("Modelo: " + this.Modelo);
	   System.out.println("Ponta: " + this.Ponta);
	   System.out.println("Cor: " + this.Cor);
	   System.out.println("Tampada: " + this.Tampada);
	   
   }
}
