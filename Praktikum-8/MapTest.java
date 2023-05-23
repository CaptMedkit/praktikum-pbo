/*	Nama File: MapTest.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	17/05/2023
*/

import java.util.*;

public class MapTest
{
	public static void main(String[] args)
	{
		//kunci -> integer, nilai-> String
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//menempatkan elemen kunci dan nilai
		map.put(1, "Satu");
		map.put(2, "Dua");
		
		//mengambil elemen pertama
		System.out.println(map.get(1));
		
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> key = map.keySet();
	}
}