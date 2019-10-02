import java.util.Scanner;
public class nilaimhs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char nilaihuruf;
		String nama;
		double nt1, nt2, nt3, nm, nf;
		double nilairatatugas;
		double na;
		
		System.out.print("Masukan Nama: ");
		nama = in.nextLine();
		System.out.print("Masukan Nilai Tugas 1: ");
		nt1 = in.nextInt();
		System.out.print("Masukan Nilai Tugas 2: ");
		nt2 = in.nextInt();
		System.out.print("Masukan Nilai Tugas 3: ");
		nt3 = in.nextInt();
		System.out.print("Masukan Nilai Mid: ");
		nm = in.nextInt();
		System.out.print("Masukan Nilai Final: ");
		nf = in.nextInt();
		System.out.println();
		
		nilairatatugas =(nt1+nt2+nt3)/3;
		na =(nilairatatugas*0.3)+(nm*0.3)+(nf*0.4);
		
		if(na>=80) {
			nilaihuruf = 'A'; }
			
		else if(na>=60 && na<=79.9) {
			nilaihuruf = 'B'; }
			
		else if(na>=50 && na<=59.9) {
			nilaihuruf = 'C'; }
			
		else if(na>=40 && na<=49.9) {
			nilaihuruf = 'D'; }
			
		else
			{nilaihuruf = 'E'; }
			
		System.out.println("Nama: "+nama);
		System.out.println("Nilai Akhir: "+na);
		System.out.println("Nilai Huruf: "+nilaihuruf);
				
	}
}