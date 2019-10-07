package book.command

import book.actors.GameActor

class JumpCommand: Command() {
    override fun execute(actor: GameActor) {
        jump();
    }

    private fun jump() {
        println("Jump")
    }

}