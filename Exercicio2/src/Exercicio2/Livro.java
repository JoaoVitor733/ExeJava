package Exercicio2;

public class Livro implements Publicacao{
	//ATRIBUTOS
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//METODOS
	public void detalhes() {
		System.out.println("Titulo: " + this.getTitulo() + "\nAutor: " + this.getAutor()
		                   + "\nTotal de páginas: " + this.getTotPaginas() + "\nPágina atual: " 
		                   + this.getPagAtual() + "\nAberto: " + this.getAberto() + "\nLeitor: " + this.leitor.getNome()
		                   + "\nIdade: " + this.leitor.getIdade() + "\nSexo: " + this.leitor.getSexo());
	}
	
	
	//METODOS ESPECIAIS
	public Livro(String t, String a, int tot, Pessoa l) {
		this.setTitulo(t);
		this.setAutor(a);
		this.setTotPaginas(tot);
		this.setLeitor(l);
		this.aberto = false;
		this.pagAtual = 0;
	}
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getTotPaginas() {
		return totPaginas;
	}



	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}



	public int getPagAtual() {
		return pagAtual;
	}



	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}



	public boolean getAberto() {
		return aberto;
	}



	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}



	public Pessoa getLeitor() {
		return leitor;
	}



	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}



	//METODOS DA INTERFACE
	@Override
	public void abrir() {
		this.aberto = true;
	}
	@Override
	public void fechar() {
		this.aberto = false;	
	}
	@Override
	public void folhear(int p) {
	  if(this.pagAtual + p <= this.getTotPaginas() && p >= 0)
		this.pagAtual = this.pagAtual + p;	
	}
	@Override
	public void avancarPag() {
	 if(this.pagAtual + 1 <= this.getTotPaginas())
		this.pagAtual++;	
	}
	@Override
	public void voltarPag() {
	  if(this.pagAtual - 1 >= 0)
		this.pagAtual--;	
	}
	
}
