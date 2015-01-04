package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class ClassRoom {
	private String IdRuang;
	private int Kapasitas;
	private Vector<motor> dtMhs;
	
	public ClassRoom(String IdRuang, int Kapasitas) {
		super();
		dtMhs = new Vector<motor>(getKapasitas());
		this.IdRuang = IdRuang;
		this.Kapasitas = Kapasitas;
	}

	private void add(motor mahasiswa) {
		dtMhs.add(mahasiswa);
	}

	public String getIdRuang() {
		return IdRuang;
	}


	public void setIdRuang(String IdRuang) {
		this.IdRuang = IdRuang;
	}


	public int getKapasitas() {
		return Kapasitas;
	}


	public void setKapasitas(int Kapasitas) {
		this.Kapasitas = Kapasitas;
	}

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ClassRoom m305 = new ClassRoom("M305", 40);
		do {
		System.out.println("menu utama : ");
		System.out.println("1. Masukkan NIM dan Nama Mahasiswa.");
		System.out.println("2. Tampilkan NIM dan Nama Mahasiswa.");
		System.out.println("3. Keluar Dari Program.");
		int pil;
		System.out.print("Masukkan Pilihan Anda : ");
		pil = Integer.parseInt(br.readLine());
		switch (pil)
		{
		case 1 : 
			{
				System.out.println("Berapa mhs yang akan dimasukkan : ");
				int jumlah = Integer.parseInt(br.readLine());
				for (int x = 0; x < jumlah; x++)
				{
					System.out.println("Data Ke : " + (x+1));
					System.out.print("Masukkan NIM Mahasiswa : ");
					String NIM = br.readLine();
					System.out.print("Masukkan Nama Mahasiswa : ");
					String NAMA = br.readLine();
					m305.add(new motor(NIM,NAMA));
				}
			}
		break;
		case 2 :
			{
				m305.cetakDaftarMhs();
			}
		break;
		case 3 :
			{
				System.out.println("--------------------------------------------------------");
				System.out.println("=====   Trimakasih Telah Menggunakan Program Ini   =====");
				System.out.println("===== Copyright 2014 <Panji Pratama> IBIS Surabaya =====");
				System.out.println("--------------------------------------------------------");
				System.exit(0);
			}
		break;
		}
	}while (true);
		
	}
	
	public void cetak ()
	{
		System.out.println("Kode Ruang " + IdRuang);
		System.out.println("Kapasitas "+ Kapasitas);
	}
	
	public void cetakDaftarMhs()
	{
		System.out.println("Daftar Mahasiswa dalam Kelas ini : "+IdRuang);
		for (motor mahasiswa:dtMhs)
			System.out.println(mahasiswa);
	}

}
