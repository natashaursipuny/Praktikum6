import java.util.Scanner;
public class Lat2Aksi{
	public static void main(String args[]){
		String NIK,Nama,JenisKelamin;
		int Umur;
		String NIM,Fakultas,Jurusan;
		double Tugas1,Tugas2,Tugas3;
		double UTS,UAS;
		double hasil;
		
		Lat2Mahasiswa MHS=new Lat2Mahasiswa();
		Scanner SC= new Scanner (System.in);
		
		System.out.println("Masukkan NIK:");
		NIK=SC.nextLine();
		System.out.print("Masukkan Nama anda: ");
		Nama=SC.nextLine();
		System.out.println("Masukkan Jenis Kelamin: ");
		JenisKelamin= SC.nextLine();
		System.out.println("Masukkan Umur");
		Umur= SC.nextInt();
		SC.nextLine();
		System.out.println("Masukkan NIM :");
		NIM = SC.nextLine();
		System.out.println("Masukkan Fakultas:");
		Fakultas=SC.nextLine();
		System.out.println("Masukkan Jurusan:");
		Jurusan=SC.nextLine();
		
		System.out.println("Masukkan TGS1: ");
		Tugas1 = SC.nextDouble();
		System.out.println("Masukkan TGS2: ");
		Tugas2 = SC.nextDouble();
		System.out.println("Masukkan TGS3: ");
		Tugas3 = SC.nextDouble();
		System.out.println("Masukkan UTS: ");
		UTS = SC.nextDouble();
		System.out.println("Masukkan UAS: ");
		UAS = SC.nextDouble();
		
		MHS.identitas(NIK,Nama,JenisKelamin,Umur);
		MHS.dataLat2Mahasiswa(NIM, Fakultas,Jurusan);
		MHS.nilaiLat2Mahasiswa(Tugas1,Tugas2,Tugas3,UTS,UAS);
		
	}
}