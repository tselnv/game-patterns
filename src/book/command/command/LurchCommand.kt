package book.command.command

import book.command.actors.GameActor

class LurchCommand: Command(){
    override fun execute(actor: GameActor) {
        lurch();
    }

    private fun lurch() {
        println("lurch")
    }

}