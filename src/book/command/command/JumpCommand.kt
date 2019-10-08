package book.command.command

import book.command.actors.GameActor

class JumpCommand: Command() {
    override fun execute(actor: GameActor) {
        jump();
    }

    private fun jump() {
        println("Jump")
    }

}