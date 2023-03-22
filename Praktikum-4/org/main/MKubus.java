/*	Nama File: MKubus.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	15/03/2023
*/

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus 
{
    public static void main(String[] args) 
	{
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+kubus.hitungLuasAlas());
        System.out.println("Volume Kubus dengan panjang sisi 4 satuan : "+kubus.hitungVolume());
    }
}