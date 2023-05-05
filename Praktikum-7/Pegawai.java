/*	Nama File: Pegawai.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	03/05/2023
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama: " + this.nama + ", Gaji Pokok: " + this.gajiPokok);
    }
}
