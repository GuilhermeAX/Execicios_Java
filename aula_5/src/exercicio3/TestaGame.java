package exercicio3;

import exercicio3.model.Console;
import exercicio3.model.Game;
import exercicio3.model.Jogo;

public class TestaGame {
    public static void main(String[] args) {
        Game game = new Game(1, "FIFA 22", "XBOX ONE", 2022, 299.99);
        Game game1 = new Game(2, "GTA 5 (GRAND THEFT AUTO V)", "PLAYSTATION 5",
                2013, 149.99);

        game.visualizar();
        game1.visualizar();

        //Exercicio dia 04/11/22
        Game console = new Console(3,"DOOM: ANIQUILAÇÃO","PLAYSTATION",2020,59.99,"PS4");
        Game console2 = new Console(4,"Among US","PC",2019,29.99,"DirectX 10");
        console.visualizar();
        console2.visualizar();

        Game jogo = new Jogo(1, "MORTAL KOMBAT", "XBOX",2021,99.90,"+18");
        Game jogo1 = new Jogo(2, "COUNTER-STRIKE: GLOBAL OFFENSIVE (CS:GO)","PC",2012,24.99,"+12");
        jogo.visualizar();
        jogo1.visualizar();

    }
}
