package ProjetoFinal;

public class Visualizacao {
	   //ATRIBUTOS
	   private Gafanhoto espectador;
	   private Video filme;
	   
	   //CONSTRUTOR

	   public Visualizacao(Gafanhoto espectador, Video filme) {
		   this.espectador = espectador;
		   this.filme = filme;
		   this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		   this.filme.setViews(this.filme.getViews() + 1);
	   }
	   
	   //POLIMORFISMO SOBRECARGA
	   public void avaliar() {
		   this.filme.setAvaliacao(5);
	   }
	   
	   public void avaliar(int a) {
		    this.filme.setAvaliacao(a);
	   }
	  
	   public void avaliar(float b) {
		    int tot = 0;
		    if((b >= 0) && (b<= 100)) {
		    	if(b <= 20) {
		    		tot = 3;
		    	}else if(b <= 50) {
		    		tot = 5;
		    	}else if(b <= 90) {
		    		tot = 8;
		    	}else {
		    		tot = 10;
		    	}
		    }
		    this.filme.setAvaliacao(tot);
	   }
	   
	   //MÉTODOS ESPECIAIS
	   public Gafanhoto getEspectador() {
		   return espectador;
	   }
	   
	   public void setEspectador(Gafanhoto e) {
		    this.espectador = e;
	   }
	   
	   public Video getFilme() {
		    return filme;
	   }
	   
	   public void setFilme(Video f) {
		    this.filme = f;
	   }
	   
	   public String status() {
		   return  this.espectador.status()  + this.filme.status();
	   }

}
