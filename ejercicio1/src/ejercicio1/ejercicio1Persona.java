package ejercicio1;

public class ejercicio1Persona {
	
	final private char hombre = 'H';
	final private char mujer = 'M';

	private String nombre = "";
	private int edad = 0;
	private String dni;
	private char sexo= hombre;
	private double peso =0 ;;
	private double altura = 0;
	
	public void persona() {
		
	}
	
	public void persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public void persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
}
