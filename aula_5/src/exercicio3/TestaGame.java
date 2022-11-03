package exercicio3;

import exercicio3.model.Game;

public class TestaGame {
    public static void main(String[] args) {
        Game game = new Game(1, "FIFA 22", "XBOX ONE", 2022, 299.99);
        Game game1 = new Game(2, "GTA 5 (GRAND THEFT AUTO V)", "PLAYSTATION 5",
                2013, 149.99);

        game.visualizar();
        game1.visualizar();

    }
}
