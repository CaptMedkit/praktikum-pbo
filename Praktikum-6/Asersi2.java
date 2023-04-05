/*	Nama File: Asersi2.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	29/03/2023
*/

class Lingkaran
{
	private double jariJari;
	public Lingkaran(double jariJari)
	{
		this.jariJari = jariJari;
	}
	public double hitungKeliling()
	{
		double keliling = 2 * Math.PI * jariJari;
		return keliling;
	}
}

public class Asersi2
{
	public static void main (String[] args)
	{
		double jariJari = 0;
		assert(jariJari > 0): "jari-jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling lingkaran = " + kelilingLingkaran);
	}
}

/* Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
   Secara konsep, Asersi 2 sudah tepat namun penggunaan pesan asersi kurang tepat.
   Pesan yang dikeluarkan ketika jariJari bernilai = 0 adalah "jari-jari tidak boleh nol!!!",
   pesan "jari-jari harus bernilai positif!!!" akan lebih realistis.
 */