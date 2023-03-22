/*	Nama File: BujurSangkar.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	15/03/2023
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar (double panjangSisi){
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }

    public double hitungLuas(){
        return panjangSisi * panjangSisi;
    }
}