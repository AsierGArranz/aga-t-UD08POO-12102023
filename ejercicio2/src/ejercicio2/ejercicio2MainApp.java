package ejercicio2;

import javax.swing.JOptionPane;

public class ejercicio2MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto_longitudP = JOptionPane.showInputDialog("Como de larga quieres la contraseña? ");
		int longitudP = Integer.parseInt(texto_longitudP);
		
		
		ejercicio2Password password1 = new ejercicio2Password();
		ejercicio2Password password2 = new ejercicio2Password();
		
		password1.password();
		
		password2.password(longitudP);
	}

	
}
