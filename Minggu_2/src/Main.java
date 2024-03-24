import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("LATIHAN WOYYY!");

////////HARI 5//////////////////////

        int numb = 10;
        String name = "Yami";
        boolean bendera = true;

        System.out.println(numb);
        System.out.println(name);
        System.out.println(bendera);

        int numbNew;
        numbNew = 100;

        System.out.println(numbNew);

        var umum = 530;
        System.out.println(umum);

        System.out.println("Tadaima");

        //Naming Convention (Aturan Penamaan Java)

        String[] arrVariable = new String[]{"Variable", "camelCase", "fullName"};
        String[] arrClass = new String[]{"Class", "PascalCase", "AddCalculation"};
        String[] arrFunction = new String[]{"Function", "camelCase", "getInformation"};
        String[] arrConstant = new String[]{"Constant", "SCREAM_SNACK_CASE", "FULL_Name"};
        String[] arrENUM = new String[]{"ENUM", "SCREAM_SNACK_CASE", "SOUTH"};
        String[] arrPackage = new String[]{"Package", "lowercase", "modul"};

        System.out.println(Arrays.toString(arrVariable));
        System.out.println(Arrays.toString(arrClass));
        System.out.println(Arrays.toString(arrFunction));
        System.out.println(Arrays.toString(arrConstant));
        System.out.println(Arrays.toString(arrENUM));
        System.out.println(Arrays.toString(arrPackage));

        //Tipe Data
        //Number (Angka)

        byte iniByte = 100; // range nilai -128 hingga 127 dengan size 1 byte

        // 1 byte  = 8 bit

        Byte iniByte1 = 100;
        short iniShort = 1000; // range nilai -32768 hingga 32767 size 2 byte
        int iniInt = 1000000; // range nilai -2M hingga 2M dengan size 4 byte
        long iniLong = 1000000; // range Besar size 8 byte
        long iniLong2 = 1000000L;

        System.out.println(iniByte);
        System.out.println(iniByte1);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);

        //Float

        float iniFloat = 10.12F; //size 4 byte
        double iniDouble = 12.2525; //size 8 byte

        //casting rule: byte<short<int<long<float<double
        //casting otomatis dari kiri ke kanan

        short iniSB = iniByte;
        System.out.println(iniSB);

        //casting manual dari kanan ke kiri

        byte iniBI = (byte) iniInt;
        System.out.println(iniBI);

        //Char
        //Aturan pengetikan char hanya bisa menggunakan petik satu (' '), tidak bisa (" ")

        char charS = 'S';
        char charA = 'A';
        char charU = 'U';
        char charQ = 'Q';
        char charI = 'I';

        //Concat

        System.out.println(charS + "" + charA + charU + charQ + charI); //pengetikan seperti ini berhasil
        System.out.println(charS + charA + charU + charQ + charI); //pengetikan seperti ini adalah datanya

        //Boolean

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        //String: sebuah class, bukan tipe data (non-primitive)

        String nama = "SauqiSan";
        System.out.println(nama);

        //Operator

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Assignment

        int c = 100;
        c = c + 10; //memperbarui nilai c
        System.out.println(c);

        c -= 20; //memperbarui nilai c
        System.out.println(c);

        //Perbandingan

        int value1 = 100;
        int value2 = 100;

        System.out.println("Alarm");
        System.out.print("telolet: ");

        System.out.println("Pengetesan "+(value1 > value2));
        System.out.println(value1 < value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        var lulus1 = lulusAbsen || lulusNilai;
        System.out.println("Anda " + lulus);
        System.out.println("Anda " + lulus1);
        System.out.println("Anda " + !lulus);

        //Membuat Objek Scanner dari class Scanner untuk menerima input dari user

        Scanner scanner = new Scanner(System.in); //bentuk objek java oleh class dri scanner, harus ditampung variabel
        System.out.print("Masukkan nama anda: ");
        String nameNew = scanner.nextLine();

        System.out.print("Masukkan hobby anda: ");
        String hobby = scanner.nextLine();

        System.out.print("Masukkan umur anda: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan alamat KTP anda: ");
        scanner.nextLine();
        String alamat = scanner.nextLine();

        System.out.print("Terakhir, masukkan motto hidup anda: ");
        String motto = scanner.nextLine();

        System.out.println("-------------------------");
        System.out.println("");

        System.out.println("Nama: " + nameNew);
        System.out.println("Hobby: " + hobby);
        System.out.println("Umur: " + (umur));
        System.out.println("Alamat: " + alamat);
        System.out.println("Motto Hidup: " + motto);

        var absenNew = 70;
        var nilaiNew = 80;

        boolean lulusAbsenNew = absenNew >= 75;
        boolean lulusNilaiNew = nilaiNew >= 75;
        String result = "";
        if(absenNew  >= 75){
            if(nilaiAkhir >= 75){
                result = "YEAY, ANDA LULUS!";
            }else{
                result = "Mohon maaf anda tidak lulus!";
            }
        }else if (absenNew  == 0) {
            result = "Enggak niat sekolah";
        }else{
            result = "Mohon maaf anda tidak lulus!";
        }
        System.out.println(result);

        //Switch statement, hanya untuk perbandingan sama dengan (==)

        var nilai = "A";

        switch (nilai){
            case "A" :
                System.out.println("WOW, MENABJUBKAN!!!");
                break;
            case "B" :
                System.out.println("Bagus!");
                break;
            case "C" :
                System.out.println("Cukup");
                break;
            case "D" :
                System.out.println("Try Again ya");
                break;
            default : {
                System.out.println("Better luck next Time");
                break;
            }
        }

        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "WOW, MENABJUBKAN!!!";
            case "B" -> ucapan = "Bagus!";
            case "C" -> ucapan = "Cukup";
            case "D" -> ucapan = "Try Again ya";
            default -> ucapan = "Better luck next Time";
        }

        System.out.println(ucapan);

        String ucapanYield = switch (nilai){
            case "A" : yield "WOW, MENABJUBKAN!!!";
            case "B" : yield "Bagus!";
            case "C" : yield "Cukup";
            case "D" : yield "Try Again ya";
            default : yield "Better luck next Time";
        };

        System.out.println(ucapanYield);

        //Ternary (hanya bisa dua kondisi)

        var nilaiAkh = 80;
        String ucapanTernary = nilaiAkh >= 75 ? "Selamat, Anda Lulus!" : "Mohon maaf, Anda belum lulus";
        System.out.println(ucapanTernary);

        var newTer = nilaiAkh == 100 ? "Nyontoh ya?" : "Belajar gak?!!!";
        System.out.println(newTer);

        System.out.println("UPDATE WOYYY!!!");

        System.out.println("READY TO LOSE, HUH!!!");
        System.out.println("BECAUSE WE WANNA DESTROY UR MENTAL");
        System.out.println("ONCE YOU ACCEPT MY REQUEST, YOU NEVER HAVE A CHANCE TO GO BACK HOME");

        System.out.println("Dont worry, I have huge Power to counter that thing");

    }
}