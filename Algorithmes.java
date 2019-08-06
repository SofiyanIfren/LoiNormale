import java.util.ArrayList;
import java.util.List;

public class Algorithmes {
	
	/**
	 * @author Sofiyan Ifren
	 * @return Retourne une liste de valeurs épurée au-delà et en-deça de lécart-type (loi normale)
	 */
	public List<Long> gaussianFunction (List<Long> listeDonnees){
		List<Long> listeFinale = new ArrayList<Long>();
		// Utilisation de cette fonction uniquement si la liste n'est pas vide
		if (!listeDonnees.isEmpty()) {
			// 1. Obtention de la moyenne
			long total = 0;
			for (long data : listeDonnees) {
				total += data;
			}
			long moyenne = total / listeDonnees.size();
			
			// 2. Calcul de la variance
			long variance = 0;
			long sommeDesCarres = 0;
			for (long data : listeDonnees) {
				// mise au carré de chaque opération (Xi - moyenne)
				long carreDesSommes = (data-moyenne)*(data-moyenne);
				sommeDesCarres += carreDesSommes;
			}
			variance = sommeDesCarres / (listeDonnees.size()-1);
			
			// 3. Calcul de l'écart-type
			long ecartType = (long) Math.sqrt(variance);
			long valeurMax = moyenne + ecartType;
			long valeurMin = moyenne - ecartType;
			
			// 4. Tri des valeurs de la liste initiale
			for (long data : listeDonnees) {
				if (data < valeurMax && data > valeurMin){
					listeFinale.add(data);
				}
			}
		}
		return listeFinale;
	}

}
