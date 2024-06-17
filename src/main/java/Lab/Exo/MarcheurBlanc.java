package Lab.Exo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@AllArgsConstructor
public class MarcheurBlanc {
    private final String nomDuMarcheur;
    private Lieu lieuActuel;
    private final Random random = new Random();

    public void marcherAleatoirement(Carte carte, String destination) {
        List<Lieu> marche = new ArrayList<>();
        marche.add(lieuActuel);

        while (!lieuActuel.getNomLieu().equals(destination)) {
            List<Rue> ruesPossibles = new ArrayList<>(lieuActuel.getRues());
            Rue rueChoisie = ruesPossibles.get(random.nextInt(ruesPossibles.size()));
            lieuActuel = rueChoisie.autreLieu(lieuActuel);
            marche.add(lieuActuel);
        }

        System.out.println("Marche de " + nomDuMarcheur + " :");
        marche.forEach(l -> System.out.println(l.getNomLieu()));
    }
}
