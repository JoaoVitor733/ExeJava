package Aula6;

public class ControleRemoto implements Controlador{
	//ATRIBUTOS
      private int volume;
      private boolean ligado;
      private boolean tocando;   
      
    //METODOS ESPECIAIS
      
      public  ControleRemoto() {
    	 this.volume = 0;
    	 this.ligado = false;
    	 this.tocando = false;
    	  
      }
      
      public int getVolume() {
    	  return volume;
      }
      
      public void setVolume(int m) {
    	  volume = m;
      }
      
      public boolean getLigado() {
    	  return ligado;
      }
      
      public void setLigado(boolean n) {
    	  ligado = n;
      }
      
      public boolean getTocando() {
    	  return tocando;
      }
      
      public void setTocando(boolean j) {
    	  tocando = j;
      }
      
      //METODOS ABSTRATOS

	  @Override
	  public void ligar() {
		 this.setLigado(true);
	  }

	  @Override
	  public void desligar() {
		 this.setLigado(false);
	  }

	  @Override
	  public void abrirMenu() {
		  if(this.getLigado())	{  
			 System.out.println("-------MENU-------");
			 System.out.println("Está ligado: " + this.getLigado());
			 System.out.println("Está tocando: " + this.getTocando());
			 System.out.print("Volume: ");
			 for (int i = 0; i < this.getVolume(); i+=10) {
				 System.out.print("|");
			 }
			 System.out.println("\n------------------");
		  }
	  }

	  @Override
	  public void fecharMenu() {
		 if(this.getLigado()) { 
			 System.out.println("\nFechando menu...")	;
		 }
	   }

	  @Override
	  public void maisVolume() {
		 if(this.getLigado()) {
			 this.setVolume(this.getVolume()+10);
		 }
	  }

	  @Override
	  public void menosVolume() {
		 if(this.getLigado() && this.getVolume() > 0) {
			 this.setVolume(this.getVolume()-10);
		 }
		
	  }

	  @Override
	  public void ligarMudo() {
		 if(this.getLigado() && this.getVolume() > 0) {
			 this.setVolume(0);
		 }		
	  }
 
	  @Override
	  public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	  }

	  @Override
	  public void play() {
		 if(this.getLigado() && !this.getTocando()) {
			 this.setTocando(true);
		 }
	   }

	  @Override
	  public void pause() {
		 if(this.getLigado() && this.getTocando()) {
			 this.setTocando(false);
		 }
	  }
}
