package ejercicio3;

public class ejercicio3Electrodomestico {
	

	final int PRECIO_BASE = 100;
	final String COLOR_BASE = "Blanco";
	final char CONSUMO_BASE = 'F';
	final double PESO_BASE = 5;
	
	protected double precioBase = PRECIO_BASE;
	protected String color = COLOR_BASE;
	protected char consumoEnergetico = CONSUMO_BASE;
	protected double peso = PESO_BASE;
	
	public void electrodomestico() {
	
	}

	public void Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public void Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		comprobarColor(color);
		this.precioBase = precioBase;
		this.peso = peso;
		
	}
	
	
	public void comprobarColor(String color) {
		color=color.toLowerCase();
		if (color == "blanco" || color == "negro"  || color == "rojo"  || color == "azul"  || color == "gris") {
			this.color = color;
		} else {
			color = COLOR_BASE;
		}
	}
	
	
	
}
