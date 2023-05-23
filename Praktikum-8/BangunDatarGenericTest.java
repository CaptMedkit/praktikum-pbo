/*	Nama File: BangunDatarGenericTest.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	17/05/2023
*/

public class BangunDatarGenericTest
{
	public static void main(String[] args)
	{
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric <Lingkaran> bdg = new BangunDatarGeneric <Lingkaran>();
		bdg.set(l);
		System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
		System.out.println("Tipe Generic: " + bdg.get().getClass().getName());
	}
}