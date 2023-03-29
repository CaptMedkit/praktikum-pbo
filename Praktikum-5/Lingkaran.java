/*	Nama File: Lingkaran.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	25/03/2023
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea
{
	private double jejari;
	
	public Lingkaran(double r)
	{
		jejari = r;
	}
	
	public double hitungLuas()
	{
		return PI * jejari * jejari;
	}
}