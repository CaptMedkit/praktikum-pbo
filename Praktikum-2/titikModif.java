/*	Nama File: titikModif.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	01/03/2023
*/

class Titik
{
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	Titik()
	{
		counterTitik++;
	}
	
	Titik(double a, double o){
		counterTitik++;
		absis=a;
		ordinat=o;
	}
	
	public void setAbsis(double a)
	{
		absis = a;
	}
	
	public void setOrdinat(double o)
	{
		ordinat = o;
	}
	
	public double getAbsis()
	{
		return absis;
	}
	
	public double getOrdinat()
	{
		return ordinat;
	}
	
	public static int getCounterTitik()
	{
		return counterTitik;
	}
}
