package ktp.sederhana;
import java.util.Scanner;
public class KTPSederhana {
public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     String nama, alamat, kecamatan, kelurahanDesa, tempatLahir, jenisKelamin, agama, status, kewarganegaraan, pekerjaan, golonganDarah;
     int nomorInduk, tanggalLahir, bulanLahir, tahunLahir, rt, rw;
     
     System.out.println("------PROGRAM KTP SEDERHANA------");
     //Input
     System.out.print("Masukkan nama lengkap anda        : ");
     nama = input.nextLine();
     
     System.out.print("Masukkan tempat lahir anda        : ");
     tempatLahir = input.nextLine();
     
     System.out.print("Masukkan jenis kelamin anda       : ");
     jenisKelamin = input.nextLine();
     
     System.out.print("Masukkan agama anda               : ");
     agama = input.nextLine();
     
     System.out.print("Masukkan Status Perkawinan anda   : ");
     status = input.nextLine();
     
     System.out.print("Masukkan kewarganegaraan anda     : ");
     kewarganegaraan = input.nextLine();
     
     System.out.print("Masukkan pekerjaan anda           : ");
     pekerjaan = input.nextLine();
     
     System.out.print("Masukkan Golongan darah anda      : ");
     golonganDarah = input.nextLine();
    
     System.out.print("Masukkan Alamat anda              : ");
     alamat = input.nextLine();
     
     System.out.print("Masukkan kelurahan atau desa anda : ");
     kelurahanDesa = input.nextLine();
     
     System.out.print("Masukkan kecamatan anda           : ");
     kecamatan = input.nextLine();
     
     System.out.print("Masukkan RT anda                  : ");
     rt = input.nextInt();
     
     System.out.print("Masukkan RW anda                  : ");
     rw = input.nextInt();
     
     System.out.print("Masukkan Nomor induk anda         : ");
     nomorInduk = input.nextInt();
     
     System.out.print("Masukkan Tanggal lahir anda       : ");
     tanggalLahir = input.nextInt();
     
     System.out.print("Masukkan bulan kelahiran anda     : ");
     bulanLahir = input.nextInt();
     
     System.out.print("Masukkan Tahun Lahir anda         : ");
     tahunLahir = input.nextInt();
     //Output
     System.out.println("_________________________");
     System.out.println("-------KTP SEDERHANA-------");
     System.out.println("Nomor Induk              : "+nomorInduk);
     System.out.println("Nama Lengkap             : "+nama);
     System.out.println("Tempat dan Tanggal Lahir : "+tempatLahir+", "+tanggalLahir+"-"+bulanLahir+"-"+tahunLahir);
     System.out.println("Jenis Kelamin            : "+jenisKelamin+"               Gol. Darah : "+golonganDarah);
     System.out.println("Alamat                   : "+alamat);
     System.out.println("    RT/RW                : "+rt+"/"+rw);
     System.out.println("    Kel/Desa             : "+kelurahanDesa);
     System.out.println("    Kecamatan            : "+kecamatan);
     System.out.println("Agama                    : "+agama);
     System.out.println("Status Perkawinan        : "+status);
     System.out.println("Pekerjaan                : "+pekerjaan);
     System.out.println("Kewarganegaraan          : "+kewarganegaraan);
     System.out.println("Berlaku Hingga           : Seumur Hidup");
     
    }
   
}
