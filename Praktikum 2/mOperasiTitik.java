/*	Nama File: mOperasiTitik.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	01/03/2023
*/
class MOperasiTitik
{
	public static void main(String[] args)
	{
		Titik t1;
		Titik t2;
		Titik t3;
		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik();
		
		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
		t2.setAbsis(3.0);
		t2.setOrdinat(4.0);
		t3.setAbsis(5.0);
		t3.setOrdinat(6.0);
		int counterTitik = t1.getCounterTitik();
		System.out.println("Jumlah titik = "+counterTitik);
		System.out.println("t1 = ("+t1.getAbsis()+", " +t1.getOrdinat() + ")");
		System.out.println("t1 = ("+t2.getAbsis()+", " +t2.getOrdinat() + ")");
		System.out.println("t1 = ("+t3.getAbsis()+", " +t3.getOrdinat() + ")");

		OperasiTitik op = new OperasiTitik();
		op.refleksiX(t1);
		System.out.println("t1 setelah refleksi sumbu X = "+ t1.getAbsis() + ", " + t1.getOrdinat());
		op.refleksiY(t1);
		System.out.println("t1 setelah refleksi sumbu Y = "+ t1.getAbsis() + ", " + t1.getOrdinat());
		
		op.refleksiX(t2);
		System.out.println("t1 setelah refleksi sumbu X = "+ t2.getAbsis() + ", " + t2.getOrdinat());
		op.refleksiY(t2);
		System.out.println("t1 setelah refleksi sumbu Y = "+ t2.getAbsis() + ", " + t2.getOrdinat());
		
		op.refleksiX(t3);
		System.out.println("t1 setelah refleksi sumbu X = "+ t3.getAbsis() + ", " + t3.getOrdinat());
		op.refleksiY(t3);
		System.out.println("t1 setelah refleksi sumbu Y = "+ t3.getAbsis() + ", " + t3.getOrdinat());
	}
}