package exercicio3;

import exercicio3.model.Console;
import exercicio3.model.Game;
import exercicio3.model.Jogo;

public class TestaGame {
    public static void main(String[] args) {
        Game game = new Game(1, "FIFA 22", "EA SPORTS", 2022, 299.99);
        Game game1 = new Game(2, "GTA 5 (GRAND THEFT AUTO V)", "ROCKSTAR GAMES",
                2013, 149.99);

        game.visualizar();
        game1.visualizar();

        //Exercicio dia 04/11/22
        Game console = new Console(3, "DOOM: ANIQUILAÇÃO", "ID SOFTWARE", 2020, 59.99, "PS4");
        Game console2 = new Console(4, "Among US", "INNERSLOTH", 2019, 29.99, "PC");
        console.visualizar();
        console2.visualizar();

        Game jogo = new Jogo(5, "MORTAL KOMBAT", "NETHERREALM STUDIOS", 2021, 99.90, "+18");
        Game jogo1 = new Jogo(6, "COUNTER-STRIKE: GLOBAL OFFENSIVE (CS:GO)", "VALVE CORPORATION", 2012, 24.99, "+12");
        jogo.visualizar();
        jogo1.visualizar();

    }
}
