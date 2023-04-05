/*	Nama File: AngkaSial.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	29/03/2023
*/

public class AngkaSial
{
	public void cobaAngka(int angka) throws AngkaSialException
	{
		if(angka == 13)
		{
			throw new AngkaSialException();
		}
		System.out.println(angka + " bukan angka sial");
	}
	
	public static void main(String[] args)
	{
		AngkaSial as = new AngkaSial();
		try
		{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}
		catch(AngkaSialException ase)
		{
			System.out.println(ase.getMessage());
			System.out.println("Hati-hati memasukkan angka");
		}
	}
}

/* Menjawab pertanyaan
   Ketika eksepsi terjadi, apakah baris 12 (di source code ini baris 14) pada AngkaSial.java di atas dieksekusi?
   Ketika terjadi eksepsi maka baris tersebut akan tidak dieksekusi.
  
   Apakah baris 21 (di source code ini baris 24) di atas dieksekusi?
   Baris tersebut dieksekusi ketika kita memanggil method cobaAngka() dan angka 13 diisikan sebagai parameter 
   pada method tersebut.
 */