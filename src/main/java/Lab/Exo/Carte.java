package Lab.Exo;

import java.util.List;
import java.util.ArrayList;

public class Carte {
    public final List<Lieu> lieux = new ArrayList<>();

    public void ajouterLieu(Lieu lieu) {
        lieux.add(lieu);
    }

    public Lieu obtenirLieu(String nom) {
        for (Lieu lieu : lieux) {
            if (lieu.getNomLieu().equals(nom)) {
                return lieu;
            }
        }
        return null;
    }

    public void ajouterRue(String nomRue, String nomLieu1, String nomLieu2) {
        Lieu lieu1 = obtenirLieu(nomLieu1);
        Lieu lieu2 = obtenirLieu(nomLieu2);
        if (lieu1 != null && lieu2 != null) {
            Rue rue = new Rue(lieu1, lieu2, nomRue);
            lieu1.ajouterRue(rue);
            lieu2.ajouterRue(rue);
        }
    }
}
