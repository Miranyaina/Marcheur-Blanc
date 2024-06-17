package Lab.Exo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;


@Getter
@AllArgsConstructor
public class Lieu {
    private String nomLieu;
    private final List<Rue> rues = new ArrayList<>();

    public void ajouterRue(Rue rue) {
        rues.add(rue);
    }
}
