import java.util.Scanner;

public class JobVacancy {
    public static void main (String[] args) {
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner(System.in);

        System.out.println ("Selamat datang di PT. Anagata");
        System.out.println("====================================\n");
        System.out.println("Silahkan Input Data Diri Anda");
        
        System.out.println("Nama : ");
		nama = input.next();

        System.out.println("Umur : ");
	    umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita):") ; 
		jenisKelamin = input.next();

		System.out.println("Lulusan (SMK/D3/S1) : ");
		lulusan = input.next();

		System.out.println("Pengalaman : "); 
		pengalaman = input.nextInt(); 

		System.out.println("Penampilan : "); 
		penampilan = input.nextDouble();

        //Pengecekan data untuk persyaratan Koordinator
        /*
            1. Persyaratan Coordinator:
            Pria
            Umur minimal 21 tahun dan maksimal 30 tahun.
            Lulusan SMK/D3
            Memiliki pengalaman minimal 2 Tahun

            Atau

            Pria
            Umur 30 tahun keatas
            Lulusan S1
            Memiliki pengalaman minimal 5 Tahun.
            */
           //Persyaratan Koordinator 1
           reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 &&  (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;

           //Persyaratan Koordinator 2
           reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 &&  lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

           //Hasil dari Koordinator
           isPassingKoor = reqKoor1 || reqKoor2;

           //Pengecekan data untuk persyaratan Admin
        /*
            2. Persyaratan Admin:
            Wanita
            Umur minimal 20 tahun dan maksimal 25 tahun.
            Lulusan D3
            Memiliki Penampilan yang Menarik atau Pengalaman minimal 1 Tahun.

            Atau

            Wanita
            Umur diatas 25 tahun.
            Lulusan S1
            Memiliki pengalaman minimal 3 Tahun.
            */
           //Persyaratan Admin 1
            reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);

            reqAdmin2 = jenisKelamin.equalsIgnoreCase ("Wanita") && umur > 25 && lulusan.equalsIgnoreCase ("S1") && penampilan >= 8.5 && pengalaman >= 3;

            //Hasil Output Text Hasil
            isPassingAdmin = reqAdmin1 || reqAdmin2;

            System.out.println();
            System.out.println(nama+ ", Terima kasih sudah mengikuti Lowongan Kerja di PT. Anagata.\n");
            System.out.println("Berikut adalah hasil dari Rekrutment untuk Koordinator dan Admin :");
            System.out.println("Hasil Kelulusan untuk Koordinator : " + isPassingKoor); 
            System.out.println("Hasil Kelulusan untuk Admin : " + isPassingAdmin);



    }
}