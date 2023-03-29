/*	Nama File: MLingkaran.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	25/03/2023
*/

import java.util.Scanner;

class MLingkaran
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jejari lingkaran: ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		
		System.out.println("Luas bujur sangkar dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
	}
}