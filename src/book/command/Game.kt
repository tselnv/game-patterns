package book.command

import book.command.actors.GameActor
import book.command.command.InputHandler

class Game {

    val actor = GameActor()

    fun run () {
        val inputHandler = InputHandler();

        while (true) {
            inputHandler.handleInput(this);
        }
    }
}

fun main(args: Array<String>) {
    val game = Game();
    game.run();
}