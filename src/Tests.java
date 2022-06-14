import javax.swing.JOptionPane;

public class Tests {
	
	static int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0;
	
	//Pie katra jautājuma tiek salīdzinātas lietotāja ievadītās vērtības pēc kā programma turpina ar atkārtošanu vai turpinājumu
	//uz nākamo jautājumu
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
		}else p5 = 1; j5();
	}
	static void j6() {
		String sestais;
		sestais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(sestais) == 1) {
			j7();
		}else p6 = 1; j6();
	}
	static void j7() {
		String septitais;
		septitais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(septitais) == 1) {
			j8();
		}else p7 = 1; j7();
	}
	static void j8() {
		String astotais;
		astotais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(astotais) == 1) {
			j9();
		}else p8 = 1; j8();
	}
	static void j9() {
		String devitais;
		devitais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(devitais) == 1) {
			j10();
		}else p9 = 1; j9();
	}
	static void j10() {
		String desmitais;
		desmitais = JOptionPane.showInputDialog("1. Kāds ir tavs vārds || 1 - Rudolfs || 2 - Arturs || 3 - Kaspars");
		if(Integer.parseInt(desmitais) == 1) {
			aprekins();
		}else p10 = 1; j10();
	}
	
	static void aprekins() {
		//Iegūstot skaitļus no jautājumiem kuri atbildēti nepareizi tiek aprēķināts uz cik jautājumiem lietotājs atbildējis pareizi
		//neatkārtojot tā paša jautājuma atbildēšanu
		int rez = 10 - (p1+p2+p3+p4+p5+p6+p7+p8+p9+p10);
		 JOptionPane.showMessageDialog(null, "Izpildot testu ar pirmo reizi pareizi atbildēji uz "+rez+" jautājumiem");
		 System.exit(0);
	}

	public static void main(String[] args) {
		
		//Programma tiek startēta pēc kā tiek dota izvēle vai lietotājs vēlas pildīt testu, pēc kā sākas programmas darbība
		String izvele;
		
		izvele = JOptionPane.showInputDialog("Sveiks, lai turpinātu uz testu ievadi 1, lai apturētu programmu ievadi 2");
		Integer.parseInt(izvele);
		
		if(Integer.parseInt(izvele) == 1) {
				j1();
			}
	}

}
