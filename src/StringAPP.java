import javax.swing.JOptionPane;
public class StringAPP {

	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);

	}

}
