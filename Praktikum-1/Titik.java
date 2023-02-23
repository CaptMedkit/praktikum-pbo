class Titik
{
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik()
	{
		counterTitik++;
	}
	
	Titik(double a, double o){
		counterTitik++;
		absis=a;
		ordinat=o;
	}
	
	void setAbsis(double a)
	{
		absis = a;
	}
	
	void setOrdinat(double o)
	{
		ordinat = o;
	}
	
	double getAbsis()
	{
		return absis;
	}
	
	double getOrdinat()
	{
		return ordinat;
	}
	
	static int getCounterTitik()
	{
		return counterTitik;
	}
}
