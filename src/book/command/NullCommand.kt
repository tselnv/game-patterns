package book.command

import book.actors.GameActor

class NullCommand: Command() {
    override fun execute(actor: GameActor) {

    }
}