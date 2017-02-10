public class Materialartikel
{
	public static void main(String args[])
	{
		String Artname[] = args[0];
		int Artnr = Ineger.parseInt(args[1]);
		String Einheit[] = args[2];
		int Packgr = Ineger.parseInt(args[3]);
		int Min = Ineger.parseInt(args[4]);
		int Bestmenge = Ineger.parseInt(args[5]);
		int Bestand = Ineger.parseInt(args[6]);
		
		System.out.println("", +Artname+ " " +Artnr+ " " +Einheit+ " " +Packgr+ " " +Min+ " " +Bestmenge+ " " +Bestand);
	}
	
	void setArtname(String Artname){this.Artname;}
	void setArtnr(Integer Artnr){this.Artnr;}
	void setEinheit(String Einheit){this.Einheit;}
	void setPackgr(Integer Packgr){this.Packgr;}
	void setMin(Integer Min){this.Min;}
	void setBestmenge(Integer Bestmenge){this.Bestmenge;}
	void setBestand(Integer Bestand){this.Bestand;}
	
	String getArtname(){return Artname;}
	Integer getArtnr() {return Artnr;}
	String getEinheit() {return Einheit;}
	Integer getPackgr()	{return Packgr;}
	Integer getMin() {return Min;}
	Integer getBestmenge() {return Bestmenge;}
	Integer getBestand() {return Bestand;}
}