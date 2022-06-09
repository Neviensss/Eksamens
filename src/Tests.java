import javax.swing.JOptionPane;

public class Tests {

	public static void main(String[] args) {
		String izvele;
		String pirmais;
		
		izvele = JOptionPane.showInputDialog("Sveiks, lai turpinātu uz testu ievadi 1, lai apturētu programmu ievadi 2");
		Integer.parseInt(izvele);
		
		if(Integer.parseInt(izvele) == 1) {
				pirmais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Niks || 2 - Arturs || 3 - Kaspars");
			if(Integer.parseInt(pirmais) == 1) {
			}
			}
	}

}
