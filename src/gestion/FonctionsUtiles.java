package gestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.Scanner;
/**
 * Classe proposant des m�thodes statiques c'est-�-dire des m�thodes pouvant �tre appel�es sans instance de classe.
 * @author Xa
 *
 */
public class FonctionsUtiles {
	
	/**
	 * M�thode permettant de lire un fichier et de retourner l'int�gralit� de son contenu 
	 * sous forme d'un tableau de String � deux dimensions
	 * @param nomFichier	le nom du fichier (avec extension) � lire
	 * @return				un tableau de String � deux dimensions
	 */
	public static String[][] lectureFichier(String nomFichier){
		String[][] tabRetour = null;
		Scanner scan;
		int i=0;
		try {
			scan = new Scanner(new File(nomFichier));
			String ligne = scan.nextLine();
			while (scan.hasNextLine()) {
			    ligne = scan.nextLine();
			    i++;
			}
			tabRetour = new String[i][];
			i=0;
			scan = new Scanner(new File(nomFichier));
			ligne = scan.nextLine();
			while (scan.hasNextLine()) {
			    ligne = scan.nextLine();
			    tabRetour[i] = ligne.split(";");
			    i++;
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		return tabRetour;
	}
	
	/**
	 * M�thode permettant de formater une cha�ne de caract�res 
	 * c'est-�-dire de supprimer les pr�fixes (la-le-les...) et les accents<BR/>
	 * <I>Exemples de r�sultats</I><BR/>
	 * <UL><LI>"mirande" retournera "MIRANDE"</LI>
	 * <LI>"les hays" retournera "HAYS"</LI>
	 * <LI>"G�rardmer" retournera "GERARDMER"</LI></UL>
	 * @param uneChaine		la cha�ne � formater
	 * @return				la cha�ne format�e
	 */
	public static String retourneChaineFormatee(String uneChaine){
		String uneChaineFormatee = "";
		uneChaine = uneChaine.toUpperCase();
		if (uneChaine.startsWith("L'")){
			for(int i=2;i<uneChaine.length();i++)
				uneChaineFormatee+=uneChaine.charAt(i);
		}
		else if (uneChaine.startsWith("LA ")||uneChaine.startsWith("LE ")){
			for(int i=3;i<uneChaine.length();i++)
				uneChaineFormatee+=uneChaine.charAt(i);
		}
		else if(uneChaine.startsWith("LES ")||uneChaine.startsWith("LOS ")||uneChaine.startsWith("AUX ")){
			for(int i=4;i<uneChaine.length();i++)
				uneChaineFormatee+=uneChaine.charAt(i);
		}
		else
			uneChaineFormatee=uneChaine;
		uneChaineFormatee = Normalizer.normalize(uneChaineFormatee, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
		return uneChaineFormatee;
	}

}
