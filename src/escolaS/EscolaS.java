package escolaS;

import Views.TelaInicial;
import java.util.ArrayList;

public class EscolaS {

    public static ArrayList<Pessoa> ListaDePessoas = new ArrayList<>();

    public static void main(String[] args) {

        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
    }

}
