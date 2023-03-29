/*	Nama File: MBujurSangkar.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	25/03/2023
*/

import java.util.Scanner;

class MBujurSangkar
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar: ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
	}
}