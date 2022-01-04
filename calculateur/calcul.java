//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calcul {
	
	public static ArrayList<String> bonsResultats = new ArrayList<String>();

	public static void DemanderResultats(){
		var res="l";
		Terminal.ecrireString("Equipe Gagnante (double entrée pour finir)");
		boolean tourner = true;
		while (tourner==true){
			Terminal.ecrireString(" / ");
			res = Terminal.lireString();
			if (res!=""){
				bonsResultats.add(res);
			}else{
				tourner = false;
			}
		}
		//Ajout des bonus
		int sansbonus = bonsResultats.size();
		for (int i=0;i<sansbonus;i++){
			bonsResultats.add(bonsResultats.get(i)+" Bonus");
		}
	}

	public static void AfficherResultats(){
		for (int i=0;i<bonsResultats.size();i++){
			Terminal.ecrireString(bonsResultats.get(i)+ " ");
		}
	}

	public static int RetournerPts(String ligne){
		//Résultats bons au format string
		String StringBonsResultats = ListToString(bonsResultats);
		//Pronos du joueur au format liste
		List<String> listeProno = new ArrayList<String>();
		listeProno = StringToList(ligne);
		int pts=0;
		//Parcours de la liste qui comprend les résultats du joueur
		for (int i=0;i<listeProno.size();i++){
			//BONUS
			if ((listeProno.get(i)).contains("Bonus")){
				//GAGNE
				if (StringBonsResultats.contains(listeProno.get(i))){
					pts+=2;
				}else{
					//PERDU
					pts-=3;
				}
			}else{
				//SANS BONUS
				//GAGNE
				if (StringBonsResultats.contains(listeProno.get(i))){
					pts+=1;
				}
			}
		}
		return pts;
	}

	public static List<String> StringToList(String ligne){
		List<String> list = new ArrayList<>(Arrays.asList(ligne.split(",")));
		return list;
	}
	
	public static String ListToString(List<String> liste){
		String string="";
		for (int i=0;i<liste.size();i++){
			string += liste.get(i);
		}
		return string;
	}
	
	public static void main (String [] arguments) {
		
		DemanderResultats();
		//AfficherResultats();
		String autreJoueur = "";
		while(autreJoueur==""){
			Terminal.sautDeLigne();
			Terminal.ecrireString("Joueur :");
			var pseudo = Terminal.lireString();
			Terminal.ecrireString("Copier ici le csv :");
			var ligne = Terminal.lireString();
			var pts = RetournerPts(ligne);
			Terminal.ecrireStringln(pseudo + " a " + pts + "pts cette nuit");
			Terminal.ecrireStringln("Appuyez sur entrer pour saisir un autre joueur");
			autreJoueur = Terminal.lireString();
		}
		
	}
}
