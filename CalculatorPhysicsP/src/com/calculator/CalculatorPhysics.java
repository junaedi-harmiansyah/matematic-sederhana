package com.calculator;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Ikhsan, Sobirin, dan Junaedi 25 April 20120 membuat aplikasi berbasis
 *         operasi matematika sederhana
 */
public class CalculatorPhysics {

	public static void main(String[] args) throws SQLException {
		// pembuatan objek baru concepToDB untuk memangil method/fungsi di kelas
		// PhysicsConcepBL
		PhysicsConcepBL concepToDB = new PhysicsConcepBL();
		// fungsi di dalam kelas PhysicsConcepBL
		concepToDB.selecetBuku();
		concepToDB.insertBuku();
		concepToDB.deleteBuku();
		concepToDB.updateBuku();

		// pembuatan objek baru physicscConcep untuk mengakses fungsi di dalam kelas
		// PhysicscConcep
		PhysicscConcep physicscConcep = new PhysicscConcep();
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan nilai A");
		float scanA = scan.nextFloat();
		System.out.println("Masukan nilai B");
		float scanB = scan.nextFloat();
		System.out.println("Mohon pilih jenis operasi yang digunakan");
		System.out.println(" Pengurangan = 1 |atau| Penjumlahan = 2 |atau| Perkalian = 3 |atau| Pembagian = 4");
		System.out.println();
		System.out.println(" Masukan key operasi 1 atau 2 atau 3 atau 4 ");
		Integer scanPilih = scan.nextInt();

		switch (scanPilih) {
		case 1:
			physicscConcep.minus(scanA, scanB);
			break;
		case 2:
			physicscConcep.jumlah(scanA, scanB);
			break;
		case 3:
			physicscConcep.kali(scanA, scanB);
			break;
		case 4:
			physicscConcep.bagi(scanA, scanB);
			break;
		default:
			break;
		}

	}

}
