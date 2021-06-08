package Aula7;

public class Lutador {
  //ATRIBUTOS
   private String nome;
   private String nacionalidade;
   private int idade;
   private float altura;
   private float peso;
   private String categoria;
   private int vitorias;
   private int derrotas;
   private int empate;
   
   //METODOS
   public void apresentar() {
	  System.out.println("--------------------------");
	  System.out.println("Lutador:" + this.getNome());
	  System.out.println("Origem: " + this.getNacionalidade());
	  System.out.println("Idade: " + this.getIdade() + " anos");
	  System.out.println("Atura:" + this.getAltura() + " m");
	  System.out.println("Pesando: " + this.getPeso() + " kg");
	  System.out.println("Ganhou: " + this.getVitorias());
	  System.out.println("Perdeu: " + this.getDerrotas());
	  System.out.println("Empatou: " + this.getEmpate());
	  
   }
   
   public void status() {
	   System.out.println("--------------------------");
	   System.out.println(this.getNome()); 
	   System.out.println("É um peso: " + this.getCategoria());
	   System.out.println(this.getVitorias() + " Vitorias");
	   System.out.println( this.getDerrotas() + " Derrotas");
	   System.out.println(this.getEmpate() + " Empates");
   }
   
   public void ganharLuta() {
	   this.setVitorias(this.getVitorias() + 1);
   }
   
   public void perderLuta() {
	   this.setDerrotas(this.getDerrotas() + 1);
   }
   
   public void empatarLuta() {
	   this.setEmpate(this.getEmpate() + 1);
   }
   
   public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
	   
	   this.setNome(no);
	   this.setNacionalidade(na);
	   this.setIdade(id);
	   this.setAltura(al);
	   this.setPeso(pe);
	   this.setVitorias(vi);
	   this.setDerrotas(de);
	   this.setEmpate(em);
   }
   
   //METODOS ESPECIAIS
   public String getNome() {
	   return nome;
   }
   
   public void setNome(String m) {
	   this.nome = m;
   }
   
   public String getNacionalidade() {
	   return nacionalidade;
   }
   
   public void setNacionalidade(String n) {
	   this.nacionalidade = n;
   }
   
   public int getIdade() {
	   return idade;
   }
   
   public void setIdade(int q) {
	   this.idade = q;
   }
   
   public float getAltura() {
	   return altura;
   }
   
   public void setAltura(float a) {
	   this.altura = a;
   }
   
   public float getPeso() {
	   return peso;
   }
   
   public void setPeso(float p) {
	   this.peso = p;
	   this.setCategoria();
   }

   public String getCategoria() {
	   return categoria;
   }

   private void setCategoria() {
	   if(this.peso< 52.2) {
		   this.categoria = "Invalido";		   
	   }else if(this.peso <= 70.3) {
			  this.categoria = "Leve";			   		
	   }else  if(this.peso <= 83.9) {
			  this.categoria = "Medio";
	   }else if(this.peso <= 120.2) { 
		     this.categoria = "Pesado";
	   }else {
		   this.categoria = "Invalido";
		      }
	  }
	
 

   public int getVitorias() {
	   return vitorias;
   }

   public void setVitorias(int vitorias) {
	   this.vitorias = vitorias;
   }

   public int getDerrotas() {
	   return derrotas;
   }

   public void setDerrotas(int derrotas) {
	   this.derrotas = derrotas;
   }

   public int getEmpate() {
	   return empate;
   }

   public void setEmpate(int empate) {
	   this.empate = empate;
   }
   
}
