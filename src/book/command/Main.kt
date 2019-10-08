package book.command

import book.command.actors.GameActor
import book.command.command.InputHandler

class Main {

    val actor = GameActor()

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val inputHandler = InputHandler()
            val main = Main()

            while (true) {
                //inputHandler.handleInput(main);
            }
        }
    }
}
