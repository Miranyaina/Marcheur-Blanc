package Lab.Test;

import Lab.Exo.Carte;
import Lab.Exo.Lieu;
import Lab.Exo.MarcheurBlanc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDuMarcheurBlanc {
    private Carte carte;
    private MarcheurBlanc marcheurBlanc;

    @BeforeEach
    public void setUp() {
        carte = new Carte();
        Lieu numero1 = new Lieu("HEI");
        Lieu numero2 = new Lieu("Pullman");
        Lieu numero3 = new Lieu("Balançoire");
        Lieu numero4 = new Lieu("Tour Orange");
        Lieu numero5 = new Lieu("ESTI");

        carte.ajouterLieu(numero1);
        carte.ajouterLieu(numero2);
        carte.ajouterLieu(numero3);
        carte.ajouterLieu(numero4);
        carte.ajouterLieu(numero5);

        carte.ajouterRue("Andriatsihoarana", "HEI", "Pullman");
        carte.ajouterRue("Ranaivo", "Pullman", "Balançoire");
        carte.ajouterRue("Rue sans nom", "Balançoire", "Tour Orange");
        carte.ajouterRue("Rue sans Nom", "Tour Orange", "ESTI");

        marcheurBlanc = new MarcheurBlanc("Bjarni", numero1);
    }

    @Test
    public void testMarcheAleatoire() {
        marcheurBlanc.marcherAleatoirement(carte, "ESTI");
        assertEquals("ESTI", marcheurBlanc.getLieuActuel().getNomLieu());
    }
}
