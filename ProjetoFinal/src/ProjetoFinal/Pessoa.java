package ProjetoFinal;

public abstract class Pessoa {
	    //ATRIBUTOS
	    protected String nome;
	    protected int Idade;
	    protected String sexo;
	    protected int experiencia;
	  
	    //CONSTRUTOR
	    public Pessoa(String nome, int idade, String sexo){
	    	this.nome = nome;
	    	this.Idade = idade;
	    	this.sexo =  sexo;
	    	this.experiencia = 0;
	    	
	    }
	    //METODOS
	    protected void ganharExperiencia() {
		    this.experiencia++;
	    }

	    //METODOS ESPECIAS
		public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public int getIdade() {
			return Idade;
		}
	
		public void setIdade(int idade) {
			Idade = idade;
		}
	
		public String getSexo() {
			return sexo;
		}
	
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
	
		public int getExperiencia() {
			return experiencia;
		}
	
		public void setExperiencia(int experiencia) {
			this.experiencia = experiencia;
		}
		
		
		public String status() {
			return "\nNome: " + this.nome + "\nIdade: " + this.Idade + "\nSexo: "
		   +this.sexo + "\nExperiência: " + this.experiencia; 
		}
}
