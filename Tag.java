public class Tag
{
	public static void main(String args[])
	{
		int tage = Integer.parseInt(args[0]);
		int monat = Integer.parseInt(args[1]);
		int jahr = Integer.parseInt(args[2]);
		int tagemonat;
		int erg;
		
		if ((jahr % 4) == 0 && (jahr % 400) == 0 && (jahr % 100) != 0)
		{
			switch (monat){
			case 1: tagemonat = 0; break;
			case 2: tagemonat = 31; break;
			case 3: tagemonat = 60; break;
			case 4: tagemonat = 91; break;
			case 5: tagemonat = 121; break;
			case 6: tagemonat = 152; break;
			case 7: tagemonat = 182; break;
			case 8: tagemonat = 213; break;
			case 9: tagemonat = 244; break;
			case 10: tagemonat = 274; break;
			case 11: tagemonat = 305; break;
			case 12: tagemonat = 335; break;
			}
		}
		else
		{
			switch (monat){
			case 1: tagemonat = 0; break;
			case 2: tagemonat = 31; break;
			case 3: tagemonat = 59; break;
			case 4: tagemonat = 90; break;
			case 5: tagemonat = 120; break;
			case 6: tagemonat = 151; break;
			case 7: tagemonat = 181; break;
			case 8: tagemonat = 212; break;
			case 9: tagemonat = 243; break;
			case 10: tagemonat = 273; break;
			case 11: tagemonat = 304; break;
			case 12: tagemonat = 334; break;
			}
		}
		erg = ((jahr-1900)*365+(jahr-1900)/4+tagemonat+tage) % 7;
		
		switch (erg){
			case 0: System.out.println("Montag"); break;
			case 1: System.out.println("Dienstag"); break;
			case 2: System.out.println("Mittwoch"); break;
			case 3: System.out.println("Donnerstag"); break;
			case 4: System.out.println("Freitag"); break;
			case 5: System.out.println("Samstag"); break;
			case 6: System.out.println("Sonntag"); break;
		}
		
	}
}
