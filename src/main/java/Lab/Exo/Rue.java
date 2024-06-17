package Lab.Exo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rue {

    private final Lieu lieu1;
    private final Lieu lieu2;
    private String nomRue;

    public Lieu autreLieu(Lieu lieu) {
        if (lieu.equals(lieu1)) {
            return lieu2;
        } else if (lieu.equals(lieu2)) {
            return lieu1;
        } else {
            throw new IllegalArgumentException("Le lieu spécifié n'est pas connecté par cette rue.");
        }
    }
}
