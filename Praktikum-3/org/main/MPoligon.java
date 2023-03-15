/*	Nama File: MPoligon.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	01/03/2023
*/

package org.main;

import org.bangundatar.*;

public class MPoligon
{
	public static void main(String[] args)
	{
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());
		
		System.out.println(" ");
		
		Segitiga segitiga = new Segitiga(6,8,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
	}
}