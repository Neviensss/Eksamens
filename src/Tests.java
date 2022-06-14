import javax.swing.JOptionPane;

public class Tests {
	
	static int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0;
	
	
	static void j1() {
		String pirmais;
		pirmais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Niks || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(pirmais) == 1) {
			j2();
		}else p1 = 1; j1();
	}
	
	static void j2() {
		String otrais;
		otrais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Daniels || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(otrais) == 1) {
			j3();
		}else p2 = 1; j2();
	}
	static void j3() {
		String tresais;
		tresais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(tresais) == 1) {
			j4();
		}else p3 = 1; j3();
	}
	static void j4() {
		String ceturtais;
		ceturtais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(ceturtais) == 1) {
			j5();
		}else p4 = 1; j4();
	}

	static void j5() {
		String piektais;
		piektais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(piektais) == 1) {
			j6();
		}else p4 = 1; j5();
	}
	static void j6() {
		String sestais;
		sestais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(sestais) == 1) {
			j7();
		}else p4 = 1; j6();
	}
	static void j7() {
		String septitais;
		septitais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(septitais) == 1) {
			j8();
		}else p4 = 1; j7();
	}
	static void j8() {
		String astotais;
		astotais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(astotais) == 1) {
			j9();
		}else p4 = 1; j8();
	}
	static void j9() {
		String devitais;
		devitais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(devitais) == 1) {
			j10();
		}else p4 = 1; j9();
	}
	static void j10() {
		String desmitais;
		desmitais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(desmitais) == 1) {
			aprekins();
		}else p4 = 1; j10();
	}
	
	static void aprekins() {
		//Tiks aprēķināti punkti
	}

	public static void main(String[] args) {
		String izvele;
		
		izvele = JOptionPane.showInputDialog("Sveiks, lai turpinātu uz testu ievadi 1, lai apturētu programmu ievadi 2");
		Integer.parseInt(izvele);
		
		if(Integer.parseInt(izvele) == 1) {
				j1();
			}
	}

}
