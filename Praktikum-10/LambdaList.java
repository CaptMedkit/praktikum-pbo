/*	Nama File: LambdaList.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	30/05/2023
*/

import java.util.ArrayList;

public class LambdaList
{
	public static void main(String[] args)
	{
		ArrayList<String> mahasiswaList = new ArrayList<>();
		mahasiswaList.add("Adi");
		mahasiswaList.add("Bambang");
		mahasiswaList.add("Cici");
		mahasiswaList.add("Didi");
		
		mahasiswaList.forEach((nama) -> System.out.println(nama));
	}
}