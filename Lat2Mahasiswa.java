public class Lat2Mahasiswa extends Lat2Manusia{
	private double hasil;
	
	void dataLat2Mahasiswa(String NIM, String Fakultas, String Jurusan){
		System.out.println("NIM :" + NIM);
		System.out.println("Fakultas: " +Fakultas);
		System.out.println("Jurusan: " +Jurusan);
	}
	
	void nilaiLat2Mahasiswa(double Tugas1, double Tugas2, double Tugas3, double UTS, double UAS){
		hasil=((Tugas1+Tugas2+Tugas3)/3)*0.4 + UTS*0.3+ UAS*0.3;
		System.out.println("Nilai Akhir: "+hasil);
	}
	}