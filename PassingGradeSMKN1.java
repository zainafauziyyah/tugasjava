import java.util.Scanner;

public class PassingGradeSMKN1 {
    public static void main (String[] args) {
        int matematika, bhsInggris, bhsIndonesia, ipa;
        int passingGradeSMK, passingGradeSastra, passingGradeTIK;
        boolean isPassingSMK, isPassingSastra, isPassingTIK;
        double averageUjian, averageBahasa;

        Scanner input = new Scanner(System.in);
        passingGradeSMK = 73;
        passingGradeSastra = 75;
        passingGradeTIK = 80;

        System.out.println("Masukan nilai Ujian Matematika :");
        matematika = input.nextInt ();

        System.out.println("Masukan nilai Ujian Bhs.Indonesia :");
        bhsIndonesia = input.nextInt ();

        System.out.println("Masukan nilai Ujian Bhs.Inggris :");
        bhsInggris = input.nextInt ();

        System.out.println("Masukan nilai Ujian IPA :");
        ipa = input.nextInt ();

        averageUjian = (matematika + bhsIndonesia + bhsInggris + ipa)/4;
        averageBahasa = (bhsIndonesia + bhsInggris)/2;

        isPassingSMK = averageUjian >= passingGradeSMK;
        isPassingSastra = averageBahasa >= passingGradeSastra;
        isPassingTIK = matematika > passingGradeTIK;

        System.out.println("\n\nHasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di SMKN 1 adalah sebagai berikut :");
        System.out.println("==========================================================================");
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke SMKN 1 : " + isPassingSMK);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Sastra : " + isPassingSastra);
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Teknik Komputer : " + isPassingTIK);


        










    }
}