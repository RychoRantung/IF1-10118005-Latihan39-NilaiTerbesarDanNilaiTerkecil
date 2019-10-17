/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan39.nilaiterbesardannilaiterkecil;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan nilai terbesar dan terkecil mahasiswa
 */
public class Nilai {
    private int nilaiTerbesar, nilaiTerkecil,  banyakMahasiswa;
	private	int[] nilaiMahasiswa = new int[10];
	private String namaPetugas;
	Scanner sc = new Scanner(System.in);
	
	public void inputPetugas() {
		System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
		System.out.print("Masukkan Nama Petugas : ");
		namaPetugas = sc.next();
	}
	
	public void inputNilai() {
		
		System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
		banyakMahasiswa = sc.nextInt();
		System.out.print("Masukkan Nilai Mahasiswa Ke-" + 1 + " = " );
		nilaiMahasiswa[0] = sc.nextInt();
		nilaiTerbesar = nilaiMahasiswa[0];
		nilaiTerkecil = nilaiMahasiswa[0];
		for( int i = 1; i < banyakMahasiswa; i++){
			System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = " );
			nilaiMahasiswa[i] =  sc.nextInt();
			if(nilaiMahasiswa[i] > nilaiTerbesar)
				this.nilaiTerbesar = nilaiMahasiswa[i];
			if(nilaiMahasiswa[i] < nilaiTerkecil)
				this.nilaiTerkecil = nilaiMahasiswa[i];
		}
		
	}
	
	public void outputNilai() {
		System.out.println("\n=====Hasil Nilai Mahasiswa=====");
		for( int i = 0; i < banyakMahasiswa; i++){
			System.out.println("Nilai Mahasiswa Ke-" + i + " = " + nilaiMahasiswa[i]);
		
		}
		System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
		System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
	}
    
}
