package paczka;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import paczka.Przejscia;
import paczka.Cykle;
public class Zapis_Makra {
	

	public static void main(String[] args) throws FileNotFoundException{
		 PrintWriter zapis = new PrintWriter("makro.txt");
		 
		  
		  
		  zapis.println (Cykle.cykl30);
		  
		  zapis.println (Przejscia.classprzejscie_31_60);
		  
		  zapis.println (Cykle.cykl30);
		  
		  zapis.println (Przejscia.classprzejscie_61_90);
		  
		  zapis.println (Cykle.cykl30);
		  
		  zapis.println (Przejscia.classprzejscie_91_100);
		  
		  zapis.println (Cykle.cykl10);
		  
		  zapis.close();
	  }
	}
	


