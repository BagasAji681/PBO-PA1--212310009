import java.util.Scanner;

public class Latihan_03 {
	public static void main(String[] args) {
		int pilih;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menu Nyarap:");
		System.out.println("1. ketoprak");
		System.out.println("2. mie ayam");
		System.out.println("3. baso");
		System.out.print("Masukkan Pilihan = ");
		pilih = input.nextInt();
		input.close();
		
		if (pilih == 1) {
			System.out.println("Anda memesan ketoprak dengan harga Rp\r\n"
					+ "10.000,-");
		}else if (pilih == 2) {
			System.out.println("“Anda memesan mie ayam dengan harga Rp15.000,-");
		}else if (pilih == 3) {
			System.out.println("“Anda memesan baso dengan harga Rp 15.000,-");
		}else {
			System.out.println("Maaf menu yang anda pesan salah.");
		}
	}
}