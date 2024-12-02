package datamahasiswa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Datamahasiswa {
    public static void main(String[] args) {
        List<mahasiswa> datamahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Tambah Mahasiswa (y/n):");
            String jawaban = input.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Nama Mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Jenis kelamin: ");
            String jenis = input.nextLine();
            System.out.print("Umur Maryawan: ");
            int umur = input.nextInt();
            input.nextLine();
            karyawanbaru karyawan = new mahasiswa (nama, jenis, umur);
            datamahasiswa.add(mahasiswa);
        }
        System.out.println("Daftar karyawan:");
        for (datamahasiswa mahasiswa : mahasiswa) {
            System.out.println(mahasiswa);
        }
    }
}

