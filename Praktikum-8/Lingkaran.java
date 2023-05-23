/*	Nama File: Lingkaran.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	17/05/2023
*/

public class Lingkaran extends BangunDatar
{
	private double jejari;
	
	public Lingkaran(double jejari)
	{
		this.jejari = jejari;
	}
	
	public double hitungKeliling()
	{
		return 2 * jejari * 3.14;
	}
}