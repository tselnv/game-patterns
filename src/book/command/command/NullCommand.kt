package book.command.command

import book.command.actors.GameActor

class NullCommand: Command() {
    override fun execute(actor: GameActor) {

    }
}