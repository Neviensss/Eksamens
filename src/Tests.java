import javax.swing.JOptionPane;

public class Tests {
	
	static int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0,p7=0,p8=0,p9=0,p10=0;
	
	//Pie katra jautājuma tiek salīdzinātas lietotāja ievadītās vērtības pēc kā programma turpina ar atkārtošanu vai turpinājumu
	//uz nākamo jautājumu
	static void j1() {
		String pirmais;
		pirmais = JOptionPane.showInputDialog("1. Kura no darbībām izveidota pareizi \n1 - if(20%2==0) System.out.print(Skaitlis ir pāra) \n2 - if(20+2==0) System.out.print(Skaitlis ir pāra) \n3 - if(20/2==0) System.out.print(Skaitlis ir pāra) \n4 - if(20*2==0) System.out.print(Skaitlis ir pāra)?");
		if(Integer.parseInt(pirmais) == 1) {
			j2();
		}else p1 = 1; j1();
	}
	static void j2() {
		String otrais;
		otrais = JOptionPane.showInputDialog("2. Ja a = 8, b = 9 un c = 9, tad izteiksmes (a < b) || (b == c) vērtība ir \n1 - false \n2 - false||true \n3 - true||false \n4 - true");
		if(Integer.parseInt(otrais) == 4) {
			j3();
		}else p2 = 1; j2();
	}
	static void j3() {
		String tresais;
		tresais = JOptionPane.showInputDialog("3. Ja a = -100, tad izteiksmes sqrt(a) vērtība ir \n1 - 0 \n2 - 10 \n3 - nav rezultāta \n4 - 100");
		if(Integer.parseInt(tresais) == 3) {
			j4();
		}else p3 = 1; j3();
	}
	static void j4() {
		String ceturtais;
		ceturtais = JOptionPane.showInputDialog("4. Ja a = 5, b = 5 un c = 3, tad izteiksmes (a <= b) && (b <= c) vērtība ir \n1 - true && false \n2 - true \n3 - false && false \n4 - false");
		if(Integer.parseInt(ceturtais) == 4) {
			j5();
		}else p4 = 1; j4();
	}

	static void j5() {
		String piektais;
		piektais = JOptionPane.showInputDialog("5. Ja a = 10.527, tad izteiksmes round(a) vērtība ir \n1 - 11 \n2 - 10.53 \n3 - 10.52 \n4 - 10");
		if(Integer.parseInt(piektais) == 1) {
			j6();
		}else p5 = 1; j5();
	}
	static void j6() {
		String sestais;
		sestais = JOptionPane.showInputDialog("6. Ja a = 10 un b = 5, tad izteiksmes a==b vērtība ir \n1 - true \n2 - 10 \n3 - false \n4 - 5");
		if(Integer.parseInt(sestais) == 3) {
			j7();
		}else p6 = 1; j6();
	}
	static void j7() {
		String septitais;
		septitais = JOptionPane.showInputDialog("7. Ja a = 6 un b = 4, tad izteiksmes a!=b vērtība ir \n1 - true \n2 - 6 \n3 - false \n4 - 10");
		if(Integer.parseInt(septitais) == 1) {
			j8();
		}else p7 = 1; j7();
	}
	static void j8() {
		String astotais;
		astotais = JOptionPane.showInputDialog("8. Ja a = 10, b = 2, tad izteiksmes min(a,b) vērtība ir \n1 - true \n2 - 10 \n3 - 2 \n4 - false");
		if(Integer.parseInt(astotais) == 3) {
			j9();
		}else p8 = 1; j8();
	}
	static void j9() {
		String devitais;
		devitais = JOptionPane.showInputDialog("9. Ja a = 15, b = 8 un c = 10, tad izteiksmes max(min(a,b),c) vērtība ir \n1 - 10 \n2 - 7 \n3 - 6 \n4 - 8");
		if(Integer.parseInt(devitais) == 2) {
			j10();
		}else p9 = 1; j9();
	}
	static void j10() {
		String desmitais;
		desmitais = JOptionPane.showInputDialog("10. Ja a = 64, tad izteiksmes sqrt(a) vērtība ir \n1 - 8 \n2 - 12 \n3 - 64 \n4 - 5");
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
		j1();
	}

}
