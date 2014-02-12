package metier;

import java.util.ArrayList;

public class Region {
	/**
	 * Code insee de la r�gion
	 */
	private int codeInsee;
	/**
	 * Nom de la r�gion
	 */
	private String nom;
	/**
	 * Liste des d�partements de la r�gion
	 */
	private ArrayList<Departement> lesDepartements;
	/**
	 * Constructeur de la classe Region
	 * @param unCodeInsee	le code insee de la nouvelle Region
	 * @param unNom			le nom de la nouvelle Region
	 */
	public Region(int unCodeInsee, String unNom){
		this.codeInsee = unCodeInsee;
		this.nom = unNom;
		this.lesDepartements = new ArrayList<Departement>();
	}
	
	/**
	 * Getteur sur l'attribut codeInsee
	 * @return	le code insee
	 */
	public int getCodeInsee(){
		return this.codeInsee;
	}

	/**
	 * Getteur sur l'attribut nom
	 * @return	le nom
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * M�thode qui ajoute un nouveau Departement � la Region
	 * @param unDepartement		le d�partement � ajouter
	 */
	public void ajouteUnDepartement(Departement unDepartement){
		this.lesDepartements.add(unDepartement);
	}


}
