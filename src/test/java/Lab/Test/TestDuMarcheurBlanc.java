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
        Lieu numero1 = new Lieu("Marais");
        Lieu numero2 = new Lieu("Sekolintsika");
        Lieu numero3 = new Lieu("HEI");
        Lieu numero4 = new Lieu("Pullman");
        Lieu numero5 = new Lieu("Balançoire");
        Lieu numero6 = new Lieu("Boulevard de l'Europe");
        Lieu numero7 = new Lieu("ESTI");

        carte.ajouterLieu(numero1);
        carte.ajouterLieu(numero2);
        carte.ajouterLieu(numero3);
        carte.ajouterLieu(numero4);
        carte.ajouterLieu(numero5);
        carte.ajouterLieu(numero6);
        carte.ajouterLieu(numero7);

        carte.ajouterRue("Rue sans nom", "Marais", "Sekolintsika");
        carte.ajouterRue("Rue sans nom", "Ny Sekolintsika", "HEI");
        carte.ajouterRue("Andriatsihoarana", "HEI", "Pullman");
        carte.ajouterRue("Ranaivo", "Pullman", "Balançoire");
        carte.ajouterRue("Rue sans nom", "Balançoire", "Boulevard de l'Europe");
        carte.ajouterRue("Rue sans nom", "Boulevard de l'Europe", "ESTI");

        marcheurBlanc = new MarcheurBlanc("Bjarni", numero3);
    }

    @Test
    public void testMarcheAleatoire() {
        marcheurBlanc.marcherAleatoirement(carte, "ESTI");
        assertEquals("ESTI", marcheurBlanc.getLieuActuel().getNomLieu());
    }
}