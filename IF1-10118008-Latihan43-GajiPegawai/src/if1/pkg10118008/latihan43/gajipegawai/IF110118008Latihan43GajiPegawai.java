/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class IF110118008Latihan43GajiPegawai {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner sc = new Scanner(System.in);
		System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
		System.out.println("--------------------------");
		GajiPegawai gp = new GajiPegawai();
		System.out.print("Nama Karyawan: ");
		gp.setNama(sc.nextLine());
		System.out.print("Alamat: ");
		gp.setAlamat(sc.nextLine());
		System.out.print("Uang Transport: Rp.");
		gp.setUangTransport(sc.nextInt());
		System.out.print("Uang Tunjangan: Rp.");
		gp.setUangTunjangan(sc.nextInt());
		System.out.print("Gaji Pokok: Rp.");
		gp.setGajiPokok(sc.nextInt());
		gp.setTotalGaji(gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok()));
		System.out.println("Total Gaji: Rp." + gp.getTotalGaji());
		
		
	}
	
}
