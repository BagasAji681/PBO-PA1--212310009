import java.util.ArrayList;

public class LatihanArrayList {

	public static void main(String[] args) {
		/*
		* penulisan ArrayList
		* ArrayList<dataType> nama_arr = new ArrayList<dataType>();
		*/
		
		ArrayList<Integer> Npm = new ArrayList<Integer>();
		System.out.println(Npm);

				Npm.add(212310023);
				Npm.add(212310024);
				Npm.add(212310025);
				Npm.add(212310026);
				Npm.add(212310027);
				System.out.println("Sebelum Dihapus");
				
				// Select Array
				System.out.println("Sebelum");
				System.out.println("Npm Dibaris Ketiga Adalah " + Npm.get(2));
				
				System.out.println("\nSesudah");
				// Update Array
				Npm.set(2, 212310024);
				System.out.println("Npm Dibaris Ketiga Adalah " + Npm.get(2));
				
				System.out.println("\nSesudah Dihapus");
				// Delete Array
				Npm.remove(1); // Menghapus Satu Index Saja
				System.out.println(Npm);
				
				Npm.clear();
				System.out.println("Sesudah dihapus semua = "); // Menghapus Keseluruhan Data Di Dalam Array 
				
	}

}