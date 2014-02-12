package metier;

import java.util.ArrayList;

public class Departement {

	/**
	 * Code insee du d�partement
	 */
	private String codeInsee;
	/**
	 * Nom du d�partement
	 */
	private String nom;
	/**
	 * R�gion du d�partement
	 */
	private Region laRegion;
	/**
	 * Liste des communes du d�partement
	 */
	private ArrayList<Commune> lesCommunes;
	
	/**
	 * Constructeur de la classe Departement<BR/>
	 * Ce constructeur permet �galement d'ajouter ce nouveau d�partement � la r�gion pass�e en param�tre
	 * @param unCodeInsee	le code insee du nouveau Departement
	 * @param unNom			le nom du nouveau Departement
	 * @param uneRegion		la r�gion du nouveau Departement
	 */
	public Departement(String unCodeInsee, String unNom, Region uneRegion){
		this.codeInsee = unCodeInsee;
		this.nom = unNom;
		this.laRegion = uneRegion;
		this.lesCommunes = new ArrayList<Commune>();
		this.laRegion.ajouteUnDepartement(this);
	}
	/**
	 * M�thode qui ajoute une nouvelle Commune au Departement
	 * @param uneCommune	la commune � ajouter
	 */
	public void ajouteUneCommune(Commune uneCommune){
		this.lesCommunes.add(uneCommune);
	}
	/**
	 * Getteur sur l'attribut codeInsee
	 * @return	le code insee
	 */
	public String getCodeInsee(){
		return this.codeInsee;
	}
	
	/**
	 * Getteur sur l'attribut nom
	 * @return	le nom
	 */
	public String getNom(){
		return this.nom;
	}
	
	/**
	 * Getteur sur l'attribut laRegion
	 * @return	la r�gion
	 */
	public Region getLaRegion(){
		return this.laRegion;
	}
	
}
