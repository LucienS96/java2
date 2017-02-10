public class Materialartikel
{	
	public static void main(String args[])
	{
		materialartikel = Materialartikel.new("artname", "artnr", "einheit", "packgr", "mind", "bestmenge", "bestand");
	}
	
	private String artname;
	private int artnr;
	private String einheit;
	private int packgr;
	private int mind;
	private int bestmenge;
	private int bestand;
	
	public Materialartikel(String artname, int artnr, String einheit, int packgr, int mind, int bestmenge, int bestand)
	{
		this.artname = artname;
		this.artnr = artnr;
		this.einheit = einheit;
		this.packgr = packgr;
		this.mind = mind;
		this.bestmenge = bestmenge;
		this.bestand = bestand;
	}
	
	public void setArtname(String artname){this.artname = artname;}
	public void setArtnr(Integer artnr){this.artnr = artnr;}
	public void setEinheit(String einheit){this.einheit = einheit;}
	public void setPackgr(Integer packgr){this.Packgr = packgr;}
	public void setMind(Integer mind){this.mind = mind;}
	public void setBestmenge(Integer bestmenge){this.bestmenge = bestmenge;}
	public void setBestand(Integer bestand){this.bestand = bestand;}
	
	public String getArtname(){return this.artname;}
	public Integer getArtnr() {return this.artnr;}
	public String getEinheit() {return this.einheit;}
	public Integer getPackgr() {return this.packgr;}
	public Integer getMind() {return this.mind;}
	public Integer getBestmenge() {return this.bestmenge;}
	public Integer getBestand() {return this.bestand;}
}
