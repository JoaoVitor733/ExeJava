package Aula11;

public abstract class Pessoa {
	    //ATRIBUTOS
        protected String nome;
        protected int idade;
        protected String sexo;
        //METODOS
        
        public void fazerAniver() {
        	this.setIdade(this.getIdade()+1);
        }
        
        //METODOS ESPECIAIS
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		} 
		
		public String status() {
			return "-------------------------" + "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nSexo: " + this.sexo
					+ "\n-------------------------";
		}
	      
      
}
