/*	Nama File: Manajer.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	03/05/2023
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + this.tunjangan);
    }
}
