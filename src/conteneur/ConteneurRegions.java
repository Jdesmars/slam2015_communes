package conteneur;

import java.util.ArrayList;
import metier.Region;

public class ConteneurRegions {
	/**
	 * Collection d'objets Region sous la forme d'un ArrayList
	 * @see ArrayList
	 */
	private ArrayList<Region> toutesLesRegions;
	
	/**
	 * Constructeur de la classe ConteneurRegions
	 */
	public ConteneurRegions(){
		this.toutesLesRegions = new ArrayList<Region>();
	}
	
	/**
	 * M�thode qui ajoute un objet Region dans le conteneur
	 * @param unCodeInsee	le code insee de la nouvelle Region � ajouter
	 * @param unNom			le nom de la nouvelle Region � ajouter
	 */
	public void ajouteUneRegion(int unCodeInsee, String unNom) {
		this.toutesLesRegions.add(new Region(unCodeInsee,unNom));
	}

	/**
	 * M�thode qui retourne un objet Region � partir d'un code insee
	 * @param unCodeInsee	le code insee recherch�
	 * @return				un objet Region dont le code est �gal � celui pass� en param�tre (ou null)
	 */
	public Region donneRegionDepuisCodeInsee(int unCodeInsee) {
		Region laBonneRegion = null;
		int i=0;
		boolean trouve = false;
		while ((!trouve)&&(i<this.toutesLesRegions.size())){
			if(this.toutesLesRegions.get(i).getCodeInsee()==unCodeInsee){
				trouve = true;
				laBonneRegion = this.toutesLesRegions.get(i);
			}
			else
				i++;
		}
		return laBonneRegion;
	}

}
