/*	Nama File: BangunDatarGeneric.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	17/05/2023
*/

public class BangunDatarGeneric <TT extends BangunDatar>
{
	private TT bangunDatar;
	
	public void set(TT tipeBangunDatar)
	{
		bangunDatar = tipeBangunDatar;
	}
	
	public TT get()
	{
		return bangunDatar;
	}
	
	public double hitungKeliling()
	{
		return bangunDatar.hitungKeliling();
	}
}

/* Mengubah karakter 'T' menjadi 'TT' dalam kelas BangunDatarGeneric tidak akan mengubah output code, karena
   karakter yang digunakan hanya sebagai nama variabel.