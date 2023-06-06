/*	Nama File: LambdaHashMap.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	30/05/2023
*/

import java.util.HashMap; 
import java.util.Map; 
 
public class LambdaHashMap{ 
    public static void main(String[] args){ 
        Map<String, String> mahasiswaMap = new HashMap<>(); 
        mahasiswaMap.put("24060121130053", "Vicoriza Ramadhani"); 
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " " + nama)); 
    } 
}