package network;

public class motor {

	public motor(String nim, String nama) {
		// TODO Auto-generated constructor stub
		this.nim=nim;
		this.nama=nama;
	}
	
	private String nim;
	private String nama;
	
	public String getNim() {
		return nim;
	}
	
	public String getNama() {
		return nama.toUpperCase();
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String toString()
	{
		return getNim()+"\t"+getNama();
	}
}
