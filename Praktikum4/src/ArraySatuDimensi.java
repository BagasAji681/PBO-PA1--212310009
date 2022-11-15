
public class ArraySatuDimensi {

	public static void main(String[] args) {
		/* data[] var;
		* datatype arr[];
		*/
		int[] Npm = {
				212310021, //0
				212310022, //1
				212310023, //2
				212310024, //3
				212310025, //4
						
		};
		System.out.println(Npm[1]); //212310022
		
		for(int i =0; i < 5; i++) {
			System.out.println("Data ke-" + i + " " + Npm[i]);
		} String nama[] = {
				"Anyone",
				"Bagas",
				"kamu baik baik saja?",
				"lagi apa",
				"Kenapa?",
		};
		System.out.println("Nama Pertama Adalah " + nama[0]);
		
		for(int i = 0; i < nama.length; i++) {
			System.out.println("Nama ke -" + i + " Adalah " + nama[i]);
		}

	}

}