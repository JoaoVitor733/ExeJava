package aula5;

public class Conta {
    public int NumConta; //Atributos
    protected String Tipo;
    private String Dono;
    private float Saldo;
    private boolean Status ;
    
    public void StatusAtual() {
    	System.out.println("----------------------");
    	System.out.println("Numero da conta: " + this.getNumConta());
    	System.out.println("Tipo da conta: " + this.getTipo());
    	System.out.println("Dono: " + this.getDono());
    	System.out.println("Saldo: " + this.getSaldo());
    	System.out.println("Status: " + this.getStatus());
    }
    
    public void AbrirConta(String n) {  //Metodos
    	this.setStatus(true);
    	this.setTipo(n);
    	 if(this.Tipo == "CC") {
    		 this.setSaldo(50);
    	 }else {
    		 if(this.Tipo == "CP") {
    			this.setSaldo(150);
    		 }
    	 }
     }
    
    public void FecharConta() {
      if(this.getSaldo() == 0) { 
    	  this.setStatus(false);
      }else {
    	  System.out.println("Impossivel fechar conta, pois o saldo precisa ser de R$ 0");
      }
    }
    
    
    public void Depositar(float m) {
    	if(this.getStatus()) {
    		this.setSaldo(getSaldo()+m);
    	}else {
    		System.out.println("Para depositar dinheiro você precisa ter conta");
    	}
    }
    
    public void Sacar(float n) {
      if(this.getStatus() && n <= this.getSaldo()) {
    	  this.setSaldo(getSaldo()-n);     	  
      }else {
    	  System.out.println("O valor do saque e maior que o saldo ou a conta não estar aberta");
      }
    }
    
    public void PagarMensal() {
       if(this.getStatus()){
	    	if(this.getTipo() == "CC") {
	    		this.setSaldo(getSaldo()-12);  
	    	}else {
	    		if(this.getTipo() ==  "CP") {
	    			this.setSaldo(getSaldo()-20);  
	    		}
	    	}
       }
    }

    public Conta() { //construtor
    	this.setStatus(false);
    	this.setSaldo(0);
    }
    
	public int getNumConta() { //Metodos especiais
		return NumConta;
	}

	public void setNumConta(int numConta) {
		NumConta = numConta;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getDono() {
		return Dono;
	}

	public void setDono(String dono) {
		Dono = dono;
	}

	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float saldo) {
		Saldo = saldo;
	}

	public boolean getStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
     
}
