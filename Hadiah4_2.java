// NO.2

import java.util.Scanner;

class Siswa {
	 String nama,prodi,nim;
	
		void setnama(String namasiswa){
			nama=namasiswa;
		}
		void setjurusan(String prodisiswa){
			prodi=prodisiswa;
		}
		void setnim(String nimsiswa){
		nim=nimsiswa;
		}
		void cetak(){
			System.out.println("Nama saya " +nama +" Prodi saya adalah "
			+prodi +" dan Nim saya " +nim);
		}
}

public class Hadiah4_2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String a,b,c;
		Siswa s;
		s = new Siswa();
		System.out.print("Nama : ");
		a = input.nextLine();
		s.setnama(a);
		System.out.print("Prodi : ");
		b = input.nextLine();
		s.setjurusan(b);
		System.out.print("NIM : ");
		c = input.nextLine();
		s.setnim(c);
	
		s.cetak();
	}
}