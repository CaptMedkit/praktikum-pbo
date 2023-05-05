/*	Nama File: Programmer.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	03/05/2023
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: " + this.bonus);
    }
}
