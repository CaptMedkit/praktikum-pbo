/*	Nama File: operasiTitik.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	01/03/2023
*/

class OperasiTitik
{
	private void refleksiSumbuX(Titik titik) 
	{
		double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1 * ordinat);
	}
	private void refleksiSumbuY(Titik titik)
	{
		double absis = titik.getAbsis();
		titik.setAbsis(-1 * absis);
	}
	public Titik refleksiX(Titik titik)
	{
		refleksiSumbuX(titik);
		return titik;
	}
	
	public Titik refleksiY(Titik titik)
	{
		refleksiSumbuY(titik);
		return titik;
	}
}
