package ejercicio4;

public class ejercicio4Serie {

	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	final int NUM_TEMPORADAS_BASE = 3;
	final boolean ENTREGADO_BASE = false;
	
	public void Serie() {
		this.titulo = "";
		this.numTemporadas = NUM_TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}

	public void Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = NUM_TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = creador;
	}

	public void Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
}
