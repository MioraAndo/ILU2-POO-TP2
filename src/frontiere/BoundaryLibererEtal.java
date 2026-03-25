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
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui ! \n");
		}
		else {
			String[] donneesEtal=controlLibererEtal.libererEtal(nomVendeur);
			Boolean etalOccupe=Boolean.valueOf(donneesEtal[0]);
			if(etalOccupe) {
				System.out.println("Vous avez vendu " + donneesEtal[4] + " sur "+ donneesEtal[3] + " "+ donneesEtal[2]);
				System.out.println("En revoir " + nomVendeur + ", passez une bonne journée.\n");
			}
			
		}
		
	}

}
