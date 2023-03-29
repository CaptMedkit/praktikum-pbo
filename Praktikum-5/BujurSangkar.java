/*	Nama File: BujurSangkar.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	25/03/2023
*/

public class BujurSangkar extends BangunDatar
{
	/*Jika BujurSangkar tidak membuat implementasi metode abstrak hitungLuas(double sisi) maka  
	akan terjadi error saat compile karena BangunDatar.java merupakan abstrak yang di dalamnya terdapat
	metode yang harus diimplementasikan ke BujurSangkar.java*/
	public double hitungLuas(double sisi)
	{
		luas = sisi * sisi;
		return luas;
	}
}