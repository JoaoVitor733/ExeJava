package ProjetoFinal;

public class Gafanhoto extends Pessoa{
	
	//ATRIBUTOS
	  protected String login;
	  protected int totAssistido;
	  
	  //CONSTRUTOR
	  public Gafanhoto(String nome, int idade, String sexo, String login) {
			super(nome, idade, sexo); //SUPERCLASSE
			this.login = login;
			this.totAssistido = 0;
			
	   }
	  
	  //METODOS 
	  public void viuMaiusUm() {
		  this.totAssistido++;
	  }
	  
	  //METODOS ESPECIAIS
	  public String getLogin() {
		  return login;
	  }
	  
	  public void setLogin(String l) {
		  this.login = l;
	  }
	  
	  public int getTotAssistido() {
		  return totAssistido;
	  }
	  
	  public void setTotAssistido(int t) {
		  this.totAssistido = t;
	  }
	  
	  @Override
	  public String status() {
		  return "\n---------------"+super.status() + "\nLogin: " + this.login + "\nAssistido: " + this.totAssistido;
	  }

}
