import java.util.Scanner;

public class Latihan07 {

	public static void main(String[] args) {
		String nama;
		Scanner input = new Scanner(System.in);
		
		System.out.print("silahkan masukan nama anda : ");
		nama = input.nextLine();
		System.out.println(nama.replaceAll("[aiueo]", "X")); 
	}

}