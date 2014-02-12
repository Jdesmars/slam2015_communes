package conteneur;

import java.util.ArrayList;

import metier.Departement;
import metier.Region;

public class ConteneurDepartements {
	/**
	 * Collection d'objets Departement sous la forme d'un ArrayList
	 * @see ArrayList
	 */
	private ArrayList<Departement> tousLesDepartements;
	
	/**
	 * Constructeur de la classe ConteneurDepartements
	 */
	public ConteneurDepartements(){
		this.tousLesDepartements = new ArrayList<Departement>();
	}
	

	/**
	 * M�thode qui ajoute un objet Departement dans le conteneur
	 * @param unCodeInsee	le code insee du nouveau Departement � ajouter
	 * @param unNom			le nom du nouveau Departement � ajouter
	 * @param uneRegion		la r�gion du nouveau Departement � ajouter
	 */
	public void ajouteUnDepartement(String unCodeInsee, String unNom, Region uneRegion){
		this.tousLesDepartements.add(new Departement(unCodeInsee,unNom,uneRegion));
	}
	
	/**
	 * M�thode qui retourne un objet Departement � partir d'un code insee
	 * @param unCodeInsee	le code insee recherch�
	 * @return				un objet Departement dont le code est �gal � celui pass� en param�tre (ou null)
	 */
	public Departement donneDepartementDepuisCodeInsee(String unCodeInsee) {
		Departement leBonDepartement = null;
		int i=0;
		boolean trouve = false;
		while ((!trouve)&&(i<this.tousLesDepartements.size())){
			if(this.tousLesDepartements.get(i).getCodeInsee().equals(unCodeInsee)){
				trouve = true;
				leBonDepartement = this.tousLesDepartements.get(i);
			}
			else
				i++;
		}
		return leBonDepartement;
	}
}
