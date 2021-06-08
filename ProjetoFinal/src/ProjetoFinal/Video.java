package ProjetoFinal;

public class Video implements AcoesVideos{
	   //ATRIBUTOS
       private String titulo;
       private int avaliacao;
       private int views;
       private int Curtidas;
       private boolean reproduzindo;
       
       
       //CONSTRUTOR
       public Video(String titulo) {
    	   this.titulo = titulo;
    	   this.avaliacao = 1;
    	   this.views = 0;
    	   this.setCurtidas(0);
    	   this.setReproduzindo(false);
       }
       
       //METODOS ESPECIAIS     
       public String getTitulo() {
    	   return titulo;
       }
       public void setTitulo(String titulo) {
    	   this.titulo = titulo;
       }
       public int getAvaliacao() {
    	   return avaliacao;
       }
       public void setAvaliacao(int avaliacao) {
    	   int nova;
    	   nova = (int)((this.avaliacao + avaliacao)/this.views);
    	   this.avaliacao = nova;
       }
       public int getViews() {
    	   return views;
       }
       public void setViews(int views) {
    	   this.views = views;
       }
       public int getCurtidas() {
    	   return Curtidas;
       }
       public void setCurtidas(int curtidas) {
    	   Curtidas = curtidas;
       }
       public boolean getReproduzindo() {
    	   return reproduzindo;
       }
       public void setReproduzindo(boolean reproduzindo) {
    	   this.reproduzindo = reproduzindo;
       }
       
       //SOBREPOSIÇÃO DOS METODOS
       @Override
       public void play() {
    	   this.setReproduzindo(this.getReproduzindo() == true);
       }
       @Override
       public void pause() {
		   this.setReproduzindo(this.getReproduzindo() == false);
       }
       @Override
       public void like() {
		   this.setCurtidas(this.getCurtidas()+1);
       }     
       
       public String status() {
    	   return "\n--------------"+"\nTitulo: " + this.titulo + "\nAvaliação: " + this.avaliacao +
    			   "\nViews: " + this.views + "\nCurtidas: " + this.Curtidas
    			   + "\nReproduzindo: " + this.reproduzindo;
       }
}
