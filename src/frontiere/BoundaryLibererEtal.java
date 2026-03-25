package frontiere;

import controleur.ControlLibererEtal;
import villagegaulois.*;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		Boolean vendeurReconnu=controlLibererEtal.isVendeur(nomVendeur);
		if(!vendeurReconnu) {
			System.out.println("Mais vous n'petes pas inscrit sur notre marché aujourd'hui ! \n");
		}
		else {
			controlLibererEtal.libererEtal(nomVendeur);
		}
		//a continuer
	}

}
