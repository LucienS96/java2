public class Materialartikel
{	
	public static void main(String args[])
	{
		Materialartikel = Materialartikel.new("Artname", "Artnr", "Einheit", "Packgr", "Mind", "Bestmenge", "Bestand");
	}
	
	private String Artname;
	private int Artnr;
	private String Einheit;
	private int Packgr;
	private int Mind;
	private int Bestmenge;
	private int Bestand;
	
	public Materialartikel(String Artname, int Artnr, String Einheit, int Packgr, int Mind, int Bestmenge, int Bestand)
	{
		this.Artname = Artname;
		this.Artnr = Artnr;
		this.Einheit = Einheit;
		this.Packgr = Packgr;
		this.Mind = Mind;
		this.Bestmenge = Bestmenge;
		this.Bestand = Bestand;
	}
	
	public void setArtname(String Artname){this.Artname = Artname;}
	public void setArtnr(Integer Artnr){this.Artnr = Artnr;}
	public void setEinheit(String Einheit){this.Einheit = Einheit;}
	public void setPackgr(Integer Packgr){this.Packgr = Packgr;}
	public void setMind(Integer Mind){this.Mind = Mind;}
	public void setBestmenge(Integer Bestmenge){this.Bestmenge = Bestmenge;}
	public void setBestand(Integer Bestand){this.Bestand = Bestand;}
	
	public String getArtname(){return this.Artname;}
	public Integer getArtnr() {return this.Artnr;}
	public String getEinheit() {return this.Einheit;}
	public Integer getPackgr()	{return this.Packgr;}
	public Integer getMind() {return this.Mind;}
	public Integer getBestmenge() {return this.Bestmenge;}
	public Integer getBestand() {return this.Bestand;}
}
