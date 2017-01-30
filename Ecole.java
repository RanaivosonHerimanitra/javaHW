//*****************************************************************************
// Ecole.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW2
//Réalisation d'une classe Ecole avec des methodes et tests de ces methodes
//*****************************************************************************


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ecole {
	// variable d'instance:
	private static String nomEcole;
	private static String nomVille;
	private static int nbEleve;
	private static Date anneeCreation;
	private enum Type  {primaire, secondaire, specialise};
	private Type type;    
	
	//---------------------------------------------------------------
	//Constructeur pour la classe Ecole:
	//---------------------------------------------------------------
	public Ecole() throws ParseException  {
		nomEcole = "uqtr";
		nomVille="trois-rivieres";
		nbEleve=10000;
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-mm-dd");
		anneeCreation= DateFormat.parse("2016-01-01");
		type = Type.secondaire;
	}
	
	//-------------------------------------------------------------------
	//Mutateur pour le Nb. Elèves
	//-------------------------------------------------------------------
	public void setNbEleve (int value) {
		nbEleve= value;
	}
	
	//--------------------------------------------------------------------
	//Accesseur pour le Nb. Elèves (pour tester dans Main)
	//--------------------------------------------------------------------
	public int getNbEleve() {
			return nbEleve;
	}	
		
	//--------------------------------------------------------------------
	//Accesseur pour Année de creation
	//--------------------------------------------------------------------
	public Date getAnneeCreation() {
		return anneeCreation;
	}	
	
	//--------------------------------------------------------------------
	// méthode conversion en String de n'importe quelle var.
	//--------------------------------------------------------------------
	public String toString (Object input) {
		//return String.valueOf(input);
		return input.toString();
	} 
	
	//--------------------------------------------------------------------
	//accesseur noms Ecole,Ville pour pouvoir tester après:
	//--------------------------------------------------------------------
	public String getNomEcole() {
		return nomEcole;
	}
	public String getNomVille() {
		return nomVille;
	}
	
	//Test des méthodes de la classe:
	//--------------------------------------------------------------------
	public static void main(String[] args) throws ParseException {
		Ecole myecole = new Ecole();
		
		//accesseur annee creation:
		System.out.println("Annee de creation(accesseur): " + myecole.getAnneeCreation() );
		
		//voir valeur par defaut:
		System.out.println("Nb. Eleve par defaut: " + myecole.getNbEleve()) ;
		
		//mutateur pour le Nb Eleve:
		myecole.setNbEleve(15000) ;
		
		//voir le changement:
		System.out.println("Nb. Eleve apres mutation: " + myecole.getNbEleve()) ;
		
		//conversion en String de n'importe quelle variable de la classe:
		System.out.println( "Conversion nom Ecole: "+ myecole.toString(myecole.getNomEcole()) );
		System.out.println( "Conversion nom Ville: "+ myecole.toString(myecole.getNomVille()) );
		System.out.println( "Conversion Type Etab.: "+ myecole.toString(myecole.type));
		System.out.println( "Conversion Annee Crea.: "+ myecole.toString(myecole.getAnneeCreation()));
		
		
	}
}

