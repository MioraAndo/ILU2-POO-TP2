package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public String afficherMarche(String nomAcheteur) {
		String infosMarche=controlAfficherMarche.donnerInfosMarche();
		return infosMarche;
		//a finir et a corriger
		
	}
	
}
