package ejercicio2;

public class ejercicio2Password {
	
	private int longitud = 8;
	private String contraseña="01234567";
	private String caracteres = "abcdefghijklmnopqrstuvwyxzABCDEFGHIJKLMNOPQRSTUVWYXZ0123456789";
	
	public void password() {
		System.out.println(contraseña);
	}
	
	public void password(int longitudP) {
		longitud = longitudP;
		contraseña = "";
		for(int i = 0; i<longitud; i++) {
			int aleatorio = (int)(Math.random()*caracteres.length()-1);
			char caracterAleatorio = caracteres.charAt(aleatorio);
			contraseña += caracterAleatorio;
		}
		System.out.println(contraseña);
	}

}
